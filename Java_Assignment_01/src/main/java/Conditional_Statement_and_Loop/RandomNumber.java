/*8. Write a program to generate 2 random numbers which will not be shown to the user.
Take a user input and match it with any of the random numbers.
If correct give it 1 point and if incorrect, do not give it any point.
Finally, repeat this for 10 times and count the total points user achieved at the end of 10 cycle.*/

package Conditional_Statement_and_Loop;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        int min = 100, max = 200, point = 0, i;
        System.out.println("Welcome to the game, enter a number for 10 times");
        Scanner input = new Scanner(System.in);
        int num1 = (int) (Math.random() * (max - min + 1) + min);
        int num2 = (int) (Math.random() * (max - min + 1) + min);
        //System.out.println("Your num1 is: " + num1);
        //System.out.println("Your num2 is: " + num2);
        for (i = 0; i < 10; i++) {
            System.out.println("Enter a number within 100 and 200");
            int number = input.nextInt();
            if (number == num1 || number == num2) {
                point = point + 1;
            }

        }
        if (point > 0) {
            System.out.println("Your total point is: " + point);
        } else {
            System.out.println("Your total point is: 0");
        }
    }
}