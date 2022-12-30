package com.swAssignment.fawrysystem.controllers;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.swAssignment.fawrysystem.BSL.ServiceBsl;
import com.swAssignment.fawrysystem.models.discounts.OverallDiscount;
import com.swAssignment.fawrysystem.models.discounts.SpecificDiscount;

@RestController
public class DiscountController {
	ServiceBsl serviceBsl;
	public DiscountController(ServiceBsl serviceBsl) {
		this.serviceBsl=serviceBsl;
	}
	@GetMapping(value = "/admin/discounts/overallDiscount/add/{percentage}")
    public String addOverAllDiscount(@PathVariable("percentage") double percentage) {
    	return serviceBsl.addDiscount("all", new OverallDiscount("overall",percentage));
    }
    @GetMapping(value = "/admin/discounts/specificDiscount/add/{percentage}/{serviceName}")
    public String addSpecificDiscount(@PathVariable double percentage,@PathVariable String serviceName) {
    	return serviceBsl.addDiscount(serviceName, new SpecificDiscount("specifc",percentage));
    }
    @GetMapping(value = "/discounts/get")
    public ArrayList<String> getDiscounts(){
    	return serviceBsl.GetDiscounts();
    }
}
