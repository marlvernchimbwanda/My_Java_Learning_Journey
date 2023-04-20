public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        shipping s = new shipping();
        s.setWeight(-3);
        // static fields
        System.out.println("the topspeed is " + Car.top_Speed);
        System.out.println(Car.max_Capacity);

        // non static fields
        Car obj1 = new Car();
        System.out.println("The Non Static speed field is " + obj1.speed);
        System.out.println("THe capacity is " + obj1.capacity);

        // printing speed from the method created
        obj1.printSpeed(1005);

        Car car1 = new Car();
        car1.setSpeed(234); //calling the setter method
        System.out.println(car1.getSpeed()); // calling the getter method

        //Calc
        Calculator cal = new Calculator();

        double x = 10;
        double y = 20;
        double z = 5;

        int a = 12;
        int b = 4;

        System.out.println(cal.product(x, y));
        System.out.println(cal.product(x, y, z));
        System.out.println(cal.product(a, b));

        // Constructors

        Date date = new Date(1, 5, 2028); // object created with default values
        date.printDate();

        // Encapusulaion bad example

        User educative = new User("Marlvern", "12134"); //creates a new user and stores the password and username

        educative.login("Marlvern", "12134"); // grants access because crdentials are correct
        educative.login("Marlvern", "122");
        educative.password = "122"; // somone chamges the password
        educative.login("Marlvern", "122");

        // Good Example
        User1 student = new User1("Marlvern", "#pass123");
        student.login("Marlvern", "#pass123");

        //Inheritance
        dcar elangtraSedan = new dcar("Hyundai", "Red", 2019, "Elantra", "Sedan");

        elangtraSedan.carDetails(); // calling method to prijnt details


        Shape[] shape = new Shape[2]; // creating a shape array of size 2
        shape[0] = new Circle(2); // creating a circle obl=ject at index 0
        shape[1] = new Rectangle(2, 3); // creating rectangle object at index 1

        // shape oblject is calling children classes method
        System.out.println("Area of the circle: " + shape[0].getArea());
        System.out.println("Area of the rectangle: " + shape[1].getArea());




    }

}