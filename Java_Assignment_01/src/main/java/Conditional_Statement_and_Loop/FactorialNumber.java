
/*6. Write a program to find the factorial of a given number.*/

package Conditional_Statement_and_Loop;

import java.util.Scanner;

public class FactorialNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, number, fact=1;
        System.out.println("Enter a number");
        number= input.nextInt();
        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is: "+fact);
    }

}

