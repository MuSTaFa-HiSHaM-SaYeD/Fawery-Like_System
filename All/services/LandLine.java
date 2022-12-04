package All.services;

import java.util.ArrayList;
import All.AutrticationSystem.*;
import All.Discount.*;
import All.MainProgram.*;
import All.providers.*;
import All.services.*;
import All.UserThings.*;
public class LandLine extends Services{
    // name + setter + getter
    public LandLine(){
        this.name = "Land Line Service" ;
        providers = new ArrayList<>() ;
        providers.add("Land-line Provider") ;
    }
    @Override
    public Providers getProvider(String p){
        Providers provider = new LandLineProvider() ;
        return provider ;
    }
}
