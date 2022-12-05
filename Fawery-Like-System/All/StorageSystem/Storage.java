package All.StorageSystem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import All.UserThings.*;

public class Storage {
    HashMap<String, User> Emails = new HashMap<String, User>();
    public HashMap<String, User> getEmails() {
        return Emails;
    }
    public void setEmails(HashMap<String, User> emails) {
        Emails = emails;
    }
    public void addUser(User user){

        Emails.put(user.getEmail(),user);
    }









    private ArrayList <Transaction> transactions;


    public void addTransaction(Transaction transaction){
        transactions.add(transaction);
    }

    public void removeTransaction(Transaction transaction){
        transactions.remove(transaction);
    }



    public ArrayList<Transaction> getCustomerTransactions(Customer customer){
        ArrayList<Transaction> customerTransactions = new ArrayList<>();
        for (Transaction t : transactions) {
            if ( t.getCustomer() == customer ){
                customerTransactions.add(t);
            }
        }
        return customerTransactions;
    }

    public ArrayList<Transaction> getRefundRequests(){
        ArrayList<Transaction> InRefundTransactions = new ArrayList<>();
        for (Transaction t : transactions) {
            if ( t.getStatus().equals("In All.Refund") ){
                InRefundTransactions.add(t);
            }
        }

        return InRefundTransactions;
    }

    public boolean refundTransaction(Transaction transaction){
        return transaction.setStatusAsRefunded();
    }


}
