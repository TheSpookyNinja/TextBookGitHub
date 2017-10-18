// ****************************************************************
//   Rock.java
//
//   Play Rock, Paper, Scissors with the user
//          
// ****************************************************************
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors
{
    public void China() {
        //Declaring Instance Variables
        String personPlay;
        String computerPlay = "O";
        int computerInt;
        
        Random generator = new Random();
        
        //Get player's play -- note that this is stored as a string
        Scanner scan = new Scanner(System.in);
        personPlay = scan.next();
        
        //Make player's play uppercase for ease of comparison
        personPlay.toUpperCase();
        
        //Generate computer's play (0,1,2)
        computerInt = generator.nextInt(3);
        
        //Translate computer's randomly generated play to string
        if (computerInt == 0){
            computerPlay = "R";
        }
        else if (computerInt == 1){
            computerPlay = "P";
        }
        else if (computerInt == 2){
            computerPlay = "S";
        }
        //Print computer's play
        if (computerPlay.equals("R")){
            System.out.println("Computer Picked : Rock");
        }
        if (computerPlay.equals("P")){
            System.out.println("Computer Picked : Paper");
        }
        if (computerPlay.equals("S")){
            System.out.println("Computer Picked : Scissors");
        }
        //See who won.
        
    }
}