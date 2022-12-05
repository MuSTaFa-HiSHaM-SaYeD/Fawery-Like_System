package All.PaymentSystem;

import All.UserThings.Customer;

public class PaymentWithWallet implements Payment{
    @Override
    public void check_out(Customer c, Form F) {
        F.setPaymentStrategy( F.paymentStrategy.toLowerCase());
        c.getWallet().takemony(F.amount);
        System.out.println("Wallet has been updated successfully");
    }
}
