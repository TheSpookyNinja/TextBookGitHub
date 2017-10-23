// ****************************************************************
//   Guess.java
//
//   Play a game where the user guesses a number from 1 to 10
//              
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
 
public class Guess
{
    public static void main(String[] args)
        {
          int numToGuess = 0;           //Number the user tries to guess
          int guess = 0;                //The user's guess;
          Scanner scan = new Scanner(System.in);
          Random generator = new Random();
 
          //randomly generate the  number to guess
          numToGuess = generator.nextInt(11);
          //print message asking user to enter a guess
          System.out.println("Try to Guess the Randomly Chosen Number.");
          //read in guess
          guess = scan.nextInt();
          while (guess != numToGuess)  //keep going as long as the guess is wrong
            {
                  //print message saying guess is wrong
                  System.out.println("That is the wrong number, try again.");
                  //get another guess from the user
                  guess = scan.nextInt();
          }
          
          //print message saying guess is right
          System.out.println("YOU GUESSED CORRECT, The Number Was : "+numToGuess);
        }
}