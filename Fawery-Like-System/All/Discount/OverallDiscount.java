package All.Discount;

import All.PaymentSystem.Form;
import All.PaymentSystem.Payment;
import All.UserThings.Customer;

public class OverallDiscount extends DiscountDecorator{


    OverallDiscount(Payment decoratedDiscount_, int DiscountPersantage_) {
        super(decoratedDiscount_, DiscountPersantage_);
    }

    @Override
    public void check_out(Customer c, Form F) {
        putdiscount( F, DiscountPersantage);
        decoratedDiscount.check_out(c,F);
    }
    public void putdiscount(Form F,int discount)
    {
        F.setAmount(F.getAmount()-((F.getAmount()*discount)/100));
    }
}
