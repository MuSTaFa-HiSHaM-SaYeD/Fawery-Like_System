package com.swAssignment.fawrysystem.BSL.transactions;
import java.util.ArrayList;

import com.swAssignment.fawrysystem.models.transactions.Transaction;

public class TransactionBsl {
	protected ArrayList<Transaction> transactions;
	public TransactionBsl() {
		transactions = new ArrayList<>();
	}
	public void addTransaction(Transaction transaction) {
		transactions.add(transaction);
	}
	public ArrayList<Transaction> getTransactions(){
		return transactions;
	}
}
