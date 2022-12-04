import java.util.Scanner;

public class Form {
    double amount ;
    Payment paymentMethod;
    String serviceNumber ;

    void fillForm(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Transaction Amount:");
        amount = scanner.nextDouble();

        System.out.println("Enter The Service Number:");
        serviceNumber = scanner.nextLine();

        System.out.println("Choose a Payment Method:");
        System.out.println();

        // paymentMethod = 
    }
}
