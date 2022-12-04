import java.nio.file.attribute.AclEntryFlag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Form {
    double amount ;
    String clientName ; // there is no need to ask the customer for his name again !, as he already signed in.
    // Payment paymentMethod;
    String serviceNumber ;	// you didn't set this attribute from the user
    ArrayList<String>acceptedPayment ;
    int paymentMethodNumber ;
    public Form() {
    	acceptedPayment = new ArrayList<>() ;
    	acceptedPayment.add("Credit") ;
    	acceptedPayment.add("Wallet") ;
    }
    void fillForm(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Transaction Amount:");
        amount = scanner.nextDouble();
        
        System.out.println("Enter your name: ");
        clientName = scanner.nextLine() ;
        
		/*
		 * System.out.println("Enter The Service Number:"); serviceNumber =
		 * scanner.nextLine();
		 */
        
        System.out.println("Choose a Payment Method (Number)");
        for(int i=0 ; i<acceptedPayment.size() ; ++i) {
        	System.out.println("Choose "+(i+1)+ " to pay via " + acceptedPayment.get(i));
        }
        paymentMethodNumber = scanner.nextInt() ;
        boolean flag = false ;
        while(flag==false) {
        	switch (paymentMethodNumber) {
	    		case 1: {
	    			// payment Method = new Credit(user) ;	// takes the user to link it's amount with his
	    			flag = true ;
	    			break ;
	    		}
	    		case 2:{
	    			//
	    			flag = true ;
	    			break ;
	    		}
	    		default:{
	    			System.out.println("Enter a valid number");
	    			paymentMethodNumber = scanner.nextInt() ;
	    		}
	    	}
        }
    }
}
