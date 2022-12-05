package All.providers;

import All.AutrticationSystem.*;
import All.Discount.*;
import All.MainProgram.*;
import All.providers.*;
import All.services.*;
import All.UserThings.*;
import All.PaymentSystem.*;



import java.util.ArrayList;

public class EtisalatMobile extends ServiceProvider {
    ArrayList<String> paymentMethods ;
    public EtisalatMobile(){
        name = "Etisalat_Mobile" ;
        form = new Form() ;
        paymentMethods = new ArrayList<>() ;
        paymentMethods.add("Wallet") ;
        paymentMethods.add("Cash") ;
        paymentMethods.add("CreditCard") ;
        // System.out.println("you got "+this.name);
    }
    
}
