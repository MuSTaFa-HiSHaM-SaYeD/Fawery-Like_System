package All.DiscountSystem;



import All.StorageSystem.CreatID;
import All.StorageSystem.Storage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DiscountAPP {
    public void remove_discounts(Storage d,String id)
    {
        d.getDiscounts().remove(id);
    }


    public void add_discounts(Storage d)
    {
        HashMap<String, Discount> Discounts = new HashMap<String, Discount>();
        Discounts= d.getDiscounts();

        Scanner intVal = new Scanner(System.in);
        boolean flag1 = true;
        CreatID id = new CreatID(d);
        while (flag1)
        {
            System.out.println("Select what you need");
            System.out.println("1- Add add overall discount");
            System.out.println("2- Add  SpecificDiscount");

            int choice1 = intVal.nextInt();


            if(choice1 == 1)
            {
                System.out.println("please enter Max num of transaction you need to add discount and enter num of discount");
                System.out.println("for ex:");
                System.out.println(" 1");
                System.out.println(" 20");
                int choice2 = intVal.nextInt();
                int choice3 = intVal.nextInt();
                Discount disco = new Discount();
                disco.setMax_num_of_transaction_Discount(choice2);
                disco.setDiscountPersantage(choice3);
                id.createID();
                disco.setId(id.getID());
                Discounts.put(id.getID(), disco);
                flag1=false;
            }
            else if (choice1 == 2) {
                boolean flag0 = true;
                System.out.println("please chose num of discount");
                int choice4 = intVal.nextInt();
                Discount disco = new Discount();
                disco.setDiscountPersantage(choice4);

                System.out.println("please chose seveice");
                System.out.println("1- internet payment") ;
                System.out.println("2- mobile payment") ;
                System.out.println("3- land-line payment") ;
                System.out.println("4- donation");
                int choice5 = intVal.nextInt();
                while (flag0)
                {
                    switch (choice5){
                        case 1:  {
                            disco.setNameOfSevecesDiscount("internet");
                            id.createID();
                            disco.setId(id.getID());
                            Discounts.put(id.getID(),disco);
                            break;
                        }
                        case 2:  {
                            disco.setNameOfSevecesDiscount("mobile");
                            id.createID();
                            disco.setId(id.getID());
                            Discounts.put(id.getID(),disco);
                            break;
                        }
                        case 3:  {
                            disco.setNameOfSevecesDiscount("land line");
                            id.createID();
                            disco.setId(id.getID());
                            Discounts.put(id.getID(),disco);
                            break;
                        }
                        case 4:  {
                            disco.setNameOfSevecesDiscount("donat");
                            id.createID();
                            disco.setId(id.getID());
                            Discounts.put(id.getID(),disco);
                            break;
                        }
                        default:  {
                            System.out.println("enter a valid number");
                        }
                    }
                }
                flag1=false;
            }
            else if (choice1 == 3) {

                flag1=false;
            }
            else if (choice1 == 4) {
                flag1=false;
            }
            else {
                System.out.println("Invalid Input");
            }
        }
    }








}
