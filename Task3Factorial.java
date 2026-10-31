import java.util.Scanner;


public class Task3Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer N (0 to 12): ");
        int n = sc.nextInt();

        if (n < 0 || n > 12) {
            System.out.println("N must be between 0 and 12.");
        } else {
            int result = 1; // 0! = 1
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            System.out.println(result);
        }
        sc.close();
    }
}
