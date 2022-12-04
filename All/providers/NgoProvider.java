package All.providers;
import java.util.ArrayList;
import All.AutrticationSystem.*;
import All.Discount.*;
import All.MainProgram.*;
import All.providers.*;
import All.services.*;
import All.UserThings.*;
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
