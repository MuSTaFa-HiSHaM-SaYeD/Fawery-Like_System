package Providers;

import Payment.*;


import java.util.ArrayList;

public class LandLineProvider extends ServiceProvider{
    ArrayList<String> paymentMethods ;
    public LandLineProvider(){
        name = "Land-line Provider " ;
        paymentMethods = new ArrayList<>() ;
        form = new Form() ;
        paymentMethods.add("Wallet") ;
        paymentMethods.add("Cash") ;
        paymentMethods.add("CreditCard") ;
        // System.out.println("you got "+this.name);
    }
    
}
