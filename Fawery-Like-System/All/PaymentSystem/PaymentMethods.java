package All.PaymentSystem;

import All.AutrticationSystem.*;
import All.Discount.*;
import All.MainProgram.*;
import All.providers.*;
import All.services.*;
import All.UserThings.*;
import All.PaymentSystem.*;


import java.util.ArrayList;

public class PaymentMethods {

    private ArrayList<Payment> list;

    void remove(Payment payment){
        list.remove(payment);
    }

    void add(Payment payment){
        list.add(payment);
    }

    ArrayList<Payment> get(Payment payment) {
        return list;
    }
}
