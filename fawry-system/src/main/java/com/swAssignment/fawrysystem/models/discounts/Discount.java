package com.swAssignment.fawrysystem.models.discounts;

public class Discount {
	
    protected double percentage;
    protected String name;
	public Discount(String name,double percentage) {
    	this.name=name;
    	this.percentage=percentage;
    }
	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
      
}
