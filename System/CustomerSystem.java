package System;

import Authentication.Authentication;
import Authentication.AuthenticationSystem;
import Storage.Storage;
import Users.Customer;
import Users.User;
import Providers.ServiceProvider;
import Refund.Refund;
import Services.*;

import java.util.ArrayList;
import java.util.Scanner;



public class CustomerSystem {
    static ArrayList<String> myAppServicese = new ArrayList<>() ;
    static ServiceProvider myProvider ;
    static Service myService ;
    public static boolean appConfiguration(Storage d){

        AuthenticationSystem Auth = new AuthenticationSystem();
        User U = new Customer();
        U = Auth.Authentication(d,U);
        myAppServicese.add("Internet Payment") ;
        myAppServicese.add("Mobile Payment") ;
        myAppServicese.add("Land-line Payment") ;
        myAppServicese.add("Donation") ;
        boolean RetFlage = true;
        int choose ;
        String str ;
        Scanner strVal = new Scanner(System.in) ;
        Scanner intVal = new Scanner(System.in) ;

        System.out.println("enter :");
        System.out.println("1- search for a service");
        System.out.println("2- see all services");
        System.out.println("3- make a refund request");
        System.out.println("4- log out");
        choose = intVal.nextInt() ;
        boolean flag = false ;
        while(flag==false) {
            switch (choose){
                case 1:  {
                    search() ;
                    flag = true ;
                    break;
                }
                case 2:  {
                    listServices() ;
                    flag = true ;
                    break;
                }
                case 3:  {
                    new Refund().makeRefundRequest(U);
                    flag = true ;
                    break;
                }
                case 4:  {
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
    public static void listServices(){
        for (int i=0 ; i<myAppServicese.size() ; i++){
            System.out.println( "-" + myAppServicese.get(i));
        }
        getLogic();
    }
    public static void search(){
        getLogic();
    }
    public static void getLogic() {
        String service;
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
                myProvider.getForm();

            } else if (service.contains("internet")) {
                myService = new InternetPayment();
                System.out.println("Write the name of your provider");
                for (int i = 0; i < myService.providers.size(); i++) {
                    System.out.println((i + 1) + " " + myService.providers.get(i));
                }
                String pro = strVal.nextLine();
                // factory method
                myProvider = myService.getProvider(pro);
                myProvider.getForm();
            } else if (service.contains("land line")) {
                myService = new LandLine();
                System.out.println("Write the name of your provider");
                for (int i = 0; i < myService.providers.size(); i++) {
                    System.out.println((i + 1) + " " + myService.providers.get(i));
                }
                String pro = strVal.nextLine();
                // factory method
                myProvider = myService.getProvider(pro);
                myProvider.getForm();
            } else if (service.contains("donat")) {
                myService = new Donation();
                System.out.println("Donate to : (enter the name)");
                for (int i = 0; i < myService.providers.size(); i++) {
                    System.out.println((i + 1) + " " + myService.providers.get(i));
                }
                String pro = strVal.nextLine();
                // factory method
                myProvider = myService.getProvider(pro);
                myProvider.getForm();
            }
            System.out.println("Enter the (name) of another Service , or (no) to exit ?");
            service = strVal.nextLine();
        }
        
        strVal.close();
        intVal.close();
    
    }
}
