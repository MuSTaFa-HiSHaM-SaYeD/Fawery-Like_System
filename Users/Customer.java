package Users;

import Refund.Refund;

public class Customer extends User {

    Wallet wallet = new Wallet();
    Criditcard Card ;
/*
    public Customer(String Email, String name, String passwords)
    {
        this.Email = Email;
        this.name = name;
        this.passwords = passwords;
    }
*/

    public void setVisa(Criditcard visa) {
        this.Card = visa;
    }

    public Criditcard getVisa() {
        return Card;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public Wallet getWallet() {
        return wallet;
    }
    public void addcriditcard(String Email,String Pass)
    {
        Card = new Criditcard(Email,Pass);
    }

    public void makeRefundRequest(){
        
        Refund refund = new Refund();

        refund.makeRefundRequest(this);
    }
}
