package Authentication;

import Storage.Storage;

import Users.User;


import java.util.Scanner;

public class SignIn extends Authentication {
    Scanner strVal = new Scanner(System.in) ;
    String UserEmail ;
    String Passwords ;

    SignIn(Storage D) {
        super(D);
    }
    public boolean check(String U,String P){
        if (D.getEmails().containsKey(U)){
            if (D.getEmails().get(U).getPasswords().equals(P))
            {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            return false;
        }
    }

    public User loin(String U, String P)

    {
        String UserEmail = U;
        String Passwords = P;
        if (check(U,P)){
            return geteUserAccount(U);
        }
        else
        {
            while (!check(UserEmail,Passwords)) {
                System.out.println("email or password incorrect please enter correct data");
                System.out.println("please enter Email and passwords");
                UserEmail = strVal.nextLine();
                Passwords = strVal.nextLine();
            }
            return geteUserAccount(UserEmail);
        }
    }
}
