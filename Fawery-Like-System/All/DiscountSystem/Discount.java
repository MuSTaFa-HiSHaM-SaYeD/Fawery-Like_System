package All.DiscountSystem;

import All.services.Service;

public class Discount {
    String id = "0";
    public int DiscountPersantage;
    public int Max_num_of_transaction_Discount = Integer.parseInt(null);
    public String nameOfSevecesDiscount = null;

    public void setDiscountPersantage(int discountPersantage) {
        DiscountPersantage = discountPersantage;
    }

    public void setMax_num_of_transaction_Discount(int max_num_of_transaction_Discount) {
        Max_num_of_transaction_Discount = max_num_of_transaction_Discount;
    }

    public void setNameOfSevecesDiscount(String nameOfSevecesDiscount) {
        this.nameOfSevecesDiscount = nameOfSevecesDiscount;
    }

    public int getDiscountPersantage() {
        return DiscountPersantage;
    }

    public int getMax_num_of_transaction_Discount() {
        return Max_num_of_transaction_Discount;
    }

    public String getNameOfSevecesDiscount() {
        return nameOfSevecesDiscount;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
}
