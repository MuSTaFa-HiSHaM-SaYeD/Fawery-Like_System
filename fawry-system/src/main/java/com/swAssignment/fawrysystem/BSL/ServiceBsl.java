package com.swAssignment.fawrysystem.BSL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.swAssignment.fawrysystem.models.discounts.Discount;
import com.swAssignment.fawrysystem.models.persons.Person;
import com.swAssignment.fawrysystem.models.services.DonationService;
import com.swAssignment.fawrysystem.models.services.InternetPaymentService;
import com.swAssignment.fawrysystem.models.services.LandlineService;
import com.swAssignment.fawrysystem.models.services.MobileRechargeService;
import com.swAssignment.fawrysystem.models.services.service;



@Service
public class ServiceBsl{
	private Map<String,service> servicees;
	private Person user;
	public ServiceBsl() {
		servicees = new HashMap<>();
    	servicees.put("mobile recharge",  new MobileRechargeService());
    	servicees.put("internet payment",  new InternetPaymentService());
    	servicees.put("landline",  new LandlineService());
    	servicees.put("donation",  new DonationService());
	}
    public String addDiscount(String serviceName,Discount discount) {
    	String successMessage = "Discount has been added successfully";
    	if(servicees.keySet().contains(serviceName)) {
    		servicees.get(serviceName).addDiscount(discount);
    		return successMessage;
    	}else if(serviceName.equals("all")) {
    		for(String key : servicees.keySet()) {
    			servicees.get(key).addDiscount(discount);
    		}
    		return successMessage;
    	}
    	return "Please enter the right service name";
    }
    public ArrayList<String> GetDiscounts() {
    	ArrayList<String> zz = new ArrayList<>();
    	for(String key : servicees.keySet()) {
    	    String x=key+" ";
    	    for(Discount discount : servicees.get(key).getDiscounts()) {
    	    	x=x+discount.getName()+" "+discount.getPercentage()+" ";
    	    }
    	    zz.add(x);
    	}
    	return zz;
    }
    public double setAmountAfterDiscount(String key,double amount) {
    	for(Discount discount:servicees.get(key).getDiscounts()) {
    		if(discount.getName().equals("overall")) {
    			if(user.getTransactions().isEmpty()) {
    				amount-=(amount*discount.getPercentage());
    			}
    		}else {
    			amount-=(amount*discount.getPercentage());
    		}
    		if(amount<=0) {
    			return 0.0;
    		}
    	}
    	return amount;
    }
    public Person getUser() {
		return user;
	}
	public void setUser(Person user) {
		this.user = user;
	}
	public Map<String, service> getServicees() {
		return servicees;
	}
	public void setServicees(Map<String, service> servicees) {
		this.servicees = servicees;
	}
}
