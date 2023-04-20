public class Date {

    // Constructors name must be exactly the same as the name of its class

    // default constructor

    private int day;
    private int month;
    private int year;

    public Date() {
        day = 0;
        month = 0;
        year = 0;
    }
    // a simple print function


    // Parameterized constructor
    public Date(int day, int month, int year) {
        // the arguiments are used as values

         this.day = day;
        this.month = month;
        this.year =year ;
    }

    public void printDate() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }

}
