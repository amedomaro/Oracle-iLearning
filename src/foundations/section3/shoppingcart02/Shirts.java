package foundations.section3.shoppingcart02;

public class Shirts extends Goods {

    protected Shirts(Color color, int count){
        super(color, count);
        super.setName("Shirt");
        super.setPrice(2.25);

    }


}
