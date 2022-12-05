package All.services;

import All.AutrticationSystem.*;
import All.Discount.*;
import All.MainProgram.*;
import All.providers.*;
import All.services.*;
import All.UserThings.*;
import All.PaymentSystem.*;

import java.util.ArrayList;

public abstract class Service {
    String name ;
    public ArrayList<String>providers ;
    public abstract ServiceProvider getProvider(String p) ;
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
