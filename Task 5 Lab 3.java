// 5. Create a program that asks the user for two words. 
// Then the program tells if the second word is included in the first word.
//Use the String method indexOf in your program.

import java.util.Scanner;
import java.util.ArrayList;

public class Main{
    public static void main(String[]args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter first word : ");

        String word1 = scanner.nextLine();

        System.out.println("Please enter second word : ");

        String word2 = scanner.nextLine();

        if(word1.contains(word2)){
            System.out.println("First word contain second");
        }
        else{
            System.out.println("Second word contain first");
        }
    }
}