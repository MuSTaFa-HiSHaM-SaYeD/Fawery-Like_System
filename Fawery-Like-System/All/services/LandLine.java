package All.services;

import All.providers.*;

import java.util.ArrayList;

public class LandLine extends Service{
    // name + setter + getter
    public LandLine(){
        this.name = "Land Line Service" ;
        providers = new ArrayList<>() ;
        providers.add("Land-line Provider") ;
    }
    @Override
    public ServiceProvider getProvider(String p){
        ServiceProvider provider = new LandLineProvider() ;
        return provider ;
    }
}
