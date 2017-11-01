import java.util.Scanner;

public class Pet
{
    //Declaring Instance Variables
    private boolean dog;
    private String name = new String();
    private int age;
    
    //Constructor
    public Pet(String nm, boolean d, int a)
    {
        //Instance Variables to Work With Constructor
        this.name = nm;
        this.dog = d;
        this.age = a;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public String toString()
    {
        return "This pet is named: " + this.name;
    }
    
    public static void Example(){
        System.out.println("This is static");
    }
}