package All.UserThings;

public abstract class WaysMoneyStored {
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
