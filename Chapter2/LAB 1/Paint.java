import java.util.Random;
import java.util.Scanner;
//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
 
public class Paint
{
        public static void main(String[] args)
        {
            final int COVERAGE = 350;  //paint covers 350 sq ft/gal
            //declare integers length, width, and height;
            double length = 0;
            double width = 0;
            double height = 0;
            
            double windows = 0;
            double doors = 0;
            //declare double totalSqFt;
            double totalSqFt = 0;
            //declare double paintNeeded;
            double paintNeeded;
            //Declare and initialize the length of the room
            Scanner myLength = new Scanner(System.in);
            System.out.println("Enter the LENGTH of the room: ");
            length = (double) myLength.nextDouble();
            //Declare and initialize the width of the room
            Scanner myWidth = new Scanner(System.in);
            System.out.println("Enter the WIDTH of the room: ");
            width = (double) myWidth.nextDouble();
            //Declare and initialize the height of the room
            Scanner myHeight = new Scanner(System.in);
            System.out.println("Enter the Height of the room: ");
            height = (double) myHeight.nextDouble();
            //Declare the number of windows
            Scanner myWindows = new Scanner(System.in);
            System.out.println("Enter the number of WINDOWS of the room: ");
            windows = (double) myHeight.nextDouble();
            //Declare the number of doors
            Scanner myDoors = new Scanner(System.in);
            System.out.println("Enter the number of DOORS of the room: ");
            doors = (double) myHeight.nextDouble();
            //Square footage of the doors and windows
            double NegSqFt = ((doors * 15) + (windows * 20));
            //Compute the total square feet to be painted--think
            //about the dimensions of each wall
            totalSqFt = (length * width * height - (NegSqFt));
            //Compute the amount of paint needed
            double totalBuckets = (totalSqFt/COVERAGE);
            totalBuckets =  Math.ceil(totalBuckets);
            //Print the length, width, and height of the room and the
            //number of gallons of paint needed.
            System.out.println("You need " + totalBuckets + " buckets of paint to cover the room!");
        }
}