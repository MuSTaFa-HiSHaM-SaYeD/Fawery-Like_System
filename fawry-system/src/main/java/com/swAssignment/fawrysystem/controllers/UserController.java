package com.swAssignment.fawrysystem.controllers;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swAssignment.fawrysystem.Common;
import com.swAssignment.fawrysystem.BSL.UserBsl;
import com.swAssignment.fawrysystem.models.persons.User;


@RestController
public class UserController extends Common{
    
    public UserController(UserBsl userbsl) {
		super(userbsl);
	}
	@PostMapping(value = "/user/signup")
    public String signup(@RequestBody User user) {
    	return userbsl.signup(user);
    }
    @PostMapping(value = "/user/signin")
    public String signin(@RequestBody Map<String,String> json) {
    	int index=userbsl.signin(json.get("email"),json.get("password"));
    	if(index!=-1) {
    		return "Welcome "+userbsl.getUsers().get(index).getUsername();
    	}
    	return "The email or password does not exist";
    }
    @GetMapping(value = "/user/get")
    public ArrayList<String> getUsers(){
    	ArrayList<String> usersData = new ArrayList<String>();
    	int cnt=1;
    	for(User user:userbsl.getUsers()) {
    		usersData.add(cnt+"-"+" Username : "+user.getUsername()+
    				" email : "+user.getEmail()+" password : "+user.getPassword()+
    				" walletbalance : "+user.getWallet().getAmount());
    		cnt++;
    	}
    	return usersData;
    }
    
}
