public class basictrycatch {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int result = a / b;
            System.out.print("Result: " + result);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}