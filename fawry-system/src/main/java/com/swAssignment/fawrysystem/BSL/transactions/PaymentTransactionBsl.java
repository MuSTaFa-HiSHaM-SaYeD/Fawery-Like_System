package com.swAssignment.fawrysystem.BSL.transactions;
import org.springframework.stereotype.Service;

@Service
public class PaymentTransactionBsl extends TransactionBsl{
     
	public void deleteTransaction(int index) {
		transactions.remove(index);
	}
}
