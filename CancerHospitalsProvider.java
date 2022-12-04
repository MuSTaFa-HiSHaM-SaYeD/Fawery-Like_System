import java.util.ArrayList;

public class CancerHospitalsProvider extends Providers{
    ArrayList<String> paymentMethods ;
    public CancerHospitalsProvider(){
        name = "Cancer Hospital Provider " ;
        paymentMethods = new ArrayList<>() ;
        paymentMethods.add("Wallet") ;
        paymentMethods.add("Cash") ;
        paymentMethods.add("CreditCard") ;
        // System.out.println("you got "+this.name);
    }
}
