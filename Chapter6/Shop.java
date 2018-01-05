// ***************************************************************
//   Shop.java
//
//   Uses the Item class to create items and add them to a shopping
//   cart stored in an ArrayList.
// ***************************************************************
import java.util.ArrayList;
import java.util.Scanner;

public class Shop

{
    public static void main (String[] args)

    {
        ArrayList<Item> cart = new ArrayList<Item>();

        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        String keepShopping = "y";
        
        Scanner scan = new Scanner(System.in);
        
        while (keepShopping.equals("y")) 

            {
                System.out.print ("Enter the name of the item: ");
                itemName = scan.next();
                
                System.out.print ("Enter the unit price: ");
                itemPrice = scan.nextDouble();

                System.out.print ("Enter the quantity: ");
                quantity = scan.nextInt();
                
                // *** create a new item and add it to the cart
                Item thing = new Item (itemName, itemPrice, quantity);
                cart.add(thing);
                
                // *** print the contents of the cart object using println
                
                System.out.print ("Continue shopping (y/n)? ");
                keepShopping = scan.next();
            }
        checkOut(cart);
    }


     public static void checkOut(ArrayList<Item> yourCart) {
        Scanner scan = new Scanner(System.in);
        
         //You do NOT need a getter method (think about public instance variables)
        System.out.println();
        System.out.println("Your cart contains:");
        
        //Ask the user if they would like to remove an item.  If yes, remove that item.
        ArrayList<Integer> itemsRemoved = new ArrayList<Integer>();
        
        //Print the contents of the cart (you may use the toString() method
        for (int x = 0; x < yourCart.size(); x++){
             System.out.println(yourCart.get(x));
             System.out.println("Remove this item? (y/n)");
             String answer = scan.next();
             if(answer.equals("y")) {
                 itemsRemoved.add(x);
                }
        }
        
        for (int x : itemsRemoved) {
            yourCart.remove(x);
        }
        
        //Print final total of items and final price (total)
        double total = 0;
        for (Item x : yourCart) {
            total += x.price * x.quantity;
        }

        System.out.println("You have purchased: "+ yourCart + "\n For the cost of: "+total);
    }

}