import java.util.ArrayList;

public class ShcoolsProvider extends Providers{
    ArrayList<String> paymentMethods ;
    public ShcoolsProvider(){
        name = "Schools Provider" ;
        paymentMethods = new ArrayList<>() ;
        paymentMethods.add("Wallet") ;
        paymentMethods.add("Cash") ;
        paymentMethods.add("CreditCard") ;
        // System.out.println("you got "+this.name);
    }

}
