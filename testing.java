import java.util.Random;
import java.util.Scanner;

public class testing {
    public static void main(String[] args) {
        Random rc = new Random();
        Scanner sc = new Scanner(System.in);

        int target = rc.nextInt(100);
        int guess = 0;
        System.out.println("Number guessing game");
        System.out.println();

        while (guess != target) {
            System.out.println("Enter a number between 1 to 100");
            guess = sc.nextInt();
            if (guess == target) {
                System.out.println("You got the correct answer");
                break;
            } else if (guess < target) {
                System.out.println("Guessed number is less than target");
            } else {
                System.out.println("Guessed number is greater than target");
            }

        }

    }
}