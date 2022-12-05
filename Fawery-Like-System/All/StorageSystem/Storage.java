package All.StorageSystem;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import All.UserThings.*;

public class Storage {
    HashMap<String, User> Emails = new HashMap<String, User>();
    private ArrayList <Transaction> transactions = new ArrayList<>();
    
    public HashMap<String, User> getEmails() {
        return Emails;
    }
    public void setEmails(HashMap<String, User> emails) {
        Emails = emails;
    }
    
    public void addUser(User user){

        Emails.put(user.getEmail(),user);
    }

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
        
        // check first if there any Transactions exist
        if(transactions.size() == 0 )
            System.out.println("There Is No Transactions Recorded In The System");
        
        else
        {
            for (Transaction t : transactions) {
                if ( t.getStatus().equals("In All.Refund") ){
                    InRefundTransactions.add(t);
                }
            }
            
            if(InRefundTransactions.size() == 0 )
                System.out.println("There Is No Refund Requests made by the customers");

        }

        return InRefundTransactions;

    }

    public boolean refundTransaction(Transaction transaction){
        return transaction.setStatusAsRefunded();
    }


}
