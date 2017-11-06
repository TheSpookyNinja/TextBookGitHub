import java.util.Scanner;

public class Author
{
    //Instance Variables
    private String firstName;
    private String lastName;
    private int age;
    
    //Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    //Main Method
    public Author(String fN, String lN)
    {
        this.firstName = fN;
        this.lastName = lN;
        setAge();
    }
    
    //Setter Method
    public void setAge()
    {
        System.out.println("What is the author's age?");
        this.age = scan.nextInt();
    }
    
    //Getter Methods
    public String getName()
    {
        return "Name : " + this.firstName + " " + this.lastName;
    }
    
    public int getAge()
    {
        return this.age;
    }
    
    //String toString method
    public String toString()
    {
        return "Author: " + getName() + "\tAge: " + getAge();
    }
}
