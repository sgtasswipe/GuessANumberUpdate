import java.util.Random;
import java.util.Scanner;

public class HiorLo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int targetNumber;
        int userGuess;
        int score = 0;
        Boolean even;
        System.out.println("Welcome to guess a number!");
        System.out.println("Guess a number between 1 and 10");
        targetNumber = random.nextInt(10 + 1);




        while (score<3) {    //maximum of 3 guesses. The program will stop after 3 incorrect guesses

            userGuess = in.nextInt();
            in.nextLine(); //scanner bug
            if (userGuess < targetNumber) {
                System.out.println("Higher!");
                score++;
                System.out.println("Your current score is " + score);
            } else if (userGuess > targetNumber) {
                System.out.println("Lower!");
                score++;
                System.out.println("Your current score is " + score);
            }
            else {
                System.out.println("You've guessed the number!");

                targetNumber = random.nextInt(10) + 1;

            break;

            }
            if (score==3 ) {   //if the player uses all guesses, the program will end.
                System.out.println("Youve run out of guesses! Try again");
                System.out.println("The correct number is: " + targetNumber);
            }
            if (score==2) {
                 if (targetNumber % 2 == 0) {  // means the number is even

                    System.out.println("Hint: The number is even");
                } else {
                    System.out.println("Hint: The number is odd");  // if not even, must be odd
                }
            }
            }

            }


        }


