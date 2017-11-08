import java.util.Scanner;


public class Team
{
    //Instance Variables
    private String teamName;
    private Athlete[] members;
    
    //Initialize Scanner
    Scanner scan = new Scanner(System.in);
    
    //Main Method
    public Team(String tN, int size)
    {
        this.teamName = tN;
        members = new Athlete[size];
    }
    
    //Setter Methods
    public void setTeamName()
    {
        System.out.println("What is your athlete's team name?");
        teamName = scan.nextLine();
    }
    
    public void addAthlete(Athlete a, int index)
    {
        members[index] = a;
    }
        
    //String toString Method
    public String toString()
    {
        String output = "The team members for " + this.teamName + "\n";
        for (Athlete a : members)
        {
            output += a + "\n";
        }
        return output;
    }
}
