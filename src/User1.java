public class User1 {
    // good example of encapsulation
    private String userName;
    private String password;

    public User1 (String userName, String password){
        this.password= password;
        this.userName = userName;
    }

    public void login(String userName, String password){
        if (this.userName.equalsIgnoreCase(userName) && this.password.equalsIgnoreCase(password)){
            System.out.println("Access Granted fro user: " + this.userName);
        }
        else System.out.println("Access Denied!!!");
    }
}
