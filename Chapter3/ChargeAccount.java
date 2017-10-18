import java.util.Scanner;

public class ChargeAccount
{
    //Declaring Instance Variables
    double previousBalance;
    double addCharges;
    double totalCharges;
    double currentBalance;
    double interestRate;
    double interestValue;
    double payment;
    
    public void pastBalance(){
        //Initialize Scanner
        Scanner scanONE = new Scanner(System.in);
        //Input for the Previous Balance
        previousBalance = scanONE.nextDouble();
    }
    
    public void additionalCharges(){
       //Initialize Scanner
       Scanner scanTWO = new Scanner(System.in);
       //Input for the Additional Charges
       addCharges = scanTWO.nextDouble();
    }
    
    public void newBalance(){
        //Calculating the New Blance (Total Amount of Charges)
        currentBalance = previousBalance + addCharges;
    }
    
    public void monthlyInterest(){
        //Determines the Interest that has been accumulated from the Total Charges
        if (currentBalance < 50){
            interestRate = 0.0;
            interestValue = currentBalance;
        }
        else if (currentBalance > 50.0 && previousBalance < 300.0) {
            interestRate = 0.0;
            interestValue = 50.0;
        }
        else if (currentBalance > 300.0){
            interestRate = 0.2;
            interestValue = previousBalance * interestRate;
        }
    }
    
    public void paymentDue(){
        //Converts the Interest Value into Payment variable
        payment = interestValue;
    }
    
    public void printInConsole(){
        System.out.println ("CS CARD International Statement");
        System.out.println ("===============================");
        System.out.println ("                               ");
        System.out.println ("Previous Balance:      " + "$" + previousBalance);
        System.out.println ("Additional Charges:    " + "$" + addCharges);
        System.out.println ("Interest:              " + "%" + interestRate);
        System.out.println ("                               ");
        System.out.println ("New Balance:           " + "$" + currentBalance);
        System.out.println ("                               ");
        System.out.println ("Minimum Payment:       " + "$" + payment);
    }
}
