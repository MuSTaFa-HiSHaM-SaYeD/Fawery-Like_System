package All.UserThings;

public class Customer extends User {

    Wallet wallet = new Wallet();
    // double wallet ;
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
    public boolean makeRefundRequest(){

        return false;
    }
}
