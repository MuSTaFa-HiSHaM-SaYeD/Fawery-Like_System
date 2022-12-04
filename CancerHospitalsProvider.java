import java.util.ArrayList;

import javax.management.remote.SubjectDelegationPermission;

public class CancerHospitalsProvider extends ServiceProvider{
    ArrayList<String> paymentMethods ;
    public CancerHospitalsProvider(){
        name = "Cancer Hospital Provider " ;
        form = new Form() ;
        paymentMethods = new ArrayList<>() ;
        paymentMethods.add("Wallet") ;
        paymentMethods.add("Cash") ;
        paymentMethods.add("CreditCard") ;
        // System.out.println("you got "+this.name);
    }
    
    
}
