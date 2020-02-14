package foundations.section4.practices;

public class TestClass {

    public static void main(String[] args) {

        ComputeMethods computeMethods = new ComputeMethods();

        System.out.printf("Temp in celsius is %f\n", computeMethods.fToC(100.4));
        System.out.printf("Hypotenuse is %f\n", computeMethods.hypotenuse(6,9));
        System.out.printf("The sum of the dice values is %d\n", computeMethods.roll());

        System.out.println("_________________________________________________________");

        new ProcessName().printName();

    }
}
