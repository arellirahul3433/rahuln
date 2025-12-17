public class StudentPassFail {
    public static void main(String[] args) {
        int eng = 89;
        int soc = 56;
        int sci = 85;
        int mat = 28;

        
        int passingMarks = 35;

        System.out.println("Student Marks:");
        System.out.println("English: " + eng);
        System.out.println("Social Studies: " + soc);
        System.out.println("Science: " + sci);
        System.out.println("Mathematics: " + mat);
        System.out.println();

        boolean engPass = eng >= passingMarks;
        boolean socPass = soc >= passingMarks;
        boolean sciPass = sci >= passingMarks;
        boolean matPass = mat >= passingMarks;

        System.out.println("Subject-wise Status:");
        System.out.println("English: " + (engPass ? "PASS" : "FAIL"));
        System.out.println("Social Studies: " + (socPass ? "PASS" : "FAIL"));
        System.out.println("Science: " + (sciPass ? "PASS" : "FAIL"));
        System.out.println("Mathematics: " + (matPass ? "FAIL" : "PASS"));
        System.out.println();

        if (engPass && socPass && sciPass && matPass) {
            System.out.println("Overall Result: PASS");
        } else {
            System.out.println("Overall Result: FAIL");
        }

        int total = eng + soc + sci + mat;
        double percentage = (total / 400.0) * 100;
        System.out.println("Total Marks: " + total + "/400");
        System.out.println("Percentage: " + String.format("%.2f", percentage) + "%");
    }
}
