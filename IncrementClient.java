package Pairprogram3;

public class IncrementClient {

    public static void main(String[] args) {

        SequentialIncrementer incrementer = new SequentialIncrementer();
        RandomIncrementer ranIncrementer = new RandomIncrementer();
        RandomIncrementer ranValue = new RandomIncrementer();

        // These are default number as zero.
        int sValue = 0;
        int rValue = 0;
        int fValue = 0;

        rValue = ranIncrementer.RandomIncrementer(rValue);
        // It is increasing number four times.
        for (int i = 1; i <= 4; i++) {
            sValue = incrementer.SequentialIncrementer(sValue);

            fValue = rValue + ranValue.increment();

            System.out.println("=======Each result [" + i + "]========");
            System.out.println("Sequential Value: " + sValue);
            System.out.println("Random Value: " + fValue);
        }

    }

}
