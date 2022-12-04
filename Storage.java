import java.util.ArrayList;
import java.util.List;

public class Storage {

    private ArrayList <Transaction> transactions;
    private ArrayList <User> users;
// خبأ

    public void addTransaction(Transaction transaction){

    }
    public void removeTransaction(Transaction transaction){

    }
    public void addUser(User user){

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
