import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println(random.nextInt(6)+1);  // otherwise the dice can roll a 0
        System.out.println(random.nextInt(21) -10);  // random number between -10 and + 10. -10
                                                    // -10 indicates that we start at position -10
        int number = random.nextInt(21)-10;
        if (number == 0) {
            number = 1;
            System.out.println(number);
        }
    }



}
