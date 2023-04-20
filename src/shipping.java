import com.sun.jdi.Value;
// an exmple to show the importance of encapsulation
public class shipping {
    private static final int MIN_WEIGHT = 1;
    private int weight;

    public int getWeight(){
        return weight;
    }
    public void setWeight(int value){
        weight = Math.max(MIN_WEIGHT, value);

    }

}
