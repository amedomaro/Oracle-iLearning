package foundations.section3.shoppingcart01;

public class ShoppingCart01 {
    public static void main(String[] args) {
        // Declare and initialize String variables.  Do not initialize message yet.
        String custName = "Alex";
        String itemDesc = "shirt";
        String message = String.format("%s wants to purchase a %s", custName, itemDesc);

        // Print and run the code
        System.out.println(message);
        //System.out.printf("%s wants to purchase a %s\n", custName, itemDesc);
    }
}
