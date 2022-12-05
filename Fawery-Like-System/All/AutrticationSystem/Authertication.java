package All.AutrticationSystem;

import All.UserThings.Customer;
import All.MainProgram.Storage;

public abstract class Authertication {
    Storage D ;
    Authertication(Storage D)
    {
        this.D = D;
    }


    public abstract boolean check(String U, String P);

    public Customer geteUserAccount(String U){
        return D.getEmails().get(U);
    }
}
