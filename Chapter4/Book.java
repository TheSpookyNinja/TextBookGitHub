import java.util.Scanner;

public class Book
{
    //Instance Variables
    private Author bookAuthor;
    private String title;
    private String genre;
    private int pageCount;
    
    //Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    //Main Method
    public Book()
    {
        System.out.println("What is your authors first name?");
        String fN = scan.nextLine();
        System.out.println("What is your authors last name?");
        String lN = scan.nextLine();
        
        bookAuthor = new Author(fN, lN);
        setTitle();
        setGenre();
        setPageCount();
    }
    
    //Setter Methods
    public void setTitle()
    {
        System.out.println("");
        title = scan.nextLine();
    }
    
    public void setGenre()
    {
        System.out.println("");
        genre = scan.nextLine();
    }
    
    public void setPageCount()
    {
        System.out.println("");
        pageCount = scan.nextInt();
    }
    
    //Getter Methods
    public Author getAuthor()
    {
        return bookAuthor;
    }
    
    public String getAuthorName()
    {
        return bookAuthor.getName();
    }
    
    public String getTitle()
    {
        return this.title;
    }
    
    public String getGenre()
    {
        return this.genre;
    }
    
    public int getPages()
    {
        return this.pageCount;
    }
    
    //String toString Method
    public String toString()
    {
        String output;
        output = "Book Title: " + getTitle() + "\tBook Author: " + getAuthor() + "\tGenre: " + getGenre() + "\tPage Count: " + getPages();
        return output;
    }
}
