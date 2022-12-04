import java.util.ArrayList;

public class VodafoneMobile extends Providers{
    ArrayList<String> paymentMethods ;
    public VodafoneMobile(){
        name = "Vodafone_Mobile" ;
        paymentMethods = new ArrayList<>() ;
        paymentMethods.add("Wallet") ;
        paymentMethods.add("Cash") ;
        paymentMethods.add("CreditCard") ;
        //System.out.println("you got "+this.name);
    }
}
