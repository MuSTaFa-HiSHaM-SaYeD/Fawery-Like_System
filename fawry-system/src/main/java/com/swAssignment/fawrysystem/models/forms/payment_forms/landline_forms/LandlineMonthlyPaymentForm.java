package com.swAssignment.fawrysystem.models.forms.payment_forms.landline_forms;

import com.swAssignment.fawrysystem.models.forms.payment_forms.PaymentForm;

public class LandlineMonthlyPaymentForm extends PaymentForm{
	private String landlinePhone;

	public String getLandlinePhone() {
		return landlinePhone;
	}

	public void setLandlinePhone(String landlinePhone) {
		this.landlinePhone = landlinePhone;
	}
}
