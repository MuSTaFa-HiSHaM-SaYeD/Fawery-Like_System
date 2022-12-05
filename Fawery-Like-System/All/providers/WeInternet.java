package All.providers;

import All.PaymentSystem.*;



import java.util.ArrayList;

public class WeInternet extends ServiceProvider{
    public WeInternet(){
        name = "We_Internet" ;
        paymentMethods = new ArrayList<>() ;
        paymentMethods.add("Wallet") ;
        paymentMethods.add("Cash") ;
        paymentMethods.add("CreditCard") ;
        form = new Form(paymentMethods);
        //System.out.println("you got "+this.name);
    }
    
}
