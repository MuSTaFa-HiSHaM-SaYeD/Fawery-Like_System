package Storage;

import java.time.LocalDateTime;
import Payment.Payment;
import Providers.ServiceProvider;
import Users.Customer;

public class Transaction {

    private Customer customer;
    private ServiceProvider serviceProvider;
    private double amount;
    private TransactionStatus status;
    private Payment paymentMethod;
    private LocalDateTime date;

    public Transaction(Customer customer, ServiceProvider serviceProvider) {
        status.setStatus("Completed");

        this.customer = customer;
        this.serviceProvider = serviceProvider;
        amount = serviceProvider.getForm().getAmount();
        paymentMethod = serviceProvider.getForm().getPaymentMethod();
        date = LocalDateTime.now();
    }

    public boolean setStatusAsRefundRejected() {
        return status.setStatus("Refund Rejected");
    }

    public boolean setStatusAsRefunded() {
        return status.setStatus("Refunded");
    }

    public boolean setStatusAsInRefund() {
        return status.setStatus("In Refund");
    }

    public double getAmount() {
        return amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public LocalDateTime getDate() {
        return date;
    }
    
    public Payment getPaymentMethod() {
        return paymentMethod;
    }
    
    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }
    
    public String getStatus() {
        return status.getStatus();
    }
}
