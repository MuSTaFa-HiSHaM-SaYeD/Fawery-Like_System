package All.System;

import All.AutrticationSystem.AuthenticationSystem;
import All.DiscountSystem.DiscountAPP;
import All.StorageSystem.Storage;
import All.UserThings.Admin;
import All.UserThings.Customer;
import All.UserThings.User;
import All.refundSystem.Refund;

import java.util.Scanner;

public class AdminSystem {
    public void appConfiguration(Storage d)
    {
        Scanner strVal = new Scanner(System.in) ;
        Scanner intVal = new Scanner(System.in) ;
        DiscountAPP dis = new DiscountAPP();
        Refund ref = new Refund();
        AuthenticationSystem Auth = new AuthenticationSystem();
        User U = new Admin();

        boolean flag = false ;
        int choice1;
        while (flag==false)
        {
            U = Auth.Autrticationsystem(d,U);
            System.out.println("Select what you need");
            System.out.println("1- Add new discount");
            System.out.println("2- see refund requests");
            System.out.println("3- log out");
            choice1 = intVal.nextInt();
            switch (choice1){
                case 1:  {
                    dis.add_discounts(d);

                    break;
                }
                case 2:  {
                    ref.approveAndRejectRefundRequests();

                    break;
                }
                case 3:  {

                    flag = true ;
                    break;
                }
                default:  {
                    System.out.println("enter a valid number");
                    choice1 = intVal.nextInt() ;
                }
            }
        }
    }
}
