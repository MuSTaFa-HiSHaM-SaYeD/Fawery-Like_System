package All.PaymentSystem;

import All.UserThings.Customer;

public class PaymentWithCirdetCard implements Payment{
    @Override
    public void check_out(Customer c, Form F) {
        F.setPaymentStrategy( F.paymentStrategy.toLowerCase());
        System.out.println("Credit Card has been updated successfully");

    }
}
