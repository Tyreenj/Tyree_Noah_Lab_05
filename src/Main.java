//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        double price;
        double shippingCost;
        double totalPrice;
        String trash;
        System.out.print("Enter the price of your item: ");

        if(in.hasNextDouble())
        {
            price = in.nextDouble();
            if(price >= 100)
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
        else
        {
            trash = in.nextLine();
            System.out.println("\nYou did not enter a valid price: " +trash);
            System.out.println("Run the program again and enter a valid price!");
        }
    }
}