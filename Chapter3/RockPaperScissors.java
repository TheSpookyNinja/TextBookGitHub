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
    public static void main(String[]args) {
        //Declaring Instance Variables
        String personPlay;
        String computerPlay = "O";
        int computerInt;
        
        Random generator = new Random();
        
        //Get player's play -- note that this is stored as a string
        Scanner scan = new Scanner(System.in);
        System.out.println("Pick Rock, Paper or Scissors (Type R for Rock : P for Paper : S for Scissors)");
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
        
        //Print player's play
        if (personPlay.equals("R")){
            System.out.println("User Picked : Rock");
        }
        if (personPlay.equals("P")){
            System.out.println("User Picked : Paper");
        }
        if (personPlay.equals("S")){
            System.out.println("User Picked : Scissors");
        }
        
        //See who won.
        if (personPlay.equals("R")){
            if (computerPlay.equals("R")){
                System.out.println("TIE");
            }
            if (computerPlay.equals("P")){
                System.out.println("COMPUTER WINS");
            }
            if (computerPlay.equals("S")){
                System.out.println("USER WINS");
            }
        }
        if (personPlay.equals("P")){
            if (computerPlay.equals("R")){
                System.out.println("USER WINS");
            }
            if (computerPlay.equals("P")){
                System.out.println("TIE");
            }
            if (computerPlay.equals("S")){
                System.out.println("COMPUTER WINS");
            }
        }
        if (personPlay.equals("S")){
            if (computerPlay.equals("R")){
                System.out.println("COMPUTER WINS");
            }
            if (computerPlay.equals("P")){
                System.out.println("USER WINS");
            }
            if (computerPlay.equals("S")){
                System.out.println("TIE");
            }
        }
    }
}