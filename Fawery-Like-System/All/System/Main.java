package All.System;


import All.StorageSystem.Storage;

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

    public static void main(String[] args) {
        Storage d = new Storage();
        boolean flag0 = true;
        Scanner strVal = new Scanner(System.in) ;
        Scanner intVal = new Scanner(System.in) ;
        while (flag0 == true)
        {

            CustomerSystem SysC = new CustomerSystem();
            AdminSystem SysA = new AdminSystem();
            int choice0 ;
            System.out.println("Select what you need");
            System.out.println("1- Iam Admin");
            System.out.println("2- Iam Customer");
            System.out.println("3- Exit");
            choice0 = intVal.nextInt();

            if ( choice0 == 1)
            {
                SysA.appConfiguration(d);
            }
            else if (choice0 == 2) {
                SysC.appConfiguration(d);

            }
            else if (choice0 == 3) {
                flag0=false;
            }
            else {
                System.out.println("Invalid Input");
            }

        }

    }

}