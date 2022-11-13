// 8. Create the method palindrome that checks if a string is a palindrome (reads the same forward and backward). 

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word : "); 

        String word = scanner.nextLine(), reverseWord = "";
        
        for(int i =(word.length()-1); i>=0;i--){
            reverseWord+=word.charAt(i);
        }
        if(word.equals(reverseWord)){
            System.out.println("This is palindrome !!!");
        }
        else{
            System.out.println("This is not a palindrome !! ");
        }

    }
}
    
