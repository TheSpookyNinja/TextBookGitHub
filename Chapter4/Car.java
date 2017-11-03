public class Car
{
    private int year;
    private String model;
    
    public Car(int yr, String md)
    {
        this.year = yr;
        this.model = md;
    }
    
    public int getYear(int yr)
    {
        return year;
    }
    
    public String getModel(String md)
    {
        return model;
    }
    
    public String toString()
    {
        return "This is a " + model + " built in " + year;
    }
    
    //public boolean equals(Car otherCar)
}