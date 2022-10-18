
/*5. Write a program to sum of numbers which only divisible by 5 from 1 to 100.*/

package Conditional_Statement_and_Loop;

public class SumNumber {
    public static void main(String[] args) {

        int i, sum=0;
        for (i=1; i<=100; i++){
            if(i%5==0){
                sum= sum+i;
            }
        }
        System.out.println("The sum of numbers which only divisible by 5 from 1 to 100 is: " + sum);
    }
}
