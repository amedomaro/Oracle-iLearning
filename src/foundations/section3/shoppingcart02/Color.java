package foundations.section3.shoppingcart02;

public enum Color {
    WHITE("White"), BLACK("Black"), PINK("Pink"), GREEN("Green"), YELLOW("Yellow");

    private String color;

    Color(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
