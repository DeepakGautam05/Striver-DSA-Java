import java.util.Scanner;

public class input {
    public static void main(String[] args)
    {
        System.out.println("Taking Input from User");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number 1: ");
//        int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("Enter number 2: ");
//        int b = sc.nextInt();
        float b = sc.nextFloat();
        Float sum = a+b;
        System.out.println("the sum of two numbers is : ");
        System.out.println(sum);
        System.out.println("Numbers swapping");
    }
}
