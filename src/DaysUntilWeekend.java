import java.util.Scanner;

public class DaysUntilWeekend {
    public static void main(String[] args) {
        // ternary operator
        int daysUntillWeekend;
        Scanner in = new Scanner(System.in);
        System.out.println("How many days untill weekend");
        daysUntillWeekend = in.nextInt();
        in.nextLine();
        String str = (daysUntillWeekend==1) ? "day" : "days";
        System.out.printf("There are %d %s untill weekend", daysUntillWeekend, str);


    }
}
