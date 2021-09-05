/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution05
 *  Copyright 2021 Danny Yu
 */

// Program will calculate simple arithmetic from 2 numbers

import java.util.Scanner;

public class Solution05
{
    /*
        prompt user for 1st number
            user enters 1st number
        prompt user for 2nd number
            User enters 2nd number
        convert numbers from string datatype to integer datatype
        create variables corresponding to arithmetic operation
            addition
            subtraction
            multiplication
            division
        print user entered numbers with corresponding arithmetic and result
     */

    public static void main(String[] args)
    {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        String first = number.nextLine();
        System.out.print("Enter the second number: ");
        String second = number.nextLine();

        int firstnum = Integer.valueOf(first);
        int secnum = Integer.valueOf(second);

        int sum = firstnum+secnum;
        int difference = firstnum-secnum;
        int product = firstnum*secnum;
        int quotient = firstnum/secnum;

        System.out.println("\n"+ firstnum + " + " + secnum + " = " + sum);
        System.out.println("\n" + firstnum + " - " + secnum + " = " + difference);
        System.out.println("\n" + firstnum + " * " + secnum + " = " + product);
        System.out.println("\n" + firstnum + " / " + secnum + " = " + quotient);
    }
}
