import java.util.Scanner;


public class Task5Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height (at least 2): ");
        int height = sc.nextInt();
        System.out.print("Enter width (at least 2): ");
        int width = sc.nextInt();

        if (height < 2 || width < 2) {
            System.out.println("Height and width must be at least 2.");
        } else {
            for (int row = 0; row < height; row++) {
                for (int col = 0; col < width; col++) {
                    if (row == 0 || row == height - 1 || col == 0 || col == width - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
