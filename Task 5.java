import java.util.Scanner;

// 5. Create a program that asks the user for a number and tells if the number is positive (i.e. greater than zero).



public class Main{
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your number : ");

        int x = scanner.nextInt();

        if(x>0){
            System.out.println("You enter positive number ! ");

        }
        else{
            System.out.println("You enter negative number ! ");
        }
      
     }

}