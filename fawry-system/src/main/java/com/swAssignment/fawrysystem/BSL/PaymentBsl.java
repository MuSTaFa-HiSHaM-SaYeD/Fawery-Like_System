package com.swAssignment.fawrysystem.BSL;

import org.springframework.stereotype.Service;

import com.swAssignment.fawrysystem.Cash;
import com.swAssignment.fawrysystem.Common;
import com.swAssignment.fawrysystem.Creditcard;
import com.swAssignment.fawrysystem.Payment;
import com.swAssignment.fawrysystem.BSL.transactions.PaymentTransactionBsl;
import com.swAssignment.fawrysystem.models.forms.payment_forms.PaymentForm;
import com.swAssignment.fawrysystem.models.transactions.PaymentTransaction;



@Service
public class PaymentBsl extends Common{
	private Payment payment;
	private PaymentTransactionBsl paymentTransactionBsl;
     public PaymentBsl(UserBsl userbsl,PaymentTransactionBsl paymentTransactionBsl) {
		super(userbsl);
		this.paymentTransactionBsl=paymentTransactionBsl;
	 }
     public String handlePaymentOperation(PaymentForm form,String serviceName,String key,int index) {
    	 switch(form.getPaymentMethod()) {
 		case "Wallet":
 			if(userbsl.getUsers().get(index).getWallet().pay(form.getAmount())) {
 				userbsl.getUsers().get(index).addTransaction(new PaymentTransaction(form.getUserEmail(),form.getAmount(),serviceName,form.getPaymentMethod()));
 				paymentTransactionBsl.addTransaction(new PaymentTransaction(form.getUserEmail(),form.getAmount(),serviceName,form.getPaymentMethod()));
 				return "Done";
 			}
 			return "Your wallet balance is not enough to pay";
 		case "Cash":
 			payment = new Cash();
 			userbsl.getUsers().get(index).addTransaction(new PaymentTransaction(form.getUserEmail(),form.getAmount(),serviceName,form.getPaymentMethod()));
 			paymentTransactionBsl.addTransaction(new PaymentTransaction(form.getUserEmail(),form.getAmount(),serviceName,form.getPaymentMethod()));
 			return "You should go to any fawry machine to pay "+form.getAmount()+" L.E before the end of the next day";
 		default:
 			payment = new Creditcard();
 			if(payment.pay(form.getAmount())) {
 				userbsl.getUsers().get(index).addTransaction(new PaymentTransaction(form.getUserEmail(),form.getAmount(),serviceName,"Creditcard"));;
 				paymentTransactionBsl.addTransaction(new PaymentTransaction(form.getUserEmail(),form.getAmount(),serviceName,"Creditcard"));
 				return "Done";
 			}
 			return "Your creditcard balance is not enough to pay";
 		}
     }
}
