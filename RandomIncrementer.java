package Pairprogram3;
import java.util.Random;

public class RandomIncrementer implements Incrementable{

    //field
    private int number;

    // constructor
    public RandomIncrementer() {

    }

    public int RandomIncrementer(int value) {
        Random ran = new Random();
        number = value;
        number = ran.nextInt(101) - 1;
        return number;
    }

    public int increment() {
        Random ran = new Random();
        number += ran.nextInt(11) - 1;
        return number;
    }

    @Override
    public int getValue() {
        return 0;
    }

    @Override
    public String toString() {
        return "RandomIncrementer{" +
                "number=" + number +
                '}';
    }
}
