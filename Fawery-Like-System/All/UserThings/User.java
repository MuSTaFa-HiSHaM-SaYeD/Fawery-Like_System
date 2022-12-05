package All.UserThings;

import All.AutrticationSystem.*;
import All.Discount.*;
import All.MainProgram.*;
import All.providers.*;
import All.services.*;
import All.UserThings.*;
import All.PaymentSystem.*;

import java.util.ArrayList;


public abstract class User {
    // violate single responsablity
    ArrayList<Service> services ;
    String Email;
    String name;
    String passwords;
    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEmail() {
        return Email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    public String getPasswords() {
        return passwords;
    }


}
