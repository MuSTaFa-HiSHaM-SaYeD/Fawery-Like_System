package com.swAssignment.fawrysystem.models.transactions;

public class Transaction {
	protected String email;
	protected double amount;
	public Transaction(String email,double amount) {
		this.email=email;
		this.amount=amount;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}

}
