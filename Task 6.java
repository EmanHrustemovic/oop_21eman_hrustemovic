import java.util.Scanner;


// 6. Create a program that asks the user for two numbers and prints the greater of those two. 
// The program should also handle the case in which the two numbers are equal


public class Main{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your first number : ");

        int x = scanner.nextInt();

        System.out.println("Enter your second number : ");

        int y = scanner.nextInt();
        
        if(x>y){

            System.out.println("First number is greater than second number ");
        }

        else if(x<y){
            System.out.println("Second number is greater than first number ");
        }

        else{
            System.out.println("Numbers are equal");
        }
    
    }


}