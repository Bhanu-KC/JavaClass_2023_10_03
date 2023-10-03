import java.util.Random;
import java.util.Scanner;

public class Number_guesser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random ran = new Random();
        int limit = 10;
        int int_random = ran.nextInt(limit);
        boolean guess = false;
        while (!guess) {

            System.out.println("Enter Your Guess.The range 0-9");
            int guessed = sc.nextInt();
            if (int_random == guessed) {
                System.out.println("The guess is correct");
                break;
            }
            else {
                System.out.println("Try again");
            }
            System.out.println("Want to quit type quit to leave");
            String escape = sc.next();
            if (escape.equals("quit")) {
                break;
            }
        }
    }
}
