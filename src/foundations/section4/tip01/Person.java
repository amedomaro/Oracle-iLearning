package foundations.section4.tip01;

import java.util.HashMap;
import java.util.Map;

public class Person {
    private Map<String, Double> bill = new HashMap<>();

    protected void addBill(String name, double num) {
        if (num >= 0) {
            bill.put(name, num);
        } else {
            System.err.println("The number must be positive");
        }
    }

    protected void removeBill(String name) {
        bill.remove(name);
    }

    public void printBill() {
        for (Map.Entry<String, Double> pair : bill.entrySet()) {
            System.out.printf("%s: $%.1f\n", pair.getKey(), (pair.getValue() * (1 + 0.05 + 0.15)));
        }
    }

}
