import java.util.Random;

public class RPSPlayer implements Player
{
    private String name;
    private String choice;
    private boolean cpu;
    private int score;
    
    Random rand = new Random();
    
    /**
     * Constructor for objects of class RPSPlayer
     */
    public RPSPlayer(boolean computer)
    {
        // initialise instance variables
        this.cpu = computer;
        this.name = setName(cpu);
    }

    /**
     * Returns String of "Rock", "Paper" or "Scissors"
     * Will be random if computer = true
     */
    public void setChoice(boolean computer) {
        if (!cpu) {
            System.out.println("Pleace pick 1 of the following: /nrock /npaper /nscissors");
            choice = scan.next();
        }
        else {
            choice = randomChoice();
        }
    }
    
    public boolean getCPU() {
        return false;
    }
    
    public int getScore() {
        return 0;
    }
    
    public void updateScore(int value) {
        
    }
    
    public String getName() {
        System.out.println("What is your name?");
        this.name = scan.nextLine();
        return name;
    }
    
    public String getChoice() {
        return null;
    }
    
    public String toString() {
        return "The player " + name + " has choosen " + choice;
    }
    
    /**
     * Set's the player name.  If computer = true, returns "CPU"
     */
    public String setName(boolean computer) {
        if (!cpu){
            getName();
            return this.name;
        }
        else {
            return "CPU";
        }
    }
    
     /**
     * If cpu then return a random choice
     */
    public String randomChoice() {
        int n = rand.nextInt(3);
        if (n == 0){
            return "rock";
        }
        else if (n == 1){
            return "paper";
        }
        else{
            return "scissors";
        }
    }
}
