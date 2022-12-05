package All.providers;

import All.PaymentSystem.*;



import java.util.ArrayList;

public class VodafoneMobile extends ServiceProvider{
    ArrayList<String> paymentMethods ;
    public VodafoneMobile(){
        name = "Vodafone_Mobile" ;
        form = new Form() ;
        paymentMethods = new ArrayList<>() ;
        paymentMethods.add("Wallet") ;
        paymentMethods.add("Cash") ;
        paymentMethods.add("CreditCard") ;
        //System.out.println("you got "+this.name);
    }
}
