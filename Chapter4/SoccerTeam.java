import java.util.Scanner;


public class SoccerTeam
{
    public static void main (String[]args)
    {
        Team acalanes = new Team("Acalanes Soccer", 20);
        
        Athlete joe = new Athlete("Joe", 16);
        Athlete mark = new Athlete("Mark", 16);
        Athlete dale = new Athlete("Dale", 17);
        acalanes.addAthlete(joe, 0);
        acalanes.addAthlete(mark, 1);
        acalanes.addAthlete(dale, 2);
        System.out.println(acalanes);
    }
    
    
}
