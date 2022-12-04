package All.AutrticationSystem;

import All.UserThings.Customer;
import All.MainProgram.Data;

public abstract class Authertication {
    Data D ;
    Authertication(Data D)
    {
        this.D = D;
    }


    public abstract boolean check(String U, String P);

    public Customer geteUserAccount(String U){
        return D.getEmails().get(U);
    }
}
