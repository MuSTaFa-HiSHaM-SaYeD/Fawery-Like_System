package All.services;

import java.util.ArrayList;
import All.AutrticationSystem.*;
import All.Discount.*;
import All.MainProgram.*;
import All.providers.*;
import All.services.*;
import All.UserThings.*;
public abstract class Services {
    String name ;
    public ArrayList<String>providers ;
    public abstract Providers getProvider(String p) ;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getProviders(){
        for (int i=0 ; i<providers.size() ; i++)
            System.out.println(providers.get(i));
    }
}
