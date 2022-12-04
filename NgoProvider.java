import java.util.ArrayList;

public class NgoProvider extends Providers{
    ArrayList<String> paymentMethods ;
    public NgoProvider(){
        name = "Non-profit-organizations Provider" ;
        paymentMethods = new ArrayList<>() ;
        paymentMethods.add("Wallet") ;
        paymentMethods.add("Cash") ;
        paymentMethods.add("CreditCard") ;
        // System.out.println("you got "+this.name);
    }
}
