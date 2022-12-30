package com.swAssignment.fawrysystem.BSL.transactions.transactions;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swAssignment.fawrysystem.BSL.transactions.RefundTransactionBsl;
import com.swAssignment.fawrysystem.models.transactions.RefundTransaction;
import com.swAssignment.fawrysystem.models.transactions.Transaction;



@RestController
public class RefundTransactionController{
	private RefundTransactionBsl refundTransactionBsl;
	public RefundTransactionController(RefundTransactionBsl refundTransactionBsl) {
		this.refundTransactionBsl=refundTransactionBsl;
	}
	
	@GetMapping(value = "/admin/Transactions/refundTransactions/get")
    public ArrayList<RefundTransaction> getRefundTransactions(){
		ArrayList<RefundTransaction> refundTransactions = new ArrayList<>();
		for(Transaction transaction : refundTransactionBsl.getTransactions()) {
			refundTransactions.add((RefundTransaction) transaction);
		}
   	   return refundTransactions;
   }
	
}
