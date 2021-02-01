package Pairprogram;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class Driver {

    public static void main(String[] args) {

        String[] msgs = {"yes", "no", "maybe", "definitely not",
                "without a doubt", "most likely", "signs point to yes",
                "outlook bad"};

        // Magic eight ball
        MagicEightBall m = new MagicEightBall(new Color(200, 100, 55), msgs);


        // to call shake() methods (It will try to do 10 times testing)
        for (int i = 1; i <= 10; i++) {
            String msg = m.shake();
            System.out.println("===== This is [" + i + "] =====");
            System.out.println("You shake the magic eight ball.");
            System.out.println("The ball says: " + msg);

            // determined the color of magic eight ball
            Random random = new Random();
            int r = random.nextInt(255);
            int g = random.nextInt(255);
            int b = random.nextInt(255);
            Ball one = new Ball(new Color(r, g, b));

            // create an arraylist to hold Ball objects
            ArrayList<Ball> list = new ArrayList<>();
            list.add(one);
            System.out.println("Ball color: " + list);
        }
    }
}
