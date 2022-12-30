package com.swAssignment.fawrysystem.models.transactions;

public class PaymentTransaction extends Transaction{
	private String serviseName;
	private String paymentMethod;
	public PaymentTransaction(String email, double amount,String serviceName,String paymentMethod) {
		super(email, amount);
		this.serviseName=serviceName;
		this.paymentMethod=paymentMethod;
	}
	public String getServiseName() {
		return serviseName;
	}
	public void setServiseName(String serviseName) {
		this.serviseName = serviseName;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
}
