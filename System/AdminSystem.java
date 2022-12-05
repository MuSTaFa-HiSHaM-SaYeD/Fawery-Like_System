package System;
import Authentication.AuthenticationSystem;
import Discount.DiscountAPP;
import Storage.Storage;
import Users.Admin;
import Users.User;
import Refund.Refund;

import java.util.Scanner;

public class AdminSystem {
    public boolean appConfiguration(Storage d)
    {
        Scanner intVal = new Scanner(System.in) ;
        DiscountAPP dis = new DiscountAPP();
        Refund ref = new Refund();
        AuthenticationSystem Auth = new AuthenticationSystem ();
        User U = new Admin();

        boolean flag0 = false;
        boolean flag1 = true;
        int choice1;
        while (flag1)
        {
            U = Auth.Authentication(d,U);
            System.out.println("Select what you need");
            System.out.println("1- Add new discount");
            System.out.println("2- see refund requests");
            System.out.println("3- log out");
            System.out.println("4- Exit");
            choice1 = intVal.nextInt();
            if(choice1 == 1)
            {
                dis.run();
                flag1=false;
            }
            else if (choice1 == 2) {
                ref.approveAndRejectRefundRequests();
                flag1=false;
            }
            else if (choice1 == 3) {
                flag0 = true;
                flag1=false;
            }
            else if (choice1 == 4) {
                flag1=false;
            }
            else {
                System.out.println("Invalid Input");
            }
        }
        intVal.close();

        return flag0;
    }
}
