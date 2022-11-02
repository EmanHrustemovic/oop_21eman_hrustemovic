import java.util.Scanner;


// Create a program that asks the user for a password. If the password is right, a secret message is shown to the user.


public class Main{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        String message = "jryy qbar";

        String password = "carrot";

        int trying = 0;

        while(trying != 1){
            System.out.println("Enter your password :");
            String guess = scanner.nextLine();
            
            if (!password.equals(guess)){
                System.out.println("Wrong !!");
            }
            else {
               trying = 1;
            }
        }
        System.out.println("Correct !!");
        System.out.println("Secret message is ; "+ message);
    }
}