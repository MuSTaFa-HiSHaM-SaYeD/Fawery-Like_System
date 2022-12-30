package com.swAssignment.fawrysystem.controllers.providers;

import com.swAssignment.fawrysystem.Common;
import com.swAssignment.fawrysystem.BSL.PaymentBsl;
import com.swAssignment.fawrysystem.BSL.ServiceBsl;
import com.swAssignment.fawrysystem.BSL.UserBsl;
import com.swAssignment.fawrysystem.models.forms.payment_forms.PaymentForm;

public class ProviderController extends Common{
	    private ServiceBsl serviceBsl;
	    private PaymentBsl paymentBsl;
        protected String message;
        public ProviderController(UserBsl userBsl,ServiceBsl serviceBsl,PaymentBsl paymentBsl) {
        	super(userBsl);
        	this.serviceBsl=serviceBsl;
        	this.paymentBsl=paymentBsl;
        }
        public String handleForm(PaymentForm form,String serviceName,String key) {
        	int index=userbsl.signin(form.getUserEmail(), form.getUserPassword());
        	if(index!=-1){
        		serviceBsl.setUser(userbsl.getUsers().get(index));
        		double amount = serviceBsl.setAmountAfterDiscount(key, form.getAmount());
        		form.setAmount(amount);
        		return paymentBsl.handlePaymentOperation(form, serviceName, key, index);
        	}
        	return "Authentication failed try again";
        }
}
