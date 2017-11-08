import java.util.Scanner;


public class Athlete
{
    //Declraing Instance Variables
    private String name;
    private int age;
    
    //Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    //Main Method
    public Athlete(String nm, int a)
    {
       this.name = nm;
       this.age = a;
    }
    
    //String toString Method
    public String toString()
    {
        return "Name : " + this.name + "\tAge : " + this.age;
    }
}
