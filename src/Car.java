public class Car {
    // static fields

    static int top_Speed = 100;
    static int max_Capacity = 4;

    // non static fields

    int speed = 100;
    int capacity = 4;

    public void printSpeed(int speed){
        System.out.println("Speed: " + speed);
    }

    // getters and setters
    // a get method retrives the value particular to a data field
    // set method set its  value.

    public void setSpeed(int x)
    {
        speed = x;
    }
    // getter method to get the speed of the car
    public int getSpeed(){
        return speed;
    }

}
