import java.util.Random;

public class WhileDemo {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(21) -10 ;
        while (number == 0) {
        number = random.nextInt(21) -10;

        }
        System.out.println(number);
    }
}
