package com.swAssignment.fawrysystem.BSL.transactions.providers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swAssignment.fawrysystem.BSL.PaymentBsl;
import com.swAssignment.fawrysystem.BSL.ServiceBsl;
import com.swAssignment.fawrysystem.BSL.UserBsl;
import com.swAssignment.fawrysystem.models.forms.payment_forms.internet_payment_forms.EtisalatInternetPaymentPaymentForm;
import com.swAssignment.fawrysystem.models.forms.payment_forms.mobile_recharge_forms.EtisalatMobileChargePaymentForm;



@RestController
public class EtisalatProviderController extends ProviderController {

	public EtisalatProviderController(UserBsl userBsl, ServiceBsl serviceBsl, PaymentBsl paymentBsl) {
		super(userBsl, serviceBsl, paymentBsl);
	}
	@PostMapping(value = "/services/mobileRecharge/etisalat/pay")
	public String handleEtisalatMobileRechargeForm(@RequestBody EtisalatMobileChargePaymentForm form) {
		super.message = super.handleForm(form, "etisalat mobile recharge","mobile recharge");
		if(super.message.equals("Done")) {
			return "Payment operation done successfully you paid "+ form.getAmount() +" L.E , thankU for using etisalat mobile recharge service";
		}
		return super.message;
	}
	@PostMapping(value = "/services/internetPayment/etisalat/pay")
	public String handleEtisalatInternetForm(@RequestBody EtisalatInternetPaymentPaymentForm form) {
		super.message = super.handleForm(form, "etisalat internet payment","internet payment");
		if(super.message.equals("Done")) {
			return "Payment operation done successfully you paid "+form.getAmount()+" , thankU for using etisalat internet payment service";
		}
		return super.message;
	}

}
