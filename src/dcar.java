class dcar extends Vehicle{

    private String bodystyle;

    public dcar (String make, String color, int year, String model, String bodystyle){
        super(make, color,year,model); // calling parrent class
        this.bodystyle = bodystyle;
    }
    public void carDetails(){ // details of the car
        printDetails();
        System.out.println("BodyStyle: " + bodystyle);
    }
}