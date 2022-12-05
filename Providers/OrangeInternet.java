package Providers;

import Payment.*;


import java.util.ArrayList;

public class OrangeInternet extends ServiceProvider{
    ArrayList<String> paymentMethods ;
    public OrangeInternet(){
        name = "Orange_Internet" ;
        form = new Form() ;
        paymentMethods = new ArrayList<>() ;
        paymentMethods.add("Wallet") ;
        paymentMethods.add("Cash") ;
        paymentMethods.add("CreditCard") ;
        //System.out.println("you got "+this.name);
    }
    
}
