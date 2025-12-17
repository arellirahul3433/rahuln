import java.util.Scanner;

public class resume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your Name : ");
        String name = scanner.nextLine();
        System.out.println("enter your Email : ");
        String Email = scanner.nextLine();
        System.out.println("enter your phoneno : ");
        String phoneno = scanner.nextLine();
        System.out.println("enter your Project: ");
        String project1 =  scanner.nextLine();
        String project2 =  scanner.nextLine();
        System.out.println("enter your internship: ");
        String internship =  scanner.nextLine();
        System.out.println("enter your certificates : ");
        String certificate1 = scanner.nextLine();
        String certificate2 = scanner.nextLine();
        System.out.println("enter your skills : ");
        String skill1 = scanner.nextLine();
        String skill2 = scanner.nextLine();
        System.out.println(("          *** Resume ***         "));
        System.out.println("Name                : " + name);
        System.out.println("Email               : " + Email);
        System.out.println("Phone No            : " + phoneno);
        System.out.println("---------------------------------");
        System.out.println("Projects            : " + project1 );
        System.out.println("                      " + project2);
        System.out.println("Internship          : " + internship);
        System.out.println("---------------------------------");
        System.out.println("Certificates        : " + certificate1);
        System.out.println("                      " + certificate2);
        System.out.println("Skills              : " + skill1);
        System.out.println("                      " + skill2);
        scanner.close();
    }

}
