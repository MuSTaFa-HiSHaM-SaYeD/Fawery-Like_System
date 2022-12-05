package All.AutrticationSystem;
import All.StorageSystem.Storage;

import All.UserThings.User;


import java.util.Scanner;
public class SignUpPage extends Authentication {
    Scanner strVal = new Scanner(System.in) ;

    SignUpPage(Storage D) {
        super(D);

    }
    public boolean check(String U,String P){
        if (D.getEmails().containsKey(U)){
                return false;
        }
        else {
            return true;
        }
    }

    public User Signin(String Email , String name, String passwords, User u){

        String UserEmail = Email;
        if (check(Email,passwords)){
            //we will set now Email, name, passwords
            u.setEmail(Email);
            u.setName(name);
            u.setPasswords(passwords);
            D.addUser(u);
            return u;
        }
        else
        {
            while (!check(UserEmail,passwords)) {
                System.out.println("email was exist please enter another email ");
                UserEmail = strVal.nextLine();
            }
            //we will set now UserEmail, name, passwords
            u.setEmail(UserEmail);
            u.setName(name);
            u.setPasswords(passwords);
            D.addUser(u);
            return u;

        }
    }
}
