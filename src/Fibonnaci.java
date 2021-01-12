/*
 * Chapter 5 Lab
 * Description: takes user's input to DISPLAY FIBONACCI SERIES
 * Name: Mohammad Abdelrahman
 * ID: 920158652
 * Class: CSC 211-02
 * Semester: fall 2020
 */
import java.util.Scanner;
public class Fibonnaci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // creat an objet input to store the user input
        // prompt user to enter numbers they want in the series.
        System.out.println("Enter number of terms for Fibonacci series:");
        int num = input.nextInt(); // store the user inout
        while (num > 20 || num <= 0){ // keep asking the user to enter a number between 1-20
            System.out.println("Please enter a number between 1 and 20");
            num = input.nextInt(); // store the user input in num
        }
        int zero = 0; // temp int for first value
        int one = 1; // temp int for second value
        int sum = 0; // variable to hold the sum between our temp variables
        for (int i = 0; i < num; i++){ // loop throw the the given number from user to calculate the fibonacci series
            System.out.print(zero + " "); // prints the fibonacci series
            sum = zero + one; // add the two previous number together
            //these two lines to add the sum of the first two digits to the new one
            zero = one;
            one = sum;
            }
        }
    }

