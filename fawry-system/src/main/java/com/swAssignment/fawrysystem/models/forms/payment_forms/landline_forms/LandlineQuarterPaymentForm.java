package com.fci.fawrySystem.persons_service.models.forms.payment_forms.landline_forms;

import com.fci.fawrySystem.persons_service.models.forms.payment_forms.PaymentForm;

public class LandlineQuarterPaymentForm extends PaymentForm{
    private String landlinePhone;

	public String getLandlinePhone() {
		return landlinePhone;
	}

	public void setLandlinePhone(String landlinePhone) {
		this.landlinePhone = landlinePhone;
	}
}
