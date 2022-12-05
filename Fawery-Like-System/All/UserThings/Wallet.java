package All.UserThings;


public class Wallet {
    int mony = 0;
    public void addmony(int cash)
    {
        mony += cash;
    }
    public void takemony(int cash)
    {
        mony -= cash;
    }

    public void setMony(int mony) {
        this.mony = mony;
    }

    public int getMony() {
        return mony;
    }
}
