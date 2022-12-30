package com.swAssignment.fawrysystem.BSL.transactions;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swAssignment.fawrysystem.Common;
import com.swAssignment.fawrysystem.BSL.RefundRequestBsl;
import com.swAssignment.fawrysystem.BSL.UserBsl;
import com.swAssignment.fawrysystem.models.RefundRequest;
import com.swAssignment.fawrysystem.models.forms.RefundRequestForm;
import com.swAssignment.fawrysystem.models.transactions.PaymentTransaction;
import com.swAssignment.fawrysystem.models.transactions.RefundTransaction;
import com.swAssignment.fawrysystem.models.transactions.Transaction;

@RestController
public class RefundRequestController extends Common{
    private RefundRequestBsl refundRequestBsl;
    private PaymentTransactionBsl paymentTransactionBsl;
    private RefundTransactionBsl refundTransactionBsl;
	public RefundRequestController(UserBsl userbsl,RefundRequestBsl refundRequestBsl,PaymentTransactionBsl paymentTransactionBsl,RefundTransactionBsl refundTransactionBsl) {
		super(userbsl);
		this.refundRequestBsl=refundRequestBsl;
		this.paymentTransactionBsl=paymentTransactionBsl;
		this.refundTransactionBsl=refundTransactionBsl;
	}
	@PostMapping(value = "/refundRequest/send")
	public String makeRefundRequest(@RequestBody RefundRequestForm refundRequestForm) {
		int index=userbsl.signin(refundRequestForm.getUserEmail(), refundRequestForm.getUserPassword());
		if(index!=-1) {
			refundRequestBsl.addRefundRequest(new RefundRequest(refundRequestForm.getUserEmail(),
					refundRequestForm.getAmount(),refundRequestForm.getServiceName(),index));
			return "refund request sent successfully";
		}
		return "Authentication failed try again";
	}
	@GetMapping(value = "/admin/refundRequest/get")
	public ArrayList<RefundRequest> getRefundRequests(){
		return refundRequestBsl.getRefundRequests();
	}
	@GetMapping(value = "/admin/refundRequest/approve")
	public ArrayList<String> approveRefundRequests() {
		ArrayList<String> responses = new ArrayList<>();
		for(RefundRequest refundRequest : refundRequestBsl.getRefundRequests()) {
			int indx=-1;
			int j=0;
			for(Transaction paymentTransaction : paymentTransactionBsl.getTransactions()) {
				if(refundRequest.getServiceName().equals(((PaymentTransaction) paymentTransaction).getServiseName())
						&& refundRequest.getAmount()==((PaymentTransaction) paymentTransaction).getAmount() &&
						refundRequest.getUserEmail().equals(((PaymentTransaction) paymentTransaction).getEmail())) {
					responses.add("Refund request of "+refundRequest.getUserEmail()+" with amount : "+refundRequest.getAmount()+
							" and servicename : "+refundRequest.getServiceName()+" has been approved successfully and the funds added to wallet");
					userbsl.getUsers().get(refundRequest.getUserIndex()).getWallet().increase(refundRequest.getAmount());
					refundTransactionBsl.addTransaction(new RefundTransaction(refundRequest.getUserEmail(),refundRequest.getAmount(),refundRequest.getServiceName()));
					indx=j;
					break;
				}
				j++;
			}
			if(indx!=-1) {
				paymentTransactionBsl.deleteTransaction(indx);
			}
		}
		refundRequestBsl.clearRefundRequests();
		return responses;
	}
}
