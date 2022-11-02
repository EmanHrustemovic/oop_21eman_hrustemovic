// 5. Create a program that calculates the sum of 2 na 0+2 na 1+2 na 2+...+2n, where n is a number entered by the user. 
//The notation 2i means raising the number 2 to the power of i, for example 24 = 2*2*2*2 = 16. 
//In Java we cannot write a on b directly, but instead we can calculate the power with the command Math.pow(number, power). 
//Note that the command returns a number of double type (i.e. floating point number).
//A double can be converted into the int type (i.e. whole number) as follows: int result = (int)Math.pow(2, 3). 
// This assigns the value of 23 to variable result. 

import java.util.Scanner;

public class Main{
     public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number :");
        
        int pow = scanner.nextInt();
        int sum=1;

        for(int i = 1;i<=pow;i++){
            sum = sum +(int)Math.pow(2,i);
        }
        System.out.println("Your final sum is " + sum);
    }    
}