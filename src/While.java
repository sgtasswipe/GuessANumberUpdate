public class While {
    public static void main(String[] args) {
        int n = 3;
        while (n != 1) {    // while n is NOT equal 1 the program or the loop will continue to run.
                            // If the condition is met, the loop will stop. Note that infinite loops happen
            System.out.println(n);
            if (n % 2 ==0) {     // modulos 2 equal 0 means its a even number
                n = n / 2;
            }
            else {              // therefor must the else be what happens when its a odd number
                n = 3 * n - 1;
            }
        }
            System.out.println("SUCCESSSSSS");


    }
}
