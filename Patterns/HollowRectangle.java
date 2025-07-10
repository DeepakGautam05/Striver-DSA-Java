public class HollowRectangle {
    public static void main(String[] args)
    {
        int rows = 4; // Assign a value
        int col = 5;  // Assign a value

        for (int i = 1; i <= rows; i++) {  // Loop through rows
            for (int j = 1; j <= col; j++) {  // Loop through columns
                // Print '*' at borders
                if (i == 1 || i == rows || j == 1 || j == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // Move to next row
        }
    }
}
