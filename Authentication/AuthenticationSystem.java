package Authentication;

<<<<<<< HEAD:Authentication/AuthenticationSystem.java
import Storage.Storage;
import Users.User;
=======

import All.StorageSystem.Storage;
import All.UserThings.User;
>>>>>>> 690aa6e457948e83421bd16e1d9c25713b446141:Fawery-Like-System/All/AutrticationSystem/AuthenticationSystem.java

import java.util.Scanner;

public class AuthenticationSystem {


    public User Authentication(Storage d, User user){
        SignUp s = new SignUp(d);
        SignIn l = new SignIn(d);

        int choose;

        String temp1;
        String temp2;
        String temp3;
        Scanner strVal = new Scanner(System.in);
        Scanner intVal = new Scanner(System.in);

        System.out.println("enter :");
        System.out.println("1 to Sign up");
        System.out.println("2 to log in");
        choose = intVal.nextInt();
        boolean flag = false;
        while (flag == false) {
            switch (choose) {
                case 1: {
                    System.out.println("please enter Email, username and passwords");
                    temp1 = strVal.nextLine();
                    temp2 = strVal.nextLine();
                    temp3 = strVal.nextLine();

                    user = s.Signin(temp1,temp2,temp3,user);

                    System.out.println("success sign up");
                    flag = true;
                    break;
                }
                case 2: {
                    System.out.println("please enter email and passwords");
                    temp1 = strVal.nextLine();
                    temp2 = strVal.nextLine();

                    user = l.loin(temp1,temp2);

                    System.out.println("success log in");

                    flag = true;
                    break;
                }
                default: {
                    System.out.println("enter a valid number");
                    choose = intVal.nextInt();
                }
            }
        }
        strVal.close();
        intVal.close();


        return user;

    }
}
