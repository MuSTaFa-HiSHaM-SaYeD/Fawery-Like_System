package com.swAssignment.fawrysystem;

public class Wallet implements Payment{
	private Payment creditcard;
	double amount=1000.0;
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	@Override
	public boolean pay(double amount) {
		if(this.amount>=amount) {
			this.amount-=amount;
			return true;
		}
		return false;
	}

	
	public boolean deposite(double amount) {
		 creditcard =  new Creditcard();
		if(creditcard.pay(amount)) {
			this.amount+=amount;
			return true;
		}
		return false;
	}
	
	public void increase(double amount) {
		this.amount+=amount;
	}

}
