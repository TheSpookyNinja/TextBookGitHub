import java.util.Scanner;


public class Author
{
    //Instance Variables
    private String firstName;
    private String lastName;
    private int bookNumber;
    private String publisher;
    
    //Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    //Main Methods Declaring Variables and Methods
    public Author(String fN, String lN)
    {
        this.firstName = fN;
        this.lastName = lN;
        setBookNumber();
        setPublisher();
    }
    
    //Create Setters Methods
    public void setBookNumber()
    {
        System.out.println("How many books has this author written?");
        bookNumber = scan.nextInt();
    }
    
    public void setPublisher()
    {
        System.out.println("What is the name of the author's publisher?");
        publisher = scan.nextLine();
    }
    
    //Create Getter Methods
    public String getName()
    {
        return this.lastName + " , " + this.firstName;
    }
    
    public int getBookNumber()
    {
        return this.bookNumber;
    }
    
    public String getPublisher()
    {
        return this.publisher;
    }
    
    //String toString() Method
    public String toString()
    {
        return "Author : " + getName() + "\tPublisher : " + getPublisher();
    }
}
