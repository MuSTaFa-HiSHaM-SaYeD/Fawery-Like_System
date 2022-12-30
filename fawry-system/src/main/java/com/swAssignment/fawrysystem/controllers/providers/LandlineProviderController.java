package com.swAssignment.fawrysystem.BSL.transactions.providers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swAssignment.fawrysystem.BSL.PaymentBsl;
import com.swAssignment.fawrysystem.BSL.ServiceBsl;
import com.swAssignment.fawrysystem.BSL.UserBsl;
import com.swAssignment.fawrysystem.models.forms.payment_forms.landline_forms.LandlineMonthlyPaymentForm;
import com.swAssignment.fawrysystem.models.forms.payment_forms.landline_forms.LandlineQuarterPaymentForm;



@RestController
public class LandlineProviderController extends ProviderController {

	public LandlineProviderController(UserBsl userBsl, ServiceBsl serviceBsl, PaymentBsl paymentBsl) {
		super(userBsl, serviceBsl, paymentBsl);
	}
	@PostMapping(value = "/services/landline/monthly/pay")
	public String handleLandlineMonthlyForm(@RequestBody LandlineMonthlyPaymentForm form) {
		super.message = super.handleForm(form, "Landline monthly service","landline");
		if(super.message.equals("Done")) {
			return "Payment operation done successfully you paid "+form.getAmount()+" L.E , landline monthly package has been renewed for the number "
		    +form.getLandlinePhone();
		}
		return super.message;
	}
	@PostMapping(value = "/services/landline/quarter/pay")
	public String handleLandlineQuarterForm(@RequestBody LandlineQuarterPaymentForm form) {
		super.message = super.handleForm(form, "Landline quarter service","landline");
		if(super.message.equals("Done")) {
			return "Payment operation done successfully you paid "+form.getAmount()+" L.E , landline quarter package has been renewed for the number "
		    +form.getLandlinePhone();
		}
		return super.message;
	}

}
