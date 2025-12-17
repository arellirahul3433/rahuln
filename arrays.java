public class arrays {
    public static void main(String[] args) {
        String[] names = {"rahul","sanju","mohan","arun","ajay","vijay","deepak","sachin","rohit","virat"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
        System.out.println("current 1st name:");
        System.out.println(names[0]);
        System.out.println("updating 1st name:");
        names[0] = "raghava";
        System.out.println(names[0]);
        System.out.println("updated names list:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
