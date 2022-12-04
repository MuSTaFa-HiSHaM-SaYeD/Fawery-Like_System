package All.MainProgram;

import All.AutrticationSystem.Autrtication_system;
import All.AutrticationSystem.*;
import All.Discount.*;
import All.MainProgram.*;
import All.providers.*;
import All.services.*;
import All.UserThings.*;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static ArrayList<String> myAppServicese = new ArrayList<>() ;
    public static Providers myProvider ;
    public static Services myService ;
    public static void main(String[] args) {
        // set myAppServices list
        appConfiguration();



    }
    public static void appConfiguration(){

        myAppServicese.add("Internet Payment") ;
        myAppServicese.add("Mobile Payment") ;
        myAppServicese.add("Land-line Payment") ;
        myAppServicese.add("Donation") ;

        Data d = new Data();
        Autrtication_system Autrtication = new Autrtication_system();
        Autrtication.Autrticationsystem(d);

        int choose ;
        String str ;
        Scanner strVal = new Scanner(System.in) ;
        Scanner intVal = new Scanner(System.in) ;

        System.out.println("enter :");
        System.out.println("1 to search for a service");
        System.out.println("2 to see all services");
        choose = intVal.nextInt() ;
        switch (choose){
            case 1:  {
                search() ;
                break;
            }
            case 2:  {
                listServices() ;
                break;
            }
            case 3:  {
                break;
            }
            default:  {
                System.out.println("enter a valid number");
                choose = intVal.nextInt() ;
            }
        }


    }
    public static void listServices(){
        for (int i=0 ; i<myAppServicese.size() ; i++){
            System.out.println((i+1) + " " + myAppServicese.get(i));
        }
        getLogic();
    }
    public static void search(){
        getLogic();
    }
    public static void getLogic(){
        String service ;
        Scanner strVal = new Scanner(System.in) ;
        Scanner intVal = new Scanner(System.in) ;
        System.out.println("enter the service (name) if you want to continue , or (no) to exit");
        service = strVal.nextLine() ;
        while(!service.contains("no")){

            if(service.contains("mobile")){
                myService = new MobileRecharge() ;
                System.out.println("Write the name of your provider");
                for(int i=0 ; i<myService.providers.size() ; i++){
                    System.out.println((i+1) + " " + myService.providers.get(i)) ;
                }
                String pro = strVal.nextLine() ;
                // factory method
                myProvider = myService.getProvider(pro.toLowerCase()) ;
                System.out.println("you got "+myProvider.name);

            }
            else if(service.contains("internet")){
                myService = new InternetPayment() ;
                System.out.println("Write the name of your provider");
                for(int i=0 ; i<myService.providers.size() ; i++){
                    System.out.println((i+1) + " " + myService.providers.get(i)) ;
                }
                String pro = strVal.nextLine() ;
                // factory method
                myProvider = myService.getProvider(pro) ;
                System.out.println("you got "+myProvider.name);
            }
            else if(service.contains("land line")){
                myService = new LandLine();
                System.out.println("Write the name of your provider");
                for(int i=0 ; i<myService.providers.size() ; i++){
                    System.out.println((i+1) + " " + myService.providers.get(i)) ;
                }
                String pro = strVal.nextLine() ;
                // factory method
                myProvider = myService.getProvider(pro) ;
                System.out.println("you got "+myProvider.name);
            }
            else if(service.contains("donat")){
                myService = new Donation();
                System.out.println("Donate to : (enter the name)");
                for(int i=0 ; i<myService.providers.size() ; i++){
                    System.out.println((i+1) + " " + myService.providers.get(i)) ;
                }
                String pro = strVal.nextLine() ;
                // factory method
                myProvider = myService.getProvider(pro) ;
                System.out.println("you got "+myProvider.name);
            }
            System.out.println("Enter the (name) of another Service , or (no) to exit ?");
            service = strVal.nextLine() ;
        }
    }
}














