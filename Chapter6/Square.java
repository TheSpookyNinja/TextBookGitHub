// ****************************************************************
// Square.java
//
// Define a Square class with methods to create and read in
// info for a square matrix and to compute the sum of a row,
// a col, either diagonal, and whether it is magic.
//          
// ****************************************************************
import java.util.Scanner;
public class Square
{
    int[][] square;
    
    int rowLength = square.length;
    int colLength = square[0].length;
    
    int otherValue = 0;
    int mainValue = 0;
    int rowValue = 0;
    int colValue = 0;
    //--------------------------------------
    //create new square of given size
    //--------------------------------------
    public Square()
    {
       
    }
    //--------------------------------------
    //return the sum of the values in the given row
    //--------------------------------------
    public int sumRow(int row)
    {
        for (int index1 = 0; index1 < rowLength; index1++) {
            rowValue += square[row][index1];
        }
        return rowValue;
    }
    //--------------------------------------
    //return the sum of the values in the given column
    //--------------------------------------
    public int sumCol(int col)
    {
        for (int index2 = 0; index2 < colLength; index2++) {
            colValue += square[index2][col];
        }
        return colValue;
    }
    //--------------------------------------
    //return the sum of the values in the main diagonal
    //--------------------------------------
    public int sumMainDiag()
    {
        for (int index3 = 0; index3 < rowLength; index3++) {
            mainValue += square[index3][index3];
        }
        return mainValue;
    }
    //--------------------------------------
    //return the sum of the values in the other ("reverse") diagonal
    //--------------------------------------
    public int sumOtherDiag()
    {
        for (int index4 = 0; index4 < rowLength; index4++){
            otherValue += square[rowLength-index4][index4];
        }
        return otherValue;
    }
    //--------------------------------------
    //return true if the square is magic (all rows, cols, and diags have
    //same sum), false otherwise
    //--------------------------------------
    public boolean magic()
    {
        //Change to work correctly
        if (rowValue == colValue && mainValue == otherValue) {
           return true;
        }
        else {
            return false;
        }
    }
    //--------------------------------------
    //read info into the square from the standard input.
    //--------------------------------------
     public void setSquare(int[][] sq)
    {
        this.square = sq;
    }
   
    //--------------------------------------
    //print the contents of the square, neatly formatted
    //--------------------------------------
    public void printSquare()
    {
        for(int row = 0; row < square.length; row++) {
            for(int col =0; col < square[0].length; col++) {
                System.out.print(square[row][col] + "\t");
            }
            System.out.println();
        }
     }
}