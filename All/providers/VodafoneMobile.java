package All.providers;
import java.util.ArrayList;
import All.AutrticationSystem.*;
import All.Discount.*;
import All.MainProgram.*;
import All.providers.*;
import All.services.*;
import All.UserThings.*;
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
