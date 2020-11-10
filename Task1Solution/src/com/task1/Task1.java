package com.task1;


import java.util.Scanner;

/*
TODO Task Hint:
    copy this line to be able to define Scanner object to Take input from user
    Scanner input = new Scanner(System.in);
*/
public class Task1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number: ");
        long num = input.nextLong();
        long result = sumDigits(num);
        System.out.println(result);
        //=================================================================//
        System.out.println("Enter First Number: ");
        double num1 = input.nextDouble();
        System.out.println("Enter Second Number: ");
        double num2 = input.nextDouble();
        System.out.println("Enter Third Number: ");
        double num3 = input.nextDouble();
        displaySortedNumbers(num1, num2, num3);
        //=================================================================//
        calcScore();
        //=================================================================//

    }

    /*
        TODO: Question 1: (Sum the digits in an integer) Write a method that computes the sum of the digits in an long.
                * Use the following method header:
                public static long sumDigits(long n)
                ---------------------------------------------
                * Explanation:
                For example, sumDigits(234) returns 9 (= 2 + 3 + 4).
                (Hint: Use the % operator to extract digits and the / operator to remove the extracted digit. For instance,
                to extract 4 from 234, use 234 % 10 (= 4 ). To remove 4 from 234, use 234 / 10
                (= 2 3 ). Use a loop to repeatedly extract and remove the digit until all the digits
                are extracted.
                 > Bonus : Learn more about Math.abs() method and try to use it in the task through it's documentation
                ----------------------------------------------
                * Write a method that prompts the user to enter an long then displays the sum of all its digits and call
                 this method in main
                method to test the program.

    */

    //TODO Write Answer for Question 1 Here
    public static long sumDigits(long n) {
        //n=>234
        long sum = 0;
        n = Math.abs(n);
        while (n != 0) {
            // digit => 4 => 3 => 2
            long digit = n % 10;
            // 0 => 4 => 7 => 9
            sum += digit;
            //234=>23 => 2 => 0
            n = n / 10;
        }
        return sum;
    }

    //-----------------------------------------------------------------------//

    /*
        TODO: Question 2: (Sort three numbers) Write a method with the following header to display three
                            numbers in decreasing order:
                            ---------------------
                            public static void displaySortedNumbers(double num1, double num2, double num3)
                            ---------------------
                            Write a test program that prompts the user to enter three numbers and invokes the
                            method to display them in decreasing order.
    */

    //TODO Write Answer for Question 2 Here
    public static void displaySortedNumbers(double max, double mid, double low) {
        double temp;
        if (mid >= max && mid >= low) {
            temp = max;
            max = mid;
            mid = temp;
        } else if (low >= max && low >= mid) {
            temp = max;
            max = low;
            low = temp;
        }
        if (low > mid) {
            temp = low;
            low = mid;
            mid = temp;
        }


        System.out.println(max + ", " + mid + ", " + low);

    }

    //-----------------------------------------------------------------------//

    /*
    TODO: Question 3: Write a method that prompts a student to enter a score.
          If the score is greater or equal to 60, display “you pass the exam”;
          otherwise, display “you don’t pass the exam”. Your program ends with input -1.
    */

    //TODO Write Answer for Question 3 Here
    public static void calcScore() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter score");
        double score = scanner.nextDouble();
        while (score != -1) {
            if (score >= 60)
                System.out.println("You pass the exam");
            else
                System.out.println("You don't pass the exam");
            System.out.println("Enter score again");
            score = scanner.nextDouble();
        }
    }

    //-----------------------------------------------------------------------//

}
