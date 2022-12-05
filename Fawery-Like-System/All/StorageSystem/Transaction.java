package All.StorageSystem;

import All.providers.ServiceProvider;

import All.UserThings.*;


import All.PaymentSystem.*;

import java.time.LocalDateTime;


public class Transaction {

    private Customer customer;
    private ServiceProvider serviceProvider;
    private double amount;
    private TransactionStatus status;
    private PaymentStrategy paymentStrategyMethod;
    private LocalDateTime date;

    public Transaction(Customer customer, ServiceProvider serviceProvider) {
        status.setStatus("Completed");

        this.customer = customer;
        this.serviceProvider = serviceProvider;
        amount = serviceProvider.getForm().getAmount();
        paymentStrategyMethod = serviceProvider.getForm().getPaymentMethod();
        date = LocalDateTime.now();
    }

    public boolean setStatusAsRefundRejected() {
        return status.setStatus("All.Refund Rejected");
    }

    public boolean setStatusAsRefunded() {
        return status.setStatus("Refunded");
    }

    public boolean setStatusAsInRefund() {
        return status.setStatus("In All.Refund");
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

    public PaymentStrategy getPaymentMethod() {
        return paymentStrategyMethod;
    }

    public ServiceProvider getServiceProvider() {
        return serviceProvider;
    }

    public String getStatus() {
        return status.getStatus();
    }
}
