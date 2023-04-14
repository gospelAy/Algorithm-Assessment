package solution;

import java.util.Objects;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 29;
        String month = "May";

        while (true) {
            System.out.println("Guess my age");
            int firstAge = scanner.nextInt();
            if (firstAge == age) {
                System.out.println("you finally got it ");
            } else System.out.println("incorrect Guess");
            if (firstAge != age)
                continue;

            System.out.println("Guess my date");
            String monthOfBirth = scanner.nextLine();
            scanner.nextLine();
            if (Objects.equals(monthOfBirth, month)) {
                System.out.println("you finally got it");
                scanner.nextLine();
            }else System.out.println("incorrect Guess Kindly start again");
        }
     }
}


