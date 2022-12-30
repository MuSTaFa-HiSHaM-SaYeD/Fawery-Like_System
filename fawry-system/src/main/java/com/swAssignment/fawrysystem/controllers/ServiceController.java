package com.swAssignment.fawrysystem.BSL.transactions;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.swAssignment.fawrysystem.BSL.ServiceBsl;

@RestController
public class ServiceController {
	ServiceBsl serviceBsl;
	public ServiceController(ServiceBsl serviceBsl) {
		this.serviceBsl=serviceBsl;
	}
    @GetMapping(value = "services/search/{query}")
    public ArrayList<String> getSearchResult(@PathVariable("query") String query){
  	  ArrayList<String> queryResult = new ArrayList<>();
  	  for(String service : serviceBsl.getServicees().keySet()) {
  		  if(service.toLowerCase().trim().startsWith(query.toLowerCase().trim())) {
  			  queryResult.add(service);
  		  }
  	  }
  	  if(queryResult.isEmpty()) {
  		  queryResult.add("No services found");
  	  }
  	  return queryResult;
    }
}
