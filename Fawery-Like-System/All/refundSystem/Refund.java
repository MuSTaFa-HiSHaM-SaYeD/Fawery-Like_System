package All.refundSystem;

import All.StorageSystem.Storage;
import All.StorageSystem.Transaction;
import All.UserThings.Customer;

import java.util.ArrayList;
import java.util.Scanner;



public class Refund {

    
    public void makeRefundRequest(Customer customer){
        
        Scanner scanner = new Scanner(System.in);
        Storage storage = new Storage();
        ArrayList<Transaction> customerTransactions;
        
        int ans=1;
        while(ans == 1){
            
            customerTransactions = storage.getCustomerTransactions(customer);
            int input=-1;
            while(input > customerTransactions.size() || input < 0 ){
                
                System.out.println("Choose The Transaction You Want To All.Refund:");
                for (int i=0;i<customerTransactions.size();i++) {
                    System.out.println(i+1 +" "+ customerTransactions.get(i).toString());
                }
    
                input = scanner.nextInt();
            } 
            customerTransactions.get(input).setStatusAsInRefund();

            ans=-1;
            while(ans != 0 || ans != 1){
                System.out.println("Do you want to make another refund request?\n0- No\n1- Yes)");
                ans = scanner.nextInt();
            }

        }
        scanner.close();
    } 


    public void approveAndRejectRefundRequests() {
        Storage storage = new Storage();
        Scanner scanner = new Scanner(System.in);

        int ans = 1;
        while (ans == 1) {

            ArrayList<Transaction> refundRequests = storage.getRefundRequests();

            int chosenTransaction = -1;
            while (chosenTransaction > refundRequests.size() || chosenTransaction < 0) {

                System.out.println("Choose The Transaction You Want To Approve or Reject:");
                for (int i = 0; i < refundRequests.size(); i++) {
                    System.out.println(i + 1 + " " + refundRequests.get(i).toString());
                }
                chosenTransaction = scanner.nextInt();
            }

            ans = -1;
            while (ans != 0 || ans != 1) {
                System.out.println("Do you want To Approve or Reject:?\n0- Reject\n1- Approve)");
                ans = scanner.nextInt();
            }

            switch (ans) {
                case 0:
                    refundRequests.get(chosenTransaction).setStatusAsRefundRejected();
                    break;

                case 1:
                    refundRequests.get(chosenTransaction).setStatusAsRefunded();
                    break;
            }

            ans = -1;
            while (ans != 0 || ans != 1) {
                System.out.println("Do you want to make Approve or Reject another refund request?\n0- No\n1- Yes)");
                ans = scanner.nextInt();
            }

        }

        scanner.close();
    }


}
