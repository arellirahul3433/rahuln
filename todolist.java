// import java.util.ArrayList;

// public class ArrayListBasics {
//     public static void main(String[] args) {
//         ArrayList<String> fruits = new ArrayList<>();
//         fruits.add("apple");
//         fruits.add("mango");
//         fruits.add("banana");
//         fruits.add("guava");

//         System.out.println("initial ArrayList:" + fruits);

//         String first = fruits.get(0);
//         System.out.println("first element:" + first);

//         fruits.set(1,"orange");
//         System.out.println("After set(1, \"orange\"):" + fruits);

//         fruits.set(2);
//         System.out.println("After remove(2):" + fruits);

//     }
// }
import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class todolist {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> Menu = new ArrayList<>();
        System.out.println("Please Enter your task1:- ");
        String A = sc.nextLine();
        Menu.add(A);
        System.out.println("Please enter Your Task2:- ");
        String B=sc.nextLine();
        Menu.add(B);
        System.out.println("Your tasks are:-" +Menu);
        System.out.println("Please Enter Your finished task");
        String C=sc.nextLine();
        if (C.equals(A)){
            Menu.remove(A);
            System.out.println("Your pending task is "+Menu);
        }
        else {
            Menu.remove(B);
            System.out.println("Your pending task is "+Menu);
        }

    }
}