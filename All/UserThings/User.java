package All.UserThings;

public abstract class User {
    String Email;
    String name;
    String passwords;
    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getEmail() {
        return Email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    public String getPasswords() {
        return passwords;
    }


}
