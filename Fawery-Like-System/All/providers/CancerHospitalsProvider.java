package All.providers;

import All.PaymentSystem.*;


import java.util.ArrayList;

public class CancerHospitalsProvider extends ServiceProvider{

    public CancerHospitalsProvider(){
        name = "Cancer Hospital Provider " ;
        paymentMethods = new ArrayList<>() ;
        paymentMethods.add("Wallet") ;
        paymentMethods.add("Cash") ;
        paymentMethods.add("CreditCard") ;
        form = new Form(paymentMethods) ;
        // System.out.println("you got "+this.name);
    }
    
    
}
