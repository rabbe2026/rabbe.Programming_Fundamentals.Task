import java.util.Scanner;


public class Task2EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        int n = sc.nextInt();

        int count = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 2; i <= n; i += 2) {
            if (count > 0) {
                sb.append(" ");
            }
            sb.append(i);
            count++;
        }

        System.out.println("Even numbers:");
        System.out.println(sb);
        System.out.println("Count: " + count);
        sc.close();
    }
}
