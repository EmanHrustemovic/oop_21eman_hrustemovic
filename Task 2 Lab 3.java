// 2 . Create a program that asks for the user's name and says how many characters the name contains.


import java.util.Scanner;
import java.util.ArrayList;


public class Main{
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name : ");

        String name = scanner.nextLine();

        
    System.out.println("Your name has " + name.length() + "charachters");

    }
}