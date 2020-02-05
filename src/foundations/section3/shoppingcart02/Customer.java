package foundations.section3.shoppingcart02;

public class Customer extends Basket{
    private static String name;

    public Customer(String name){
        setName(name);
    }

    public static String getName(){
        return name;
    }

    private void setName(String name){
        Customer.name = name;
    }
}
