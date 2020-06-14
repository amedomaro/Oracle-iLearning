package programming.section3.generics.genericShapes;

/**
 @author Aleksandr Ilin
 */

public class Cuboid<T extends Number> {

    private T length, width, height;
    private String name;

    Cuboid(String name, T length, T width, T height) {
        this.name = name;
        setLength(length);
        setWidth(width);
        setHeight(height);
    } // end constructor

    protected double getVolume() {
        return Double.parseDouble(length.toString()) * Double.parseDouble(width.toString())
                * Double.parseDouble(height.toString());
    }

    protected void printVolume() {
        System.out.printf("volume of the shape = %.2f\n", getVolume());
    }

    // Below getters, setters and override
    protected T getLength() {
        return length;
    }

    protected void setLength(T length) {
        this.length = length;
    }

    protected T getWidth() {
        return width;
    }

    protected void setWidth(T width) {
        this.width = width;
    }

    protected T getHeight() {
        return height;
    }

    protected void setHeight(T height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "\nShape " + name + " has:\nLength - " + getLength() + "\nWidth - " + getWidth() + "\nHeight - " + getHeight();
    }
}
