package com.swAssignment.fawrysystem.models.forms.payment_forms;

import com.swAssignment.fawrysystem.models.forms.Form;

public class PaymentForm extends Form{
	protected String mobilePhone;
    protected String paymentMethod;
	public String getMobilePhone() {
		return mobilePhone;
	}
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}
	public String getPaymentMethod() {
		return paymentMethod;
	}
	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
}
