import java.util.ArrayList;

public class WeInternet extends Providers{
    ArrayList<String> paymentMethods ;
    public WeInternet(){
        name = "We_Internet" ;
        paymentMethods = new ArrayList<>() ;
        paymentMethods.add("Wallet") ;
        paymentMethods.add("Cash") ;
        paymentMethods.add("CreditCard") ;
        //System.out.println("you got "+this.name);
    }
}
