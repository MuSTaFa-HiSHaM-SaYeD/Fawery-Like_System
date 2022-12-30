package com.swAssignment.fawrysystem.BSL;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.swAssignment.fawrysystem.models.persons.User;


@Service
public class UserBsl {
    private ArrayList<User> users;
    public UserBsl() {
    	users = new ArrayList<>();
    }
    
    public ArrayList<User> getUsers(){
    	return users;
    }
    public String signup(User user) {
    	for(User user1:users) {
    		if(user1.getEmail().equals(user.getEmail())) {
    			return "The user already registered before";
    		}else if(user1.getUsername().equals(user.getUsername())) {
    			return "The username you entered already taken";
    		}
    	}
    	users.add(user);
    	return "Registration completed successfully";
    }
    public int signin(String email,String password) {
    	int index=0;
    	for(User user1:users) {
    		if(user1.getEmail().equals(email) && user1.getPassword().equals(password)) {
    			return index;
    		}
    		index++;
    	}
    	return -1;
    }
}
