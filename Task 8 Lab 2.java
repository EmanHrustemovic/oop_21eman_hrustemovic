// Guessing game ! 

// STEP 1: The program that comes with the exercise contains a command called drawNumber.
//It draws a number, which is in the range 0 to 100 (both 0 and 100 are possible).
//Create a program that draws a number. Then the user has the chance to guess once, what the number is.
//The program should print "The number is lesser", "The number is greater" or "Congratulations, your guess is correct!" 
//depending on the number the user typed.

//STEP 2: Develop your program by adding the following functionality: 
//the guessing should be made repeatedly until the user types the right number. 
// Note that you need to draw the number by using the drawNumber command before the repetition.

// STEP 3: Develop your program by adding the following functionality: 
//the program needs to include a variable of type int, which is used to count the guesses the user has made. 
// The program should always print the number of guesses along with the answer.

public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int random_number = drawNumber();
    System.out.println(random_number);

        int attempts = 0; 

    System.out.print("Guess the number : ");     
       int guess = reader.nextInt();
while(guess!=random_number){
    if(guess>random_number) {
        attempts +=1;
        System.out.println("Lower!  -  This is your "+attempts+". guess !");
    }else if (guess<random_number){
        attempts += 1;
        System.out.println("Higher!   -  This is your "+attempts+" guess !");
     }
    guess = reader.nextInt(); 	
}
System.out.println("You are correct!");
       System.out.println("You made "+(attempts+1)+" guesses !"); 
}

public static int drawNumber(){
    Random rand = new Random();
     int random_number = rand.nextInt(100);

   return random_number;
}