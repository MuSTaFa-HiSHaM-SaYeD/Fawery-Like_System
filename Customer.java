import java.util.ArrayList;
import java.util.Scanner;

public class Customer extends User {
    
    public void makeRefundRequest(){
        
        Scanner scanner = new Scanner(System.in);
        Storage storage = new Storage();
        ArrayList<Transaction> customerTransactions;
        
        int ans=1;
        while(ans == 1){
            
            customerTransactions = storage.getCustomerTransactions(this);
            
            int input=-1;
            while(input > customerTransactions.size() || input < 0 ){
                
                System.out.println("Choose The Transaction You Want To Refund:");
                for (int i=0;i<customerTransactions.size();i++) {
                    System.out.println(i+1 +" "+ customerTransactions.get(i).toString());
                }
    
                input = scanner.nextInt();
            } 
            customerTransactions.get(input).setStatusAsInRefund();

            ans=-1;
            while(ans != 0 || ans != 1 ){
                System.out.println("Do you want to make another refund request?\n0- No\n1- Yes)");
                ans = scanner.nextInt();
            }

        }
        scanner.close();
    } 
}
