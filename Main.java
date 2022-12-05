import java.util.ArrayList;
import java.util.Scanner;

/* Refund method flow
 * after the login
 * the customer choose to make a refund request which invoke(makeRefundRequest from the customer class)
 * The makeRefundRequest will:
 *  create a Storage object
 *  invoke
 *
 */

public class Main {

    // you can instead of getting the service as a word from the user:
    // you can print a numbered menu and he only enter the number of the service or choice he want
    // that way it will be easer for us

    public static ArrayList<String> myAppServicese = new ArrayList<>() ;
    public static ServiceProvider myProvider ;
    public static Service myService ;

    public static void main(String[] args) {

        appConfiguration();
    }


    public static void appConfiguration(){

        myAppServicese.add("Internet Payment") ;
        myAppServicese.add("Mobile Payment") ;
        myAppServicese.add("Land-line Payment") ;
        myAppServicese.add("Donation") ;
        Storage d = new Storage();
        Customer cus = null;
        Autrtication_system Autrtication = new Autrtication_system();
        cus = Autrtication.Autrticationsystem(d);
        int choose ;
        String str ;
        Scanner strVal = new Scanner(System.in) ;
        Scanner intVal = new Scanner(System.in) ;

        System.out.println("enter :");
        System.out.println("1- search for a service");
        System.out.println("2- see all services");
        System.out.println("3- make a refund request");
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
                    cus.makeRefundRequest() ;
                    flag = true ;
                    break;
                }
                default:  {
                    System.out.println("enter a valid number");
                    choose = intVal.nextInt() ;
                }
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
                myProvider.getForm();

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
                myProvider.getForm() ;
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
                myProvider.getForm() ;
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
                myProvider.getForm() ;
            }
            System.out.println("Enter the (name) of another Service , or (no) to exit ?");
            service = strVal.nextLine() ;
        }
    }
}