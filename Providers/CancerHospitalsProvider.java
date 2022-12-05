package Providers;

import Payment.*;

import java.util.ArrayList;

public class CancerHospitalsProvider extends ServiceProvider{
    ArrayList<String> paymentMethods ;
    public CancerHospitalsProvider(){
        name = "Cancer Hospital Provider " ;
        form = new Form() ;
        paymentMethods = new ArrayList<>() ;
        paymentMethods.add("Wallet") ;
        paymentMethods.add("Cash") ;
        paymentMethods.add("CreditCard") ;
        // System.out.println("you got "+this.name);
    }
    
    
}
