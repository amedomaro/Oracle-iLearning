package foundations.section3.shoppingcart02;

public class ShoppingCart02 {
    public static void main(String[] args) {
//        String custName = "Alex";
//        String itemDesc = "Shirts";
//        String message = custName + " wants to purchase a " + itemDesc;
//        System.out.println(message);

        Customer alex = new Customer("Alex");
        alex.addGood(new Shirts("Green", 1));
        alex.addGood(new Shirts("White", 2));
        alex.addGood(new Pants("Black", 1));
        alex.printBasket();




    }
}
