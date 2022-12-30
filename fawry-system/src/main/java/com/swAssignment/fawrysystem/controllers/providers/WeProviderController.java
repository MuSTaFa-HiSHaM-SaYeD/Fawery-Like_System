package com.swAssignment.fawrysystem.controllers.providers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swAssignment.fawrysystem.BSL.PaymentBsl;
import com.swAssignment.fawrysystem.BSL.ServiceBsl;
import com.swAssignment.fawrysystem.BSL.UserBsl;
import com.swAssignment.fawrysystem.models.forms.payment_forms.internet_payment_forms.WeInternetPaymentPaymentForm;
import com.swAssignment.fawrysystem.models.forms.payment_forms.mobile_recharge_forms.WeMobileChargePaymentForm;


@RestController
public class WeProviderController extends ProviderController{

	public WeProviderController(UserBsl userBsl, ServiceBsl serviceBsl, PaymentBsl paymentBsl) {
		super(userBsl, serviceBsl, paymentBsl);
	}
	@PostMapping(value = "/services/mobileRecharge/we/pay")
	public String handleWeMobileRechargeForm(@RequestBody WeMobileChargePaymentForm form) {
		super.message = super.handleForm(form, "we mobile recharge","mobile recharge");
		if(super.message.equals("Done")) {
			return "Payment operation done successfully you paid "+ form.getAmount() +" L.E , thankU for using we mobile recharge service";
		}
		return super.message;
	}
	@PostMapping(value = "/services/internetPayment/we/pay")
	public String handleWeInternetForm(@RequestBody WeInternetPaymentPaymentForm form) {
		super.message = super.handleForm(form, "we internet payment","internet payment");
		if(super.message.equals("Done")) {
			return "Payment operation done successfully you paid "+form.getAmount()+" , thankU for using we internet payment service";
		}
		return super.message;
	}
}
