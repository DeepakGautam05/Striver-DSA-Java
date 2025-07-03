import java.util.Scanner;

public class First {

    // Function to calculate the sum of two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Main method to execute the program
    // It reads two integers from the user and prints their sum
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two integers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Call the sum function and print the result
        int result = sum(a, b);
        System.out.println("The sum is: " + result);
    }
}
