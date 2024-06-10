package com.hamd;
import java.util.Scanner;

/**
 * A simple program to demonstrate the FizzBuzz problem.
 * FizzBuzz is a popular coding interview question that requires printing numbers from 1 to n,
 * replacing multiples of 3 with "Fizz", multiples of 5 with "Buzz", and multiples of both 3 and 5 with "FizzBuzz".
 * @author Hamd Abid
 * @date 02/13/2024
 */
public class FizzBuzz {

    /**
     * Main method to take user input and call fizzBuzz method.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the last number: ");
        // Input validation to handle non-numeric inputs
        while (!input.hasNextInt()) {
            System.out.println("Invalid input! Please enter a valid number: ");
            input.next();
        }
        int lastNumber = input.nextInt();
        input.close(); // Close scanner after usage to prevent resource leak
        fizzBuzz(1, lastNumber);
    }

    /**
     * Prints Fizz for multiples of 3, Buzz for multiples of 5, FizzBuzz for multiples of both, and the number itself for all other cases.
     * @param start The starting number of the sequence.
     * @param end The last number of the sequence.
     */
    public static void fizzBuzz(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 15 == 0) { // Check if divisible by both 3 and 5
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) { // Check if divisible by 5
                System.out.println("Buzz");
            } else if (i % 3 == 0) { // Check if divisible by 3
                System.out.println("Fizz");
            } else {
                System.out.println(i); // Print the number itself
            }
        }
    }
}
