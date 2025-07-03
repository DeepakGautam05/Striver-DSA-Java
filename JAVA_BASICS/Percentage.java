import java.util.Scanner;

public class Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();

        int[] marks = new int[n];
        int totalMarks = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            totalMarks += marks[i];
        }

        int maxMarks = n * 100;
        double percentage = (totalMarks * 100.0) / maxMarks;

        System.out.print("Total Marks: " + totalMarks + " out of " + maxMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);

        sc.close();
    }
}
