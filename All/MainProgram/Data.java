package All.MainProgram;
import java.util.HashMap;

import All.UserThings.Customer;
import All.AutrticationSystem.*;
import All.Discount.*;
import All.MainProgram.*;
import All.providers.*;
import All.services.*;
import All.UserThings.*;

public class Data {
    HashMap<String, Customer> Emails = new HashMap<String, Customer>();

    public HashMap<String, Customer> getEmails() {
        return Emails;
    }

    public void setEmails(HashMap<String, Customer> emails) {
        Emails = emails;
    }


}
