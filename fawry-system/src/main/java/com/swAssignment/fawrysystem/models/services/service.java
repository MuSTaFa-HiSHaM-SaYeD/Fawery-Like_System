package com.swAssignment.fawrysystem.models.services;

import java.util.ArrayList;

import com.swAssignment.fawrysystem.models.discounts.Discount;

public class service {
    protected ArrayList<Discount> discounts;
    public service() {
    	discounts = new ArrayList<>();
    }

	public ArrayList<Discount> getDiscounts() {
		return discounts;
	}

	public void setDiscounts(ArrayList<Discount> discounts) {
		this.discounts = discounts;
	}
	
	public void addDiscount(Discount discount) {
		discounts.add(discount);
	}
}
