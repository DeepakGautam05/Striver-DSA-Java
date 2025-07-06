public class sum_upto_n {
    public static void main(String[] args) {
        int n = 4;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Addition is: " + sum);
    }
}
