import java.util.Scanner;


// 2. Create a program that asks the user for three numbers and then prints their sum. Use the following structure in your program:


public class Main{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 

        System.out.println("Please enter your first number : ");

        int x = scanner.nextInt();
    
        System.out.println("Please enter your second number : ");

        int y = scanner.nextInt();

        System.out.println("Please enter your third number : ");

        int z = scanner.nextInt();

        int sum = x + y + z ;

        System.out.println("Your sum is " + sum);





    }
}