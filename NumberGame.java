import java.util.Random;
import java.util.Scanner;

public class NumberGame{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();
        int min=1;
        int max=100;
        int maxAttempts=10;
        int score=0;

        System.out.println("Welcome to the Number Guessing Game.");

        do{
            int compNumber=rd.nextInt(max-min+1)+min;
            int attempts=0;
            int userGuess;

            System.out.println(" Guess the number between " + min + " and " + max);
        

        while(attempts<maxAttempts){
            System.out.print("Enter your number:");
            userGuess=sc.nextInt();
            attempts++;

            if(userGuess==compNumber){
                System.out.println("Congratulation! you win");
                System.out.println(" you guessed the correct number in " + attempts + " attempts ");
                score+=maxAttempts-attempts+1;
                break;
            }
            else if(userGuess<compNumber){
                System.out.println("Too small number. Try again.");
            }
            else{
                System.out.println("Too big number. try again.");
            }
        }

        System.out.println("Do you want to play again ? (Yes/No)");
    }
    while(sc.next().equalsIgnoreCase("Yes"));

    System.out.println("Thanks for playing! Total score is:"+score);
    sc.close();
  }
}