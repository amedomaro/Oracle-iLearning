package foundations.section5.practices;

public class ColorRange {
    public static void main(String[] args) {

        System.out.print("Enter a color code: ");
        double num = new Number().getDouble();

        if ((num >= 380) & (num < 450)) {
            System.out.println("The color is Violet");
        } else if ((num >= 450) & (num < 495)) {
            System.out.println("The color is Blue");
        } else if ((num >= 495) & (num < 570)) {
            System.out.println("The color is Green");
        } else if ((num >= 570) & (num < 590)) {
            System.out.println("The color is Yellow");
        } else if ((num >= 590) & (num < 620)) {
            System.out.println("The color is Orange");
        } else if ((num >= 620) & (num < 750)) {
            System.out.println("The color is Red");
        } else {
            System.out.println("The entered wavelength is not a part of the visible spectrum");
        }
    }
}
