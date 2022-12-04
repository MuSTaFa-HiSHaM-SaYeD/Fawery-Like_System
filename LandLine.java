import java.util.ArrayList;

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
