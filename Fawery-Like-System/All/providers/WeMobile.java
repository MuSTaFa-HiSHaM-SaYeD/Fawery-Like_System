package All.providers;

import All.PaymentSystem.*;



import java.util.ArrayList;

public class WeMobile extends ServiceProvider{
    ArrayList<String> paymentMethods ;
    public WeMobile(){
        name = "We_Mobile" ;
        form = new Form() ;
        paymentMethods = new ArrayList<>() ;
        paymentMethods.add("Wallet") ;
        paymentMethods.add("Cash") ;
        paymentMethods.add("CreditCard") ;
        //System.out.println("you got "+this.name);
    }
    
}
