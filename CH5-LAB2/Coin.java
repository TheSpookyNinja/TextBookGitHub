import java.util.Scanner;

public class Coin implements Lockable
{
    public int key;
    public int masterKey;
    public int guessKey;
    
    Scanner scan = new Scanner(System.in);
    public void Account(){
        setKey();
    }
    
    public static void main (String[]args)
    {
        
    }
    
    public int setKey(){
        System.out.println("Pick 4 numbers to be your key for account.");
        this.masterKey = scan.nextInt();
        return this.masterKey;
    }
    
    public int lock(int key){
        System.out.println("What is the key?");
        int temp1 = scan.nextInt();
        if (temp1 == masterKey){
            return 1;
        }
        else {
            return 0;
        }
    }
    
    public int unlock(int key){
        System.out.println("What is the key?");
        int temp2 = scan.nextInt();
        if (temp2 == masterKey){
            return 1;
        }
        else {
            return 0;
        }
    }
    
    public boolean locked(){
        System.out.println("Would you like to lock/unlock the account? (L/UL)");
        String temp3 = scan.next();
        if (temp3.equals("L")){
            int lock;
        }
        else if (temp3.equals("UL")){
            int unlock;
        }
        return false;
    }
}
