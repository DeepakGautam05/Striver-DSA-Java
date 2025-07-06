import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SolidRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for(int j = 1; j<=n-1; j++){
            System.out.print("*");
            }
            System.out.println("");
        }
    }
}