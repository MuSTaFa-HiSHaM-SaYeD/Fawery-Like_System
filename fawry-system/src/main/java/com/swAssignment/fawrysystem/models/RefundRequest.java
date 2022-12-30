package com.swAssignment.fawrysystem.models;

public class RefundRequest {
    private String userEmail;
    private double amount;
    private String serviceName;
    private int userIndex;
    
	public RefundRequest(String userEmail, double amount, String serviceName, int userIndex) {
		this.userEmail = userEmail;
		this.amount = amount;
		this.serviceName = serviceName;
		this.userIndex = userIndex;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public int getUserIndex() {
		return userIndex;
	}
	public void setUserIndex(int userIndex) {
		this.userIndex = userIndex;
	}
}
