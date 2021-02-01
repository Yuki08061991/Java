package Pairprogram;
import java.awt.Color;
import java.util.Random;

public class MagicEightBall extends Ball {

    private String[] messages;

    public MagicEightBall(Color color, String[] messages) {
        super(color);
        this.messages = messages;
    }

    public int getTotalMessages() {
        return messages.length;
    }

    public String getMessage(int number) {
        return messages[number];
    }

    public String shake() {
        Random random = new Random();
        return messages[random.nextInt(getTotalMessages())];
    }
}
