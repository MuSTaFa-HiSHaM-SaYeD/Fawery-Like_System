package com.swAssignment.fawrysystem.controllers.providers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swAssignment.fawrysystem.BSL.PaymentBsl;
import com.swAssignment.fawrysystem.BSL.ServiceBsl;
import com.swAssignment.fawrysystem.BSL.UserBsl;
import com.swAssignment.fawrysystem.models.forms.payment_forms.internet_payment_forms.OrangeInternetPaymentPaymentForm;
import com.swAssignment.fawrysystem.models.forms.payment_forms.mobile_recharge_forms.OrangeMobileChargePaymentForm;


@RestController
public class OrangeProviderController extends ProviderController{

	public OrangeProviderController(UserBsl userBsl, ServiceBsl serviceBsl, PaymentBsl paymentBsl) {
		super(userBsl, serviceBsl, paymentBsl);
	}
	@PostMapping(value = "/services/mobileRecharge/orange/pay")
	public String handleOrangeMobileRechargeForm(@RequestBody OrangeMobileChargePaymentForm form) {
		super.message = super.handleForm(form, "orange mobile recharge","mobile recharge");
		if(super.message.equals("Done")) {
			return "Payment operation done successfully you paid "+ form.getAmount() +" L.E , thankU for using orange mobile recharge service";
		}
		return super.message;
	}
	@PostMapping(value = "/services/internetPayment/orange/pay")
	public String handleOrangeInternetForm(@RequestBody OrangeInternetPaymentPaymentForm form) {
		super.message = super.handleForm(form, "orange internet payment","internet payment");
		if(super.message.equals("Done")) {
			return "Payment operation done successfully you paid "+form.getAmount()+" , thankU for using orange internet payment service";
		}
		return super.message;
	}
}
