package foundations.section3.shoppingcart02;

public abstract class Goods {
    private String name;
    private String color;
    private double price;
    private int count;

    protected Goods(String color, int count){
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
        return color;
    }

    private void setColor(String color) {
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
