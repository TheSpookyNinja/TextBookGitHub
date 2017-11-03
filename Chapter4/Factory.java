
public class Factory
{
    //Instance Variables
    private double sqFootage;
    private Car[] inventory;
    
    
    public Factory(double sqF, int number)
    {
       this.sqFootage = sqF;
       this.inventory = new Car[number];
    }
    
    public String toString()
    {
        String output = "This factory has \n";
        for(Car c : inventory)
        {
            output += c + "\n";
        }
        return output;
    }
    
    public void setCar(Car c, int index)
    {
        inventory[index] = c;
    }
}