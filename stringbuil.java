import java.util.Scanner;
public class stringbuil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("string");
        String input = sc.nextLine();
        StringBuilder sb = new StringBuilder(input);
        sb.reverse();
        System.out.println("Reversed string: " + sb.toString());
        if (input.equals(sb.toString())) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
        sc.close(); 
    }
}
