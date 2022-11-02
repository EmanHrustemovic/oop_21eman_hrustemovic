//3. Create a program that reads numbers from the user and prints their sum. T
// The program should stop asking for numbers when the user enters the number 0. 

import java.util.Scanner;


public class Main(){
    public static void main(String[]args){

        Scanner reader = new Scanner(System.in);
        
        int sum = 0;

        while(true){
            int read = Integer.parseInt(reader.nextLine());
            if(read == 0){
                break;
            }
            
            System.out.println("Sum now is "+ sum);
        
        }
        
        System.out.println("Final sum is "+ sum);

    }

}