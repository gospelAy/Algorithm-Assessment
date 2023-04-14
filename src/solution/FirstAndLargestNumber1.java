package solution;

import java.util.Scanner;

public class FirstAndLargestNumber1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int number = 1;
        while (number <= 2){
            System.out.println("Enter firstNumber");
            int firstNumber = scanner.nextInt();

            System.out.println("Enter secondNumber");
            int secondNumber = scanner.nextInt();

            System.out.println("Enter third number");
            int thirdNumber = scanner.nextInt();

            if (firstNumber > secondNumber && firstNumber > thirdNumber){
                System.out.println(firstNumber + " is the largest of all numbers ");

            } else if (secondNumber > firstNumber && secondNumber > thirdNumber) {
                System.out.println(secondNumber + " is the largest of all numbers");

            } else if (thirdNumber > firstNumber && thirdNumber > secondNumber) {
                System.out.println(thirdNumber + " is the largest of all numbers");
            }
            number++;
        }
    }
}
