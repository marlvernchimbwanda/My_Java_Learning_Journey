class Rectangle extends Shape{
    // private data memebers
    private double width;
    private double height;
    // Constructor for the rectangle
    public Rectangle (double width, double height){
        this.height = height;
        this.width = width;
    }
    // method to create area
    public double getArea(){
        return width * height;
    }
}

