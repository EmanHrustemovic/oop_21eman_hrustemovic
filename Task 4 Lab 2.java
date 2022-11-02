// 4. Create a program that asks the user for the first number and the last number and then prints all numbers between those two. Use a while loop. 

import java.util.Scanner;

public class Main{
    public static void main(String[]args) {
        
        Scanner scanner = new Scanner(System.in);

       
            
            System.out.println("Enter first number : ");
            
            int x = scanner.nextInt();
            
            System.out.println("Enter second number : ");
            
            int y = scanner.nextInt();

            while(x<y){
                System.out.println(x);
                x++;
            }

        }


    }

