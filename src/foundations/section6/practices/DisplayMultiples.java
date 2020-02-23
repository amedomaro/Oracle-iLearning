package foundations.section6.practices;

public class DisplayMultiples {

    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        double input = new Number().getDouble();
        System.out.println();

        for(int i = 1; i < 13; i++){
            System.out.printf("%.2f x %d = %.2f\n", input, i, input * i);
        }
    }
}
