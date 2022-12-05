import java.util.ArrayList;
import java.util.List;

public class TransactionStatus {
    private String status;
    private ArrayList<String> statusList = new ArrayList<>(List.of("Completed","Refunded","In Refund","Refund Rejected"));
    
    
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

    public String getStatus() {
        return status;
    }
}
