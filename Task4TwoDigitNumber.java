
public class Task4TwoDigitNumber {
    public static void main(String[] args) {
        int answer = -1;

        for (int number = 10; number <= 99; number++) {
            int tens = number / 10;
            int ones = number % 10;
            int reversed = ones * 10 + tens;

            if (tens * 2 == ones && reversed - number == 36) {
                answer = number;
                break;
            }
        }

        System.out.println("The number is: " + answer);
    }
}
