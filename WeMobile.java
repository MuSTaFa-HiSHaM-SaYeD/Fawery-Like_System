import java.util.ArrayList;

public class WeMobile extends Providers{
    ArrayList<String> paymentMethods ;
    public WeMobile(){
        name = "We_Mobile" ;
        paymentMethods = new ArrayList<>() ;
        paymentMethods.add("Wallet") ;
        paymentMethods.add("Cash") ;
        paymentMethods.add("CreditCard") ;
        //System.out.println("you got "+this.name);
    }
}
