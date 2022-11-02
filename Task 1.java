// 1. Create a program that prints your name to the screen. 

import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name : ");

        String name = scanner.nextLine();

        System.out.println("Your name is " + name);

    }


}


