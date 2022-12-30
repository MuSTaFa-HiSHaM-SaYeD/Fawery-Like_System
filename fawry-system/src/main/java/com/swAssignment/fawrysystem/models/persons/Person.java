package com.swAssignment.fawrysystem.models.persons;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.swAssignment.fawrysystem.models.transactions.Transaction;

public class Person {
	protected String username;
	protected String password;
	protected ArrayList<Transaction> transactions;
	public Person() {
		transactions = new ArrayList<>();
	}
	public String getUsername() {
		return username;
	}
	public ArrayList<Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(ArrayList<Transaction> transactions) {
		this.transactions = transactions;
	}
	public void addTransaction(Transaction transaction) {
		transactions.add(transaction);
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
