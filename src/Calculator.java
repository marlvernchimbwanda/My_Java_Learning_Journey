public class Calculator {
    // Overloading making method perfom differnet operaatios based on the nature of the arguments.

    public double product (double x, double y){
        return x * y;
    }

    // overloading the function to handle three arguments

    public double product (double x, double y, double z){
        return x * y * z;

    }

    // overloading th function to handle int
    public double product (int x, int y){
        return x * y;
    }

}
