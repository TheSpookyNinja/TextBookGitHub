import java.util.Random;

public class RollingDice
{
    public static void main (String[]args) {
        int die1 = 0;
        int die2 = 0;
        int totalSum = 0;
        Random Generator = new Random();
        die1 = (Generator.nextInt(6) + 1);
        die2 = (Generator.nextInt(6) + 1);
        totalSum = (die1 + die2);
        System.out.println("Your 1st dice roll is: " + die1 + ".");
        System.out.println("Your 2nd dice roll is: " + die2 + ".");
        System.out.println("Your total sum is: " + totalSum + ".");
    }
}
