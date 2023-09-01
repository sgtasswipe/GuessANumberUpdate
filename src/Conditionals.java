public class Conditionals {
    public static void main(String[] args) {
        // The use of if and if else
        int time = 22;
        int x = 20;
        int y = 12;
        if (time < y) { // new { after starting the if statement.
            System.out.println("Good morning!");
        } else if (time <= 18) {
            System.out.println("Good day!");
        }
        else {                                      // always ends with else
            System.out.println("Good evening!");
        }
        // A other way to do if statements using ternary operator
        // instead of the above you can use the following
        int time1 = 20;
        String result = (time1 < 18) ? "Good day" : "Good evening";
        System.out.println(result);
    }
    }
