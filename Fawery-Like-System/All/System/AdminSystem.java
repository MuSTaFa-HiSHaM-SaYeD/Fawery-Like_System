package All.System;

import All.AutrticationSystem.AuthenticationSystem;
import All.Discount.DiscountAPP;
import All.StorageSystem.Storage;
import All.UserThings.Admin;
import All.UserThings.User;
import All.refundSystem.Refund;

import java.util.Scanner;

public class AdminSystem {
    public boolean appConfiguration(Storage d)
    {
        Scanner strVal = new Scanner(System.in) ;
        DiscountAPP dis = new DiscountAPP();
        Refund ref = new Refund();
        AuthenticationSystem Auth = new AuthenticationSystem();
        User U = new Admin();
        
        boolean flag0 = false;
        boolean flag1 = true;
        U = Auth.Autrticationsystem(d,U);
        
        while (flag1)
        {
            System.out.println("Select what you need");
            System.out.println("1- Add new discount");
            System.out.println("2- see refund requests");
            System.out.println("3- log out");
            System.out.println("4- Exit");
            
            Scanner intVal = new Scanner(System.in) ;
            int choice1 = intVal.nextInt();
            intVal.close();
            if(choice1 == 1)
            {
                dis.run();
            }
            else if (choice1 == 2) {
                ref.approveAndRejectRefundRequests();
                flag0 = true;
            }
            else if (choice1 == 3) {
                flag0 = true;
                flag1=false;
            }
            else if (choice1 == 4) {
                flag0 = false;
                flag1=false;
            }
            else {
                System.out.println("Invalid Input");
            }
        }

        return flag0;
    }
}
