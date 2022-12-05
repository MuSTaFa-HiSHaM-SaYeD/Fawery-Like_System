package Storage;
import java.util.ArrayList;
import java.util.HashMap;
import Users.*;

public class Storage {

    private ArrayList <Transaction> transactions;
    HashMap<String, User> users = new HashMap<String, User>();

    public void addTransaction(Transaction transaction){
        transactions.add(transaction);
    }

    public void removeTransaction(Transaction transaction){
        transactions.remove(transaction);
    }

    public void addUser(User user){
        users.put(user.getEmail(), user);
    }

    public void removeUser(User user){
        users.remove(user.getEmail(), user);
    }

    // why this exists ??
    public HashMap<String, User> getEmails() {
        return users;
    }
    
    // why this exists ??
    public void setEmails(HashMap<String, User> emails) {
        users = emails;
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
           if ( t.getStatus().equals("In Refund") ){
            InRefundTransactions.add(t);
           }
        }

        return InRefundTransactions;
    }

    public boolean refundTransaction(Transaction transaction){
        return transaction.setStatusAsRefunded();        
    }

}
