import java.util.Scanner;

public class Eksemple {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age;
        System.out.println("What is your age?");
        age = in.nextInt();
        in.nextLine() ; // scanner bug

        if (age < 18) {
            System.out.println("You're too young! GET OUT");
        }
        else {
            System.out.println("Welcome to Monkey bar");
        }

    }
}
