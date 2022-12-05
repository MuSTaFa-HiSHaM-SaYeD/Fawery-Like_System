package Authentication;

import Storage.Storage;
import Users.User;



public abstract class Authentication {
    Storage D ;
    Authentication(Storage D)
    {
        this.D = D;
    }


    public abstract boolean check(String U, String P);
    public User geteUserAccount(String U){

  

        return D.getEmails().get(U);
    }
}
