package All.providers;

import All.PaymentSystem.*;



import java.util.ArrayList;

public class NgoProvider extends ServiceProvider{
    ArrayList<String> paymentMethods ;
    public NgoProvider(){
        name = "Non-profit-organizations Provider" ;
        form = new Form() ;
        paymentMethods = new ArrayList<>() ;
        paymentMethods.add("Wallet") ;
        paymentMethods.add("Cash") ;
        paymentMethods.add("CreditCard") ;
        // System.out.println("you got "+this.name);
    }
    
}
