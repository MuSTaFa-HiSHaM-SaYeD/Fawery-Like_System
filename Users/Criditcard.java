package Users;

public class Criditcard {
    String ID;
    String Password;
    Criditcard(String ID,String Password)
    {
        this.ID = ID;
        this.Password = Password;
    }
    public void setID(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return ID;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getPassword() {
        return Password;
    }
}
