package All.StorageSystem;

import All.StorageSystem.Storage;

public class CreatID {
    String ID;
    Storage D;

    public CreatID(Storage D) {
        this.D = D;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public String createID() {
        int temp = Integer.parseInt(D.getLastID()) + 1;
        ID = Integer.toString(temp);
        return ID;
    }
}
