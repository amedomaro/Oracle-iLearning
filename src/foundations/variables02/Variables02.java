package foundations.variables02;

public class Variables02 {

    public static void main(String[] args) {
        //RUN THE PROGRAM BETWEEN EACH STEP AND OBSERVE THE OUTPUT
        //Step 1) Change the print statements in lines 12 and 16 so that they print the value of x.
        //Step 2) Change the value of x to "kitty".

        String x = "puppy";
        System.out.println("puppy");
        System.out.println(x);
        System.out.println("______________________");

        x = "kitty";
        System.out.println(x);
        System.out.printf("%s\n", x);
        System.out.println("______________________");

        //Step 3) Add a line of code that changes the value of x to "bunny".

        System.out.printf("%s\n", x);
        x = "bunny";
        System.out.println(x);

    }
}
