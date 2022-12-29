package com.fci.fawrySystem.persons_service.models.forms.payment_forms.donations_forms;

import com.fci.fawrySystem.persons_service.models.forms.payment_forms.PaymentForm;

public class SchoolsDonationPaymentForm extends PaymentForm{
   private String donateToWhom;

   public String getDonateToWhom() {
	return donateToWhom;
   }

   public void setDonateToWhom(String donateToWhom) {
	this.donateToWhom = donateToWhom;
   }
   
}
