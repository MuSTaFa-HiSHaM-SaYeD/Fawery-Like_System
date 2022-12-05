package Services;
import Providers.*;


import java.util.ArrayList;
import java.util.Scanner;

public class Donation extends Service{
    // name + setter + getter
    public Donation(){
        this.name = "Donation Service" ;
        providers = new ArrayList<>() ;
        providers.add("Non Profit Organizations") ;
        providers.add("Cancer Hospitals") ;
        providers.add("Schools") ;
    }
    @Override
    public ServiceProvider getProvider(String p){
        int val = 0 ;
        String pro = p.toLowerCase() ;
        ServiceProvider provider = null ;
        while(val==0){
            if(pro.contains("school")){
                provider = new ShcoolsProvider() ;
                val = 1;
            }
            else if(pro.contains("ngo")||pro.contains("non")){
                provider = new NgoProvider() ;
                val = 1;
            }
            else if(pro.contains("cancer")||pro.contains("hospitals")){
                provider = new CancerHospitalsProvider() ;
                val = 1;
            }
            else{
                System.out.println("enter a valid value");
                Scanner obj = new Scanner(System.in) ;
                pro = obj.nextLine().toLowerCase() ;
                obj.close();
            }
        }
        return provider ;
    }
}
