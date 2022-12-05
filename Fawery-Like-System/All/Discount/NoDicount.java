package All.Discount;

import All.PaymentSystem.Form;
import All.PaymentSystem.Payment;
import All.UserThings.Customer;

public class NoDicount extends DiscountDecorator{


    NoDicount(Payment decoratedDiscount_, int DiscountPersantage_) {
        super(decoratedDiscount_, DiscountPersantage_);
    }

    @Override
    public void check_out(Customer c, Form F) {
        decoratedDiscount.check_out(c,F);
    }
}
