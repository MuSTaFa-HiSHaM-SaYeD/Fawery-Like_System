import java.util.ArrayList;

public class EtisalatInternet extends Providers{
    ArrayList<String> paymentMethods ;
    public EtisalatInternet(){
        name = "Etisalat_Internet" ;
        paymentMethods = new ArrayList<>() ;
        paymentMethods.add("Wallet") ;
        paymentMethods.add("Cash") ;
        paymentMethods.add("CreditCard") ;
        //System.out.println("you got "+this.name);
    }
}
