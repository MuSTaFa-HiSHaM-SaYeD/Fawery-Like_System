import java.util.ArrayList;
import java.util.Scanner;

public class Admin extends User {

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
