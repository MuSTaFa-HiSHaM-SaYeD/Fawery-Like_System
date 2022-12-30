package com.swAssignment.fawrysystem;

import org.springframework.stereotype.Component;

@Component
public class Creditcard implements Payment{
	
	double amount = 1000.0;
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
		this.amount+=amount;
		return true;
	}

}
