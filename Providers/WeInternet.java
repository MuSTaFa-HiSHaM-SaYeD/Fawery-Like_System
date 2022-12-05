package Providers;

import Payment.*;


import java.util.ArrayList;

public class WeInternet extends ServiceProvider{
    ArrayList<String> paymentMethods ;
    public WeInternet(){
        name = "We_Internet" ;
        form = new Form(); 
        paymentMethods = new ArrayList<>() ;
        paymentMethods.add("Wallet") ;
        paymentMethods.add("Cash") ;
        paymentMethods.add("CreditCard") ;
        //System.out.println("you got "+this.name);
    }
    
}
