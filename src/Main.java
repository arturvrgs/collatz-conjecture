import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        *  Collatz Conjecture:
            1) Ask the user for an integer.
            2) Apply the conjecture formula until the number is 1.
           - If the number is even, divide by 2.
           - If the number is odd, multiply it by 3 and add 1
           - Print all iterations
           - Stop the program only when the result is 1
        *
        * */
        Scanner scan = new Scanner(System.in);

        System.out.println("Type an integer: ");
        int m = scan.nextInt();

        System.out.print(m + "->");

        while(m != 1) {
            if(m % 2 == 0) {
                m = m/2;
            } else  {
                m = (m*3) + 1;
            }
            if(m != 1)
                System.out.print(m + "->");
            else
                System.out.println(m);
        }

    }
}