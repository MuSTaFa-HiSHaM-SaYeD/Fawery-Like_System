package All.DiscountSystem;

import All.StorageSystem.Storage;

import static java.util.Objects.isNull;

public class PraintDiscoutList {
    public void print(Storage d)
    {
        if(isNull(d.getDiscounts()))
        {
            System.out.println("there is no offers");
        }
        else {
            for (int i = 0; i < d.getDiscounts().size(); i++) {
                System.out.print(i + "-");

                System.out.print("id: " + d.getDiscounts().get(i).getId() + " ");
                System.out.println("DiscountPersantage" + d.getDiscounts().get(i).getDiscountPersantage());
                if (isNull(d.getDiscounts().get(i).getMax_num_of_transaction_Discount())) {
                    //do no thing
                } else {
                    System.out.println("getMax num of transaction Discount: " + d.getDiscounts().get(i).getMax_num_of_transaction_Discount());
                }
                if (isNull(d.getDiscounts().get(i).getNameOfSevecesDiscount())) {
                    //do no thing
                } else {
                    System.out.println("offer about services " + d.getDiscounts().get(i).getNameOfSevecesDiscount());
                }
            }
        }
    }
}
