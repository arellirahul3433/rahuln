public class twosum {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int target = 9;
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    System.out.println("Pair found: " + numbers[i] + " + " + numbers[j] + " = " + target);
                    found = true;
                }
            }
        }

        if (!found) {
            System.out.println("No pairs found that sum to " + target);
        }
    }
}
