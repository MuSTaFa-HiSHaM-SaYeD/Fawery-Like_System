package Services;
import Providers.*;

import java.util.ArrayList;
import java.util.Scanner;

public class InternetPayment extends Service{
    // name + setter + getter
    public InternetPayment(){
        this.name = "Internet Payment Service" ;
        providers = new ArrayList<>() ;
        providers.add("We Internet") ;
        providers.add("Vodafone Internet") ;
        providers.add("Orange Internet") ;
        providers.add("Etisalat Internet") ;
    }
    @Override
    public ServiceProvider getProvider(String p){
        int val = 0 ;
        String pro = p.toLowerCase() ;
        ServiceProvider provider = null ;
        while(val==0){
            if(pro.contains("etisalat")){
                provider = new EtisalatInternet() ;
                val = 1;
            }
            else if(pro.contains("vodafon")){
                provider = new VodafoneInternet() ;
                val = 1;
            }
            else if(pro.contains("we")){
                provider = new WeInternet() ;
                val = 1;
            }
            else if(pro.contains("orange")){
                provider = new OrangeInternet() ;
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
