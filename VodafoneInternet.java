import java.util.ArrayList;

public class VodafoneInternet extends ServiceProvider{
    ArrayList<String> paymentMethods ;
    public VodafoneInternet(){
        name = "Vodafone_Internet" ;
        form = new Form() ;
        paymentMethods = new ArrayList<>() ;
        paymentMethods.add("Wallet") ;
        paymentMethods.add("Cash") ;
        paymentMethods.add("CreditCard") ;
        //System.out.println("you got "+this.name);
    }
    
}
