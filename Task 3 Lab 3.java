// 3 Create a program that asks for the user's name and gives its characters separately. 
// You do not need to create methods in this exercise


import java.util.Scanner;
import java.util.ArrayList;


public class Main{
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name : ");

        String name = scanner.nextLine();

        for(int i=0;i<=name.length;i++){
            System.out.println(name.charAt(i));

        }
    }
}