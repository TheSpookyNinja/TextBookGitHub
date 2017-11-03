import java.util.Scanner;


public class Book
{
    //Instance Variables
    private Author writer;
    private String title;
    private int numOfPages;
    private String genre;
    
    //Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    //Main Methods Declaring Variables and Methods
    public Book()
    {
       System.out.println("What is the author's first name?");
       String first = scan.nextLine();
       System.out.println("What is the author's last name?");
       String last = scan.nextLine();
       author = new Author(first, last);
       setTitle();
       setGenre();
       setPages();
    }
    
    //Create Setters Methods
    public void setTitle()
    {
        System.out.println("What is the title of the book?");
        title = scan.nextLine();
    }
    
    public void setGenre()
    {
        System.out.println("What is the genre of the book?");
        genre = scan.nextLine();
    }
    
    public void setPages()
    {
        System.out.println("How many pages does the book have?");
        numOfPages = scan.nextInt();
    }
    
    //Create Getter Methods
    public Author getAuthor()
    {
        return author;
    }
    
    public String getAuthorName()
    {
        return author.getName();
    }
    
    public String getTitle()
    {
        return this.title;
    }
    
    public String getGenre()
    {
        return this.genre;
    }
    
    public int getPageNums()
    {
        return this.numOfPages();
    }
    
    //String toString() Method
    public String toString()
    {
        String output;
        output = "Book Title: " + getTitle() + "\tBook Author: " + getAuthor() + "\tGenre: " + getGenre() + "\tNumber Of Pages: " + getPageNums();
        return output;
    }
}
