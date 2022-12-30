package com.swAssignment.fawrysystem.BSL.transactions.transactions;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.swAssignment.fawrysystem.BSL.transactions.PaymentTransactionBsl;
import com.swAssignment.fawrysystem.models.transactions.PaymentTransaction;
import com.swAssignment.fawrysystem.models.transactions.Transaction;

@RestController
public class PaymentTransactionController {
    private PaymentTransactionBsl paymentTransactionBsl;
    public PaymentTransactionController(PaymentTransactionBsl paymentTransactionBsl) {
    	this.paymentTransactionBsl=paymentTransactionBsl;
    }
	@GetMapping(value = "/admin/Transactions/paymentTransactions/get")
    public ArrayList<PaymentTransaction> getPaymentTransactions(){
		ArrayList<PaymentTransaction> paymentTransactions = new ArrayList<>();
		for(Transaction transaction : paymentTransactionBsl.getTransactions()) {
			paymentTransactions.add((PaymentTransaction) transaction);
		}
   	 return paymentTransactions;
    }
}
