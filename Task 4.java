import java.util.Scanner;

public class Main{
     public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number");

        int x = scanner.nextInt();

        System.out.println("Enter second number");

        int y = scanner.nextInt();

        int sum = x + y ;

        System.out.println("Sum of your numbers is " + sum);
      
     }

}