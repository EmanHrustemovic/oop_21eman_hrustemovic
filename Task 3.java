import java.util.Scanner;

// 3. Create a program that counts how many seconds there are in a year. 
// You can assume that a year consists of 365 days (therefore the year is not a leap year).
//The program should print the following: There are X seconds in a year.



public class Main{
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int seconds = 365*24*60*60;

        System.out.println("There are " + seconds " seconds in a year ");

      
     }

}