import java.util.ArrayList;

public class OrangeInternet extends Providers{
    ArrayList<String> paymentMethods ;
    public OrangeInternet(){
        name = "Orange_Internet" ;
        paymentMethods = new ArrayList<>() ;
        paymentMethods.add("Wallet") ;
        paymentMethods.add("Cash") ;
        paymentMethods.add("CreditCard") ;
        //System.out.println("you got "+this.name);
    }
}
