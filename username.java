import java.util.*;

public class username {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name (e.g. Rahul or Rahul Sharma):");
        String input = sc.nextLine().trim();
        if (input.isEmpty()) {
            System.out.println("No name provided.");
            sc.close();
            return;
        }

        String clean = input.toLowerCase().replaceAll("[^a-z0-9 ]", "").replaceAll("\\s+", " ");
        String noSpace = clean.replace(" ", "");
        String noVowels = rmVowels(noSpace).isEmpty() ? noSpace : rmVowels(noSpace);

        List<String> sugg = new ArrayList<>();
        sugg.add(noVowels);
        sugg.add(noVowels + rand(2));
        sugg.add(noSpace);
        sugg.add(noSpace + rand(2));

        if (clean.contains(" ")) {
            String[] p = clean.split(" ");
            String f = rmVowels(p[0]).isEmpty() ? p[0] : rmVowels(p[0]);
            String l = rmVowels(p[p.length - 1]).isEmpty() ? p[p.length - 1] : rmVowels(p[p.length - 1]);
            sugg.add("" + f.charAt(0) + l);
            sugg.add(f + "." + l);
            sugg.add(f + "_" + l + rand(2));
        } else {
            sugg.add("" + noSpace.charAt(0) + noVowels);
            sugg.add(noVowels + "_" + rand(3));
        }

        int i = 1;
        System.out.println("Username suggestions:");
        for (String s : new LinkedHashSet<>(sugg)) {
            System.out.println(i + ". " + s);
            if (i++ == 5) break;
        }
        sc.close();
    }

    static String rand(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) sb.append(new Random().nextInt(10));
        return sb.toString();
    }

    static String rmVowels(String s) {
        return s == null ? "" : s.replaceAll("[aeiou]", "");
    }
}
