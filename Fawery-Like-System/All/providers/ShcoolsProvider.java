package All.providers;

import All.PaymentSystem.*;



import java.util.ArrayList;

public class ShcoolsProvider extends ServiceProvider{

    public ShcoolsProvider(){
        name = "Schools Provider" ;
        paymentMethods = new ArrayList<>() ;
        paymentMethods.add("Wallet") ;
        paymentMethods.add("Cash") ;
        paymentMethods.add("CreditCard") ;
        form = new Form(paymentMethods) ;
        // System.out.println("you got "+this.name);
    }
    
}
