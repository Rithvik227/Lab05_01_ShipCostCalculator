import java.util.Scanner;

public class ShipCostCalculator {
    static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float itemPrice = 0;
        float shippingCost = 0;
        System.out.print("Enter your item's price: ");

        if (in.hasNextFloat()) {
            itemPrice = in.nextFloat();
            in.nextLine();
            if (itemPrice < 100) {
                shippingCost = itemPrice * 0.02f;
            } else {
                shippingCost = 0;
            }

            System.out.println("\nThe shipping cost for your item is: $" + shippingCost);
            System.out.println("\nThe total cost for your item is: $" + (itemPrice + shippingCost));

        } else {
            String trash = in.nextLine();
            System.out.println("\nYou entered: " + trash);
            System.out.println("\nThis input is invalid");
        }
    }
}