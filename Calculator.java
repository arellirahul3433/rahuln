import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== Calculator ===");
        
        
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();
        
       
        System.out.print("Enter operator (+, -, *, /, %): ");
        char operator = sc.next().charAt(0);
        
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();
        
        double result = 0;
        boolean validOperation = true;
        
        
        switch(operator) {
            case '+':
                result = num1 + num2;
                System.out.println("\nOperation: Addition");
                break;
            case '-':
                result = num1 - num2;
                System.out.println("\nOperation: Subtraction");
                break;
            case '*':
                result = num1 * num2;
                System.out.println("\nOperation: Multiplication");
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("\nOperation: Division");
                } else {
                    System.out.println("\nError: Cannot divide by zero!");
                    validOperation = false;
                }
                break;
            case '%':
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println("\nOperation: Modulus");
                } else {
                    System.out.println("\nError: Cannot perform modulus by zero!");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("\nError: Invalid operator!");
                validOperation = false;
        }
        
        if (validOperation) {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
        }
        
        sc.close();
    }
}
