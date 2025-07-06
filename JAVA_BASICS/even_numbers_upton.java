import java.util.Scanner;

public class even_numbers_upton {
    public static void printEvenNumbers(int n){
        System.out.println("Even numbers up to " + n + ":");
        for (int i = 2; i <= n; i +=2){
            System.out.print( i + " ");  // Don't Use ' ' here because it add the ASCII value insted of real outputs
        }
    }

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        // Call the method
        printEvenNumbers(n);
    }
}


