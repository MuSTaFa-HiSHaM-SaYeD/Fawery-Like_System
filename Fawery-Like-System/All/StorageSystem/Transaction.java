package All.StorageSystem;

import All.providers.*;
import All.UserThings.*;
import All.PaymentSystem.*;

import java.util.Date;

public class Transaction {

private String customerName ;
private ServiceProvider serviceProvider; 
private double amount; 
private TransactionStatus status ;
private Payment paymentMethod ;
private Date date;

public Transaction (Customer customer , ServiceProvider serviceProvider){
    status.add("Completed");
    status.setStatus("Completed");

    customerName = customer.getName();
    this.serviceProvider = serviceProvider;

    
}

boolean setStatusAsRefundRejected (){
    return false; 

}
boolean setStatusAsRefunded () {
    return false;

}
boolean setStatusAsInRefund (){
    return false;

}

}
