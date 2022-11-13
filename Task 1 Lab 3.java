// 1. Create the method average, which calculates the average of the numbers it gets as parameters.
//Inside the method you should use the method sum as a helper!  

import java.util.Scanner;
import java.util.ArrayList;



public class Task1{
    public static double Average(int number1, int number2, int number3 , int number4){
        return(number1+number2+number3+number4)/4f;
    }
    public static void main(String[]args){
        double answer = Average(1,3,4,6);
        System.out.println("Your answer is "+ answer);
         
    }
}