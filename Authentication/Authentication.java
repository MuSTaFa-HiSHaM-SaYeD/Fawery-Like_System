package Authentication;

<<<<<<< HEAD:Authentication/Authentication.java
import Storage.Storage;
import Users.User;
=======

import All.StorageSystem.Storage;
import All.UserThings.User;
>>>>>>> 690aa6e457948e83421bd16e1d9c25713b446141:Fawery-Like-System/All/AutrticationSystem/Authentication.java



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
