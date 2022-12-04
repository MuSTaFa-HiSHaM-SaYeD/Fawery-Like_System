import java.util.ArrayList;

public class LandLineProvider extends Providers{
    ArrayList<String> paymentMethods ;
    public LandLineProvider(){
        name = "Land-line Provider " ;
        paymentMethods = new ArrayList<>() ;
        paymentMethods.add("Wallet") ;
        paymentMethods.add("Cash") ;
        paymentMethods.add("CreditCard") ;
        // System.out.println("you got "+this.name);
    }
}
