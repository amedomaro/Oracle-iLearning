package foundations.section3.parsing01;

public class Parsing01 {
    public static void main(String[] args) {
        //Declare and initialize 3 Strings: shirtPrice, taxRate, and gibberish

        String shirtPrice = "15";
        String taxRate = "0.05";
        String gibberish = "887ds7nds87dsfs";

        //Parse shirtPrice and taxRate, and print the total tax

        System.out.printf("Total tax: %.2f\n",
                Integer.parseInt(shirtPrice) + Integer.parseInt(shirtPrice) * Double.parseDouble(taxRate));
        System.out.println("-----------------------------------------------------------------------------------------------");
        //Try to parse taxRate as an int

        System.out.println("Parse taxRate as an int:");

        try{
            Integer.parseInt(taxRate);
        }catch (NumberFormatException e){
            System.out.println("Exception in thread \"main\" java.lang.NumberFormatException: For input string: \"0.05\"");
        }

        System.out.println("-----------------------------------------------------------------------------------------------");

        //Try to parse gibberish as an int

        System.out.println("Parse gibberish as an int:");

        try{
            Integer.parseInt(gibberish);
        }catch (NumberFormatException e){
            System.out.println("Exception in thread \"main\" java.lang.NumberFormatException: For input string: \"887ds7nds87dsfs\"");
        }

        System.out.println("-----------------------------------------------------------------------------------------------");
    }

}
