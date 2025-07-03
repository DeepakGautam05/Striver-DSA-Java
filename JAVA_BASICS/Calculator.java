import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbers : ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0); // always take one operator as a input

        double result ;
        switch (operator){
            case '+' :
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
                case '-' :
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
                case '*' :
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
                case '/' :
                    if (num2 == 0) {
                        System.out.println("!! Cannot Divide by Zero");
                    }
                    else {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    }
                break;
            case '%' :
                if (num2 == 0) {
                    System.out.println("❌ Error: Cannot modulo by zero!");
                } else {
                    result = num1 % num2;
                    System.out.println("Result: " + result);
                }
                break;

            default:
                System.out.println("❌ Invalid operator!");
        }

    }
}
