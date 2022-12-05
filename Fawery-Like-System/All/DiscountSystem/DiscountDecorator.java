package All.DiscountSystem;

import All.PaymentSystem.Form;
import All.PaymentSystem.Payment;
import All.UserThings.Customer;

public abstract class DiscountDecorator implements Payment {
    public Payment decoratedDiscount;
    public int DiscountPersantage;


    DiscountDecorator(Payment decoratedDiscount_,int DiscountPersantage_)
    {
        this.decoratedDiscount = decoratedDiscount_;
        this.DiscountPersantage = DiscountPersantage_;
    }

    @Override
    public void check_out(Customer c, Form F) {
        decoratedDiscount.check_out(c, F);
    }
}
