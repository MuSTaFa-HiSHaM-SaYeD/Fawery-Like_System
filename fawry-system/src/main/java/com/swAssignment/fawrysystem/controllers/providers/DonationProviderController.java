package com.swAssignment.fawrysystem.BSL.transactions.providers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.swAssignment.fawrysystem.BSL.PaymentBsl;
import com.swAssignment.fawrysystem.BSL.ServiceBsl;
import com.swAssignment.fawrysystem.BSL.UserBsl;
import com.swAssignment.fawrysystem.models.forms.payment_forms.donations_forms.CancerHospitalsDonationPaymentForm;
import com.swAssignment.fawrysystem.models.forms.payment_forms.donations_forms.NGOsDonationPaymentForm;
import com.swAssignment.fawrysystem.models.forms.payment_forms.donations_forms.SchoolsDonationPaymentForm;



@RestController
public class DonationProviderController extends ProviderController{

	public DonationProviderController(UserBsl userBsl, ServiceBsl serviceBsl, PaymentBsl paymentBsl) {
		super(userBsl, serviceBsl, paymentBsl);
	}
	@PostMapping(value = "/services/donation/schools/pay")
	public String handleSchoolsDonationForm(@RequestBody SchoolsDonationPaymentForm form) {
		super.message = super.handleForm(form, "schools donation service","donation");
		if(super.message.equals("Done")) {
			return "Payment operation done successfully you paid "+form.getAmount() +" L.E ,thankU for your donation which will go to "+form.getDonateToWhom();
		}
		return super.message;
	}
	@PostMapping(value = "/services/donation/cancerHospitals/pay")
	public String handleCancerHospitalsDonationForm(@RequestBody CancerHospitalsDonationPaymentForm form) {
		super.message = super.handleForm(form, "cancer hospitals donation service","donation");
		if(super.message.equals("Done")) {
			return "Payment operation done successfully you paid "+form.getAmount() +" L.E ,thankU for your donation which will go to "+form.getDonateToWhom();
		}
		return super.message;
	}
	@PostMapping(value = "/services/donation/NGOs/pay")
	public String handleNGOsDonationForm(@RequestBody NGOsDonationPaymentForm form) {
		super.message = super.handleForm(form, "ngos donation service","donation");
		if(super.message.equals("Done")) {
			return "Payment operation done successfully you paid "+form.getAmount() +" L.E ,thankU for your donation which will go to "+form.getDonateToWhom();
		}
		return super.message;
	}

}
