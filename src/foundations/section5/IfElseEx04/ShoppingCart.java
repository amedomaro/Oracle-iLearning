package foundations.section5.IfElseEx04;

public class ShoppingCart {

    public static void main(String[] args) {
        String castName = "Mary Smith";
        String itemDesc = "Shirt";

        // numeric fields
        double price = 21.99;
        int quantity = 2;
        double tax = 1.04;
        double total;
        String message = castName + " wants to purchase " + quantity + " " + itemDesc;

        // Calculating total cost
        total = (price * quantity) * tax;

        // Declare outOfStock variable and initialize it
        boolean outOfStock = false;

        if (quantity > 1) {
            outOfStock = true;
        }

        // Test quantity and modify message if quantity > 1.
        if (outOfStock) {
            System.out.printf("%ss\n", message);
        }

        // Test outOfStock and notify user in either case.
        if (quantity < 1) {
            System.out.println("An item is out of stock");
        } else {
            System.out.println(message);
        }

    }
}
