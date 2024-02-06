//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args)
    {

        /*class price
        	main()
        	    num totalPrice
        	    num newPrice
        	    num totalTax = 0
        	    boolean anotherOne

        	    do
        	    	output “Please Enter the Price of your Item.”
        	    	input newPrice
        	    	totalPrice = totalPrice + newPrice
        	    	output “Do you have another item? (Yes=true, No = false)”
        	    	input anotherOne
        	    while anotherOne == true

        	    if totalPrice >= 100 then
        	    	output “Total Price of all items is “ +totalPrice
        	    output “Total Tax is “ +totalTax

            	if totalPrice < 100 then
        	    	totalTax = totalPrice * 0.02
        	    	output “Total Price of all items is “ +totalPrice
        	    	output “Total Tax is “ +totalTax
        	return
        end class */


        Scanner in = new Scanner(System.in); // Input

        double price;
        double shippingCost;
        double totalPrice;
        String trash;
        System.out.print("Enter the price of your item: "); // Output asking for price

        if(in.hasNextDouble()) // Check if number is valid
        {
            price = in.nextDouble();
            if(price >= 100) // Compute Shipping Cost
            {
                shippingCost = 0;
            }
            else
            {
                shippingCost = price * 0.02;
            }

            totalPrice = price + shippingCost;
            System.out.println("The shipping cost is " +shippingCost +" and the total is " +totalPrice);
        }
        else // If number not valid
        {
            trash = in.nextLine();
            System.out.println("\nYou did not enter a valid price: " +trash);
            System.out.println("Run the program again and enter a valid price!");
        }
    }
}