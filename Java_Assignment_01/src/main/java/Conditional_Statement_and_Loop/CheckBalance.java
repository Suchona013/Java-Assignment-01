/* 4. Write a program to check your balance, deposit balance and withdraw balance from ATM booth.*/

package Conditional_Statement_and_Loop;

import java.util.Scanner;

public class CheckBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice, amount;
        double balance = 5000, available;
        System.out.println("Welcome to ATM\n");
        System.out.println("\t1. Check Balance\n\t2. Withdraw money\n\t3. Deposit Balance\n\t4. Exit");
        System.out.println("Enter your choice: ");
        choice = input.nextInt();
        while (choice != 4) {
            switch (choice) {
                case 1:
                    System.out.println("Available balance is:" + balance);
                    break;

                case 2:
                    System.out.println("Enter withdrawal amount: ");
                    amount = input.nextInt();
                    if (balance < amount) {
                        System.out.println("Insufficient balance");

                    }else {
                        balance = balance - amount;
                        System.out.println("Withdrawal successful.");
                    }
                    break;

                case 3:
                    System.out.println("Enter deposit amount:" + balance);
                    amount = input.nextInt();
                    balance= balance+amount;
                    System.out.println("Deposit successful.");
                    System.out.println("Enter deposit amount:" + balance);
                    break;

                default:
                    break;
            }

        }
    }

}
