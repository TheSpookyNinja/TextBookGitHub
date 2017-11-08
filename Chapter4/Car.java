import java.util.Scanner;


public class Car
{
    //Instance Variables
    private int year;
    private String model;
    private String make;
    
    //Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    //Main Method
    public Car(int y, String ml, String mk)
    {
      this.year = y;
      this.model = ml;
      this.make = mk;
    }
    
    //Setter Methods
    public void setYear()
    {
        System.out.println("What is the year?");
        this.year = scan.nextInt(); 
    }
    
    public void setModel()
    {
        System.out.println("What is the model?");
        this.model = scan.nextLine();
    }
    
    public void setMake()
    {
        System.out.println("What is the make?");
        this.make = scan.nextLine();
    }
    
    //Getter methods
    
    //String toString Method
    
}
