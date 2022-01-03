package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt(); 

        // 123
        // 3
        // 3 * 10 + 2 
        // 32 * 10 + 1
        // 321

        int reverseNumber = 0;
        int manipulatedNumber = number;
        while (manipulatedNumber > 0) { 
          int nextDigit = manipulatedNumber % 10;
          reverseNumber = reverseNumber % 10 + nextDigit;
          manipulatedNumber = manipulatedNumber / 10;
        }

        boolean palindrome = number == reverseNumber;
        System.out.print("Palindrome: " + palindrome); 
    }
}
