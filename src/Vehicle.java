public class Vehicle {
    private String make;
    private String color;
    private int year;
    private String model;

    // Parameterized contsructor

    public Vehicle (String make, String color, int  year, String model){
        this.make = make;
        this.year = year;
        this.color = color;
        this.model = model;
    }

    // public method to print details

    public void printDetails(){
        System.out.println("Manufacture: " + make);
        System.out.println("Color: " + color);
        System.out.println("Year" + year);
        System.out.println("Model" + model);

    }
}
