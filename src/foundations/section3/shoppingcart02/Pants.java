package foundations.section3.shoppingcart02;

public class Pants extends Goods {

    protected Pants(Color color, int count) {
        super(color, count);
        super.setName("Pants");
        super.setPrice(3.45);
    }
}
