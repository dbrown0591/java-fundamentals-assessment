public class User extends Person{
    private boolean admin;
    private String firstname;
    private String lastname;


    public User(boolean admin, String firstname, String lastname) {
        this.admin = admin;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public boolean isAdmin() {
        return admin;
    }


}
