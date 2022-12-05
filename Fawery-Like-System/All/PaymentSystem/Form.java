package All.PaymentSystem;

import All.UserThings.Wallet;

import java.util.ArrayList;
import java.util.Scanner;

public class Form {
    int amount ;
	String paymentStrategy;
    PaymentStrategy paymentStrategyMethod;
    // String serviceNumber ;	// you didn't set this attribute from the user
    ArrayList<String>acceptedPayment ;
    int paymentMethodNumber ;
    
	public Form(ArrayList<String>acceptedPayment) {
    	this.acceptedPayment = acceptedPayment ;
    }

	/*public ArrayList<String> getAcceptedPayment() {
		return acceptedPayment;
	}*/

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public int getAmount() {
		return amount;
	}

	public PaymentStrategy getPaymentMethod() {
		return paymentStrategyMethod;
	}

	public void setPaymentStrategy(String paymentStrategy) {
		this.paymentStrategy = paymentStrategy;
	}

	public String getPaymentStrategy() {
		return paymentStrategy;
	}
	/*public String getClientName() {
		return clientName;
	}*/
	
	/*public int getPaymentMethodNumber() {
		return paymentMethodNumber;
	}*/

    public void fillForm(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Transaction Amount:");
        amount = scanner.nextInt();
		setAmount(amount);
        System.out.println("Choose a Payment Method (Number)");
        for(int i=0 ; i<acceptedPayment.size() ; ++i) {
        	System.out.println("Choose "+(i+1)+ " to pay via " + acceptedPayment.get(i));
        }
        paymentMethodNumber = scanner.nextInt() ;

        boolean flag = false ;
        while(flag==false) {
        	switch (paymentMethodNumber) {
	    		case 1: {
	    			setPaymentStrategy("wallet");
	    			flag = true ;
	    			break ;
	    		}
	    		case 2:{
					setPaymentStrategy("credit_card");
	    			flag = true ;
	    			break ;
	    		}
				case 3:{
					setPaymentStrategy("cash");
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
