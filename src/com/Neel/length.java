package com.Neel;

import java.util.Scanner;

 class StringLengthCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); // Read user input
        scanner.close();

        int length = 0;

        try {
            while (true) { // Infinite loop to count characters
                input.charAt(length); // Try accessing the next character
                length++; // Increment counter if no exception occurs
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception occurs when index goes out of range → We stop counting
        }

        System.out.println("Length of the string: " + length);
}
}