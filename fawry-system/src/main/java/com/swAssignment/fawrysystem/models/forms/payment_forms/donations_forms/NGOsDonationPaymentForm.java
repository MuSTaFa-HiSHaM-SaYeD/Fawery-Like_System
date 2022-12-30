package com.swAssignment.fawrysystem.models.forms.payment_forms.donations_forms;

import com.swAssignment.fawrysystem.models.forms.payment_forms.PaymentForm;

public class NGOsDonationPaymentForm extends PaymentForm{
	   private String donateToWhom;

	   public String getDonateToWhom() {
		return donateToWhom;
	   }

	   public void setDonateToWhom(String donateToWhom) {
		this.donateToWhom = donateToWhom;
	   }
}
