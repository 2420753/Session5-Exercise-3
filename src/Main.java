import java.util.Arrays;
import java.util.Scanner;

public class Main {
    private static final Scanner stdin = new Scanner(System.in);
    public static void main(String[] args) {
        double numbers[] = new double[5];
        numbers[0] = 0.234;
        numbers[1] = 0.999;
        numbers[2] = 1.999;
        numbers[3] = 28.899;
        numbers[4] = -0.8372;

        // User enters multiplier
        System.out.print("Enter a multiplier: ");
        double multiplier = stdin.nextDouble();

        // logic for multiplying the values and prints it to three decimal places.
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] *= multiplier;
            System.out.printf("%.3f\n", numbers[i]);

        }






    }
}