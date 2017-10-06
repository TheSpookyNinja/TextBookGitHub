// **************************************************
//   LuckyNumbers.java
//
//   To generate two random "lucky" numbers
// **************************************************
 
import java.util.Random;
 
public class LuckyNumbers
{
   public static void main (String[] args)
   {
          Random generator = new Random();
          int lucky1, lucky2; 
          
          //Random Generator
          Random Generator = new Random();
          
          // Generate lucky1 (a random integer between 50 and 79) using the nextInt method
          lucky1 = (Generator.nextInt(50) + 29);
          
          
          // Generate lucky2 (a random integer between 11 and 30) using nextFloat
          lucky2 = (Generator.nextInt(11) + 19);
          
          
          System.out.println ("Your lucky numbers are " + lucky1 + " and " + lucky2);
        }
}