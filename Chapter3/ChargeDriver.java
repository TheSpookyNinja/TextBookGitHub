
/**
 * Write a description of class ChargeDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ChargeDriver
{
      public static void main(String[]args){
        //Declaring the object
        ChargeAccount charge = new ChargeAccount();
        //Calling upon methods in Charge Account
        charge.pastBalance();
        charge.additionalCharges();
        charge.newBalance();
        charge.monthlyInterest();
        charge.paymentDue();
        charge.printInConsole();
    }
}
