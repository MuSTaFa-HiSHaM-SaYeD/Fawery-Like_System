package All.System;

import All.AutrticationSystem.AuthenticationSystem;
import All.DiscountSystem.PraintDiscoutList;
import All.PaymentSystem.Payment;
import All.PaymentSystem.PaymentAPP;
import All.StorageSystem.Storage;
import All.UserThings.Customer;
import All.UserThings.User;
import All.providers.ServiceProvider;
import All.refundSystem.Refund;
import All.services.*;

import java.util.ArrayList;
import java.util.Scanner;



public class CustomerSystem {
    static ArrayList<String> myAppServicese = new ArrayList<>() ;
    static ServiceProvider myProvider ;
    static Service myService ;
    public static boolean appConfiguration(Storage d){

        AuthenticationSystem Auth = new AuthenticationSystem();
        User U = new Customer();
        U = Auth.Autrticationsystem(d,U);
        PraintDiscoutList pri = new PraintDiscoutList();
        myAppServicese.add("internet payment") ;
        myAppServicese.add("mobile payment") ;
        myAppServicese.add("land-line payment") ;
        myAppServicese.add("donation") ;
        boolean RetFlage = true;
        int choose ;
        String str ;
        Scanner strVal = new Scanner(System.in) ;
        Scanner intVal = new Scanner(System.in) ;

        System.out.println("enter :");
        System.out.println("1- search for a service");
        System.out.println("2- see all services");
        System.out.println("3- make a refund request");
        System.out.println("4- see discounts");
        System.out.println("5- log out");
        choose = intVal.nextInt() ;
        boolean flag = false ;
        while(flag==false) {
            switch (choose){
                case 1:  {
                    search(U) ;
                    flag = true ;
                    break;
                }
                case 2:  {
                    listServices(U) ;
                    flag = true ;
                    break;
                }
                case 3:  {
                    new Refund().makeRefundRequest((Customer) U);
                    flag = true ;
                    break;
                }
                case 4:  {
                    pri.print(d);
                    flag = true ;
                    break;
                }
                case 5:  {
                    RetFlage = false;
                    flag = true ;
                    break;
                }
                default:  {
                    System.out.println("enter a valid number");
                    choose = intVal.nextInt() ;
                }
            }
        }
        return RetFlage;
    }
    public static void listServices(User u){
        for (int i=0 ; i<myAppServicese.size() ; i++){
            System.out.println( "-" + myAppServicese.get(i));
        }
        getLogic(u);
    }
    public static void search(User u){
        getLogic(u);
    }
    public static void getLogic(User u) {
        String service;
        PaymentAPP Payment = new  PaymentAPP();
        Scanner strVal = new Scanner(System.in);
        Scanner intVal = new Scanner(System.in);
        System.out.println("enter the service (name) if you want to continue , or (no) to exit");
        service = strVal.nextLine();
        while (!service.contains("no")) {

            if (service.contains("mobile")) {
                myService = new MobileRecharge();
                System.out.println("Write the name of your provider");
                for (int i = 0; i < myService.providers.size(); i++) {
                    System.out.println("-" + myService.providers.get(i));
                }
                String pro = strVal.nextLine();
                // factory method
                myProvider = myService.getProvider(pro.toLowerCase());
                myProvider.form.fillForm();

                Payment.run((Customer) u,myProvider.getForm());

            } else if (service.contains("internet")) {
                myService = new InternetPayment();
                System.out.println("Write the name of your provider");
                for (int i = 0; i < myService.providers.size(); i++) {
                    System.out.println( "-" + myService.providers.get(i));
                }
                String pro = strVal.nextLine();
                // factory method
                myProvider = myService.getProvider(pro);
                myProvider.form.fillForm();
                Payment.run((Customer) u,myProvider.getForm());
            } else if (service.contains("land line")) {
                myService = new LandLine();
                System.out.println("Write the name of your provider");
                for (int i = 0; i < myService.providers.size(); i++) {
                    System.out.println("-" + myService.providers.get(i));
                }
                String pro = strVal.nextLine();
                // factory method
                myProvider = myService.getProvider(pro);
                myProvider.form.fillForm();
                Payment.run((Customer) u,myProvider.getForm());
            } else if (service.contains("donat")) {
                myService = new Donation();
                System.out.println("Donate to : (enter the name)");
                for (int i = 0; i < myService.providers.size(); i++) {
                    System.out.println("-" + myService.providers.get(i));
                }
                String pro = strVal.nextLine();
                // factory method
                myProvider = myService.getProvider(pro);
                myProvider.form.fillForm();
                Payment.run((Customer) u,myProvider.getForm());
            }
            System.out.println("Enter the (name) of another Service , or (no) to exit ?");
            service = strVal.nextLine();
        }
    }
}
