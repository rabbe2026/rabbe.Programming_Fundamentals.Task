import java.util.Scanner;


public class Task6Primes {

    static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int d = 2; d * d <= num; d++) {
            if (num % d == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer N (at least 2): ");
        int n = sc.nextInt();

        StringBuilder sb = new StringBuilder();
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                if (sb.length() > 0) {
                    sb.append(" ");
                }
                sb.append(i);
            }
        }
        System.out.println(sb);
        sc.close();
    }
}
