import java.util.ArrayList;

public class VodafoneInternet extends Providers{
    ArrayList<String> paymentMethods ;
    public VodafoneInternet(){
        name = "Vodafone_Internet" ;
        paymentMethods = new ArrayList<>() ;
        paymentMethods.add("Wallet") ;
        paymentMethods.add("Cash") ;
        paymentMethods.add("CreditCard") ;
        //System.out.println("you got "+this.name);
    }
}
