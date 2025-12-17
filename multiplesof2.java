public class multiplesof2 {
    public static void main(String[] args) {
        int[] multiples = new int[10];
        for (int i = 0; i < multiples.length; i++) {
            multiples[i] = (i + 1) * 3;
        }
        System.out.println("Multiples of 3:");
        for (int i = 0; i < multiples.length; i++) {
            System.out.println(multiples[i]);
        }
    }
}