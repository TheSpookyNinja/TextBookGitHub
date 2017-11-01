public class Student
{
    private String name;
    private int iDNumber;
    private Student bestFriend;
    
    public Student()
    {
        
    }
    
    public Student(int num, String nm) {
        this.iDNumber = num;
        this.name = nm;
    }
    
    public int getID(){
        return this.iDNumber;
    }
    
    public String toString() {
        return "The student's name is: " + this.name;
    }
}