package com.swAssignment.fawrysystem.BSL.transactions.providers;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swAssignment.fawrysystem.BSL.PaymentBsl;
import com.swAssignment.fawrysystem.BSL.ServiceBsl;
import com.swAssignment.fawrysystem.BSL.UserBsl;
import com.swAssignment.fawrysystem.models.forms.payment_forms.internet_payment_forms.VodafoneInternetPaymentPaymentForm;
import com.swAssignment.fawrysystem.models.forms.payment_forms.mobile_recharge_forms.VodafoneMobileChargePaymentForm;

@RestController
public class VodafoneProviderController extends ProviderController {

	public VodafoneProviderController(UserBsl userBsl, ServiceBsl serviceBsl, PaymentBsl paymentBsl) {
		super(userBsl, serviceBsl, paymentBsl);
	}
	@PostMapping(value = "/services/mobileRecharge/vodafone/pay")
	public String handleVodafoneMobileRechargeForm(@RequestBody VodafoneMobileChargePaymentForm form) {
		super.message = super.handleForm(form, "vodafone mobile recharge","mobile recharge");
		if(super.message.equals("Done")) {
			return "Payment operation done successfully you paid "+ form.getAmount() +" L.E , thankU for using vodafone mobile recharge service";
		}
		return super.message;
	}
	@PostMapping(value = "/services/internetPayment/vodafone/pay")
	public String handleVodafoneInternetForm(@RequestBody VodafoneInternetPaymentPaymentForm form) {
		super.message = super.handleForm(form, "vodafone internet payment","internet payment");
		if(super.message.equals("Done")) {
			return "Payment operation done successfully you paid "+form.getAmount()+" , thankU for using vodafone internet payment service";
		}
		return super.message;
	}

}
