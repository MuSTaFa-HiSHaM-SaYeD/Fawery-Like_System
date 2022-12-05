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
        while (flag0 == true)
        {
            Scanner strVal = new Scanner(System.in) ;
            Scanner intVal = new Scanner(System.in) ;
            CustomerSystem SysC = new CustomerSystem();
            AdminSystem SysA = new AdminSystem();
            int choice0;
            System.out.println("Select what you need");
            System.out.println("1- Iam Admin");
            System.out.println("2- Iam Customer");
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
                {
                    flag0 = true;
                }
                else {
                    flag0 = false;
                }
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