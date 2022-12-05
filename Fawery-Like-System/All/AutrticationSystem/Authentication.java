package All.AutrticationSystem;

import All.UserThings.Customer;
import All.StorageSystem.Storage;

public abstract class Authentication {
    Storage D ;
    Authentication(Storage D)
    {
        this.D = D;
    }


    public abstract boolean check(String U, String P);

    public Customer geteUserAccount(String U){
        return D.getEmails().get(U);
    }
}
