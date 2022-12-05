package All.PaymentSystem;

import All.UserThings.Customer;

public class PaymentAPP {
    public void run(Customer c, Form F)
    {
        F.setPaymentStrategy( F.paymentStrategy.toLowerCase());
        switch (F.paymentStrategy) {
            case "wallet": {
                Payment WalletPay = new PaymentWithWallet();
                WalletPay.check_out(c,F);
                break;
            }
            case "credit-card": {
                Payment creditPay = new PaymentWithCirdetCard();
                creditPay.check_out(c,F);
                break;
            }
            case "cash": {
                Payment cashPay = new PaymentWithCash();
                cashPay.check_out(c,F);
                break;
            }
            default: {
                System.out.println("Operation Done successfully");
                break;
            }
        }

    }
}
