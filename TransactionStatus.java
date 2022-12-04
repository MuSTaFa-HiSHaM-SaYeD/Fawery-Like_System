import java.util.ArrayList;

public class TransactionStatus {
    private String status;      
    private ArrayList<String> statusList ;
    
    
    void add (String status) {

        if (!statusList.contains(status)) {
            statusList.add(status);
        }

    }
    
    void remove (String status) {
        statusList.remove(status);
    }

    
    boolean setStatus (String status) {
        if(statusList.contains(status)){
            this.status = status;
            return true;
        }
        else    
            return false;
    }
}
