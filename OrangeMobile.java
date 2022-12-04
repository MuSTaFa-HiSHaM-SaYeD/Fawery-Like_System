import java.util.ArrayList;

public class OrangeMobile extends Providers{
    ArrayList<String> paymentMethods ;
    public OrangeMobile(){
        name = "Orange_Mobile" ;
        paymentMethods = new ArrayList<>() ;
        paymentMethods.add("Wallet") ;
        paymentMethods.add("Cash") ;
        paymentMethods.add("CreditCard") ;
        //System.out.println("you got "+this.name);
    }
}
