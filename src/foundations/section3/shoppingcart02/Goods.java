package foundations.section3.shoppingcart02;

public abstract class Goods {
    private String name;
    private Color color;
    private double price;
    private int count;

    protected Goods(Color color, int count){
        setColor(color);
        setCount(count);
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color.getColor();
    }

    private void setColor(Color color) {
        this.color = color;
    }

     public double getPrice() {
        return price;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    public int getCount() {
        return count;
    }

    private void setCount(int count) {
        if (count <= 0){
            System.out.println("Quantity must be positive!");
        }else this.count = count;
    }
}
