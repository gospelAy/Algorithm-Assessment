package solution;

import java.util.Scanner;

public class Calculate1And30 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(numbers());
    }

    public static String numbers() {
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            System.out.println("Enter any number between 1 and 30 ");
            int number = scanner.nextInt();

            if (number > 30 && number % 30 == 0) {
                System.out.println("kindly enter a number that is divisible by 3");
                sum = number + number;
            }
        }
        return "the sum of the number is " + (int) sum;
    }
}