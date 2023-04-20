public class User {

    //Public fileds
    public String userName;
    public String password;

    // parameterized class to create new users

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;

    }

    public void login(String userName, String password) {
        if (this.userName.equalsIgnoreCase(userName) && this.password.equalsIgnoreCase(password)) {

            System.out.println("Access Granted against the username :" + this.userName + " and password: " + this.password);

        }
        else System.out.println("Invalid credentials !!");
    }

}
