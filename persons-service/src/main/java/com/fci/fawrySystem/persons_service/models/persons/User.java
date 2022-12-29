package com.fci.fawrySystem.persons_service.models.persons;


import com.fci.fawrySystem.persons_service.Wallet;

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
