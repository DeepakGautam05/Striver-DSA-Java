//****
//***
//*
//This prints a reverse half pyramid (upside down triangle).


        package Patterns;

public class Reverse_HalfPyramid {
    public static void main(String[] args) {
        int n = 6;
        for (int i = n; i >= 1; i--) {   // Here we are doing a step . Reversing Outer Loop (i → n to 1)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
