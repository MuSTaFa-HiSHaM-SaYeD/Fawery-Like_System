package All.PaymentSystem;

import All.UserThings.Customer;

public class PaymentWithCash implements Payment{
    @Override
    public void check_out(Customer c, Form F) {
        F.setPaymentStrategy( F.paymentStrategy.toLowerCase());
        System.out.println("Operation Done successfully");

    }



}
