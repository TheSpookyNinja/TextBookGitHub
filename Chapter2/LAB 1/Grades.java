public class Grades
{
   public static void main(String[]args) {
       makeTable();
    }
    
   public static void makeTable() {
       makeHeader();
       labelColumns();
       populateRows();
   }
   
   public static void makeHeader(){
       System.out.println ("-----------------------------------");
       System.out.println ("== \tStudent Points\t\t ==");
       System.out.println ("-----------------------------------");
   }
   public static void labelColumns(){
       System.out.println ("Name\t\tLab\tBonus\tTotal");
       System.out.println ("----\t\t---\t-----\t-----");
   }
   public static void populateRows(){
       populateOneRow ("Joe",40, 7);
       populateOneRow ("William", 50, 8);
       populateOneRow ("MarySue", 39, 10);
       
   }
   public static void populateOneRow(String name, int lab, int bonus){
       System.out.println (name + "\t" + "\t" + lab + "\t" + bonus + "\t" + (lab + bonus));
    }
}
