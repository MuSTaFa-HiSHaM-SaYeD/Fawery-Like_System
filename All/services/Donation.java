package All.services;

import java.util.ArrayList;
import java.util.Scanner;
import All.AutrticationSystem.*;
import All.Discount.*;
import All.MainProgram.*;
import All.providers.*;
import All.services.*;
import All.UserThings.*;
public class Donation extends Services{
    // name + setter + getter
    public Donation(){
        this.name = "Donation Service" ;
        providers = new ArrayList<>() ;
        providers.add("Non Profit Organizations") ;
        providers.add("Cancer Hospitals") ;
        providers.add("Schools") ;
    }
    @Override
    public Providers getProvider(String p){
        int val = 0 ;
        String pro = p.toLowerCase() ;
        Providers provider = null ;
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
            }
        }
        return provider ;
    }
}
