public class stringbui{
    public static void main(String[] args) {
        StringBuilder sb =  new StringBuilder
        ("Hello");
        sb.append(" WORLD");
        System.out.println(sb);
        System.out.println(sb.reverse());
        
        if (sb.toString().equals("DLROW OLLEH")) {
            System.out.println("palindrome");
        } else {
            System.out.println("not a palindrome");
        }
    }
}
