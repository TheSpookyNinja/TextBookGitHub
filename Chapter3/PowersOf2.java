// ****************************************************************
//   PowersOf2.java
//
//   Print out as many powers of 2 as the user requests
//              
// ****************************************************************
import java.util.Scanner;

public class PowersOf2
{
        public static void main(String[] args)
        {
            double numOf2;
            double limitOf2;
            double nextNumOf2 = 1;
            double prevNumOf2 = 1;
            double exponent = 2;
            
            Scanner scan = new Scanner(System.in);
            System.out.println("How many powers of 2 would you like printed?");
            limitOf2 = scan.nextInt();
            
            while (exponent != limitOf2) {
                prevNumOf2 = nextNumOf2;
                nextNumOf2 = Math.pow(prevNumOf2, exponent);
                
                exponent++;
            }
            System.out.println (nextNumOf2);
        }
}