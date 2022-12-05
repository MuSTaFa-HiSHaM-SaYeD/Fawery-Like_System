package All.MainProgram;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import All.UserThings.*;

public class Storage {
    HashMap<String, Customer> Emails = new HashMap<String, Customer>();
    private ArrayList<Transaction> transactions;
    public HashMap<String, Customer> getEmails() {
        return Emails;
    }

    public void setEmails(HashMap<String, Customer> emails) {
        Emails = emails;
    }
    public void addTransaction(Transaction transaction){

    }
    public void removeTransaction(Transaction transaction){

    }
    public void addUser(Customer user){
        Emails.put(user.getEmail(),user);
    }

    public List<Transaction> getCustomerTransactions(Customer customer){
        return transactions;

    }
    public List<Transaction> getRefundRequests(){
        return transactions;

    }
    public boolean refundTransaction(Transaction transaction){
        return false;

    }

}
