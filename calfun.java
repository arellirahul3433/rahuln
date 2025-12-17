import java.util.Scanner;

public class calfun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===== Simple Calculator =====");
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();
        System.out.print("Enter second number: ");
        double b = sc.nextDouble();
        System.out.println("\n1.Add 2.Sub 3.Mul 4.Div 5.Mod");
        System.out.print("Choice (1-5): ");
        
        double result = switch(sc.nextInt()) {
            case 1 -> a + b;
            case 2 -> a - b;
            case 3 -> a * b;
            case 4 -> b == 0 ? 0 : a / b;
            case 5 -> b == 0 ? 0 : a % b;
            default -> { System.out.println("Invalid!"); yield 0; }
        };
        
        System.out.println("Result: " + result);
        sc.close();
    }
}
