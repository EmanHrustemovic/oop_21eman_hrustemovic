// 4. Create a program that asks for the user's name and prints it in reverse order. You do not need to create a separate method for this.

import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name : ");

        String name = scanner.nextLine(), reverseName= "";

        for(int i =(name.length()-1);i>=0;i--){
            reverseName+=name.charAt(i);
        }
        System.out.println("Your reverse name is "+ reverseName);

    }
}

