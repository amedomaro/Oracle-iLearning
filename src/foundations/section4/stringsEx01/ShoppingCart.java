package foundations.section4.stringsEx01;

public class ShoppingCart {
    public static void main(String[] args) {
        String custName = "Steve Smith";

        int spaceIdx = custName.indexOf(' ');
        String firstName = custName.substring(0, spaceIdx);

        // Get the index of the space character (" ") in custName.

        // Use the substring method parse out the first name and print it.

        System.out.println(firstName);

    }
}