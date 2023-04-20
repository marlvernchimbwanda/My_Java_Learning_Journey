class Circle extends Shape{
    private double radius;

    // contsructor
    public Circle (double radius){
        this.radius = radius;
    }

    // method to calculate area

    public double getArea(){
        return 3.14* radius * radius;
    }
}