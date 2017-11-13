import java.util.Scanner;

public class Car
{
    //Instance Variables
    private int year;
    private String model;
    private String make;
    private String title;
    
    //Initialize Scanner
    Scanner max = new Scanner(System.in);
    
    //Main Method
    public Car(int yr, String ml, String mk, String t)
    {
        this.year = yr;
        this.model = ml;
        this.make = mk;
        this.title = t;
    }
    
    //Setter Methods
    public void setYear()
    {
        System.out.println("What is the year on the vehicle?");
    }
    
    public void setModel()
    {
        System.out.println("What is the model on the vehicle?");
    }
    
    public void setMake()
    {
        System.out.println("What is the make on the vehicle?");
    }
    
    public void setTitle()
    {
        System.out.println("What is the state of the title on the vehicle?");
    }
    
    //Getter Methods
    
    //String toString Method
    
}
