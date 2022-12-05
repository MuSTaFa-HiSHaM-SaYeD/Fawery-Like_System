package Providers;

import Payment.*;


import java.util.ArrayList;

public class OrangeMobile extends ServiceProvider{
    ArrayList<String> paymentMethods ;
    public OrangeMobile(){
        name = "Orange_Mobile" ;
        form = new Form() ;
        paymentMethods = new ArrayList<>() ;
        paymentMethods.add("Wallet") ;
        paymentMethods.add("Cash") ;
        paymentMethods.add("CreditCard") ;
        //System.out.println("you got "+this.name);
    }
    
}
