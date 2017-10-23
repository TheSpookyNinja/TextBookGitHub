public class MultiplicationTable
{
    //Declaring Instance Variables
    static int rowX = 1;
    static int rowY = 1;
    static int row = 1;
    
    public static void main (String[]args){
        RowLoop();
    }
    public static void RowLoop(){
        for (int k = 0; k < 12; k++){
            for (int i = 0; i < 12; i++){
                System.out.print(rowX*rowY + "  ");
                rowX++;
            }
            System.out.println();
            rowX = 1;
            rowY++;
            row++;
        }
    }
}
