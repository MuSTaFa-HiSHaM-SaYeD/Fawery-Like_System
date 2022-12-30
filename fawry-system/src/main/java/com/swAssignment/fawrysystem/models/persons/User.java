package com.swAssignment.fawrysystem.models.persons;


import com.swAssignment.fawrysystem.Wallet;

public class User extends Person{
	 
     private String email;
     private Wallet wallet;
     
     public User() {
    	 wallet = new Wallet();
    }
	
     public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Wallet getWallet() {
		return wallet;
	} 
}
