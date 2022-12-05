import java.util.Scanner;

import System.AdminSystem;
import System.CustomerSystem;
import Storage.Storage;

public class Main {
    public static void main(String[] args) {
        Storage d = new Storage();
        boolean flag0 = true;
        while (flag0 == true)
        {
            Scanner strVal = new Scanner(System.in) ;
            Scanner intVal = new Scanner(System.in) ;
            CustomerSystem SysC = new CustomerSystem();
            AdminSystem SysA = new AdminSystem();
            int choice0;
            System.out.println("You Are ...?");
            System.out.println("1- Admin");
            System.out.println("2- Customer");
            System.out.println("3- Exit");
            choice0 = intVal.nextInt();

            if ( choice0 == 1)
            {
                boolean temp1;
                temp1 = SysA.appConfiguration(d);
                flag0 = temp1;
            }
            else if (choice0 == 2) {
                boolean temp2;
                temp2 = SysC.appConfiguration(d);
                if (temp2 == false)
                    flag0 = true;
                else 
                    flag0 = false; 
            }
            else if (choice0 == 3) 
                flag0=false;
            else 
                System.out.println("Invalid Input");

                strVal.close();
                intVal.close();
        
        }

    }

}