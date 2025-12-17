public class duplicates {
    static int removeDuplicates(int[] a) {
        int j = 1;
        for (int i = 1; i < a.length; i++)
            if (a[i] != a[j - 1])
                a[j++] = a[i];
        return j;
    }

    public static void main(String[] args) {
        int[] a = {1,1,2,3,4,4,4,6,7,9,9};
        int n = removeDuplicates(a);

        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}