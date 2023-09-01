import java.util.Random;
import java.util.Scanner;

public class Opgaver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");

        String name = in.nextLine();
        System.out.println("What is your age?");
      int age =   in.nextInt();
      int age1 = age % 100;

        if (name.equals("") ) {
            System.out.println("Hello and welcome");

        }
        else {
            System.out.println("Hello and welcome " + name + " at " + age1 + " years old");
        }

        //opgave 5 skriv et program som der spørger om et tal og derefter siger om det er lige eller ulige
        System.out.println("Please enter a number. I will tell you if its even or odd");
        int number = in.nextInt();
        in.nextLine() ; // scanner bug
        if (number % 2 ==0) {
            System.out.println("Your number is even");

        } else {
            System.out.println("Your number is odd");
        } //opgave 5 done
        // opgave 7
        System.out.println("Please enter a number and ill tell you the square root");
        System.out.println( "If you enter 0 the program will stop");
        double num = in.nextInt();
        in.nextLine(); // scanner bug
        while (num != 0) {
             double squareRoot = Math.sqrt(num);
            System.out.println("Your number is " + num + " and the squareroot is " + squareRoot);

            num = in.nextDouble();


        }
        System.out.println(" Goodbye and thanks for playing");
            }
}
