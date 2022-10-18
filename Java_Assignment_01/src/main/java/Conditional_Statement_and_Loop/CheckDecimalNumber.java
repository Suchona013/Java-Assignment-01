
/*Input 2 decimal numbers. Check if they are both same or different up to two decimal places.*/


package Conditional_Statement_and_Loop;

import java.util.Scanner;

public class CheckDecimalNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input 1st decimal number: ");
        double num1 = input.nextDouble();
        System.out.print("Input 2nd decimal number: ");
        double num2 = input.nextDouble();
       // input.close();

        if (Math.abs(num1 - num2) <= 0.01) {
            System.out.println("These numbers are the same.");
        }
        else {
            System.out.println("These numbers are not same.");
        }
    }
}
