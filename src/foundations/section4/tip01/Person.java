package foundations.section4.tip01;

import java.util.HashMap;
import java.util.Map;

public class Person {
    private Map<String, Double> bill = new HashMap<>();

    protected void addBill(String name, double num) {
        bill.put(name, num);
    }

    protected void removeBill(String name) {
        bill.remove(name);
    }

    public void printBill() {
        for (Map.Entry<String, Double> pair : bill.entrySet()){
            System.out.printf("%s: $%.1f\n",
                    pair.getKey(), pair.getValue() * 0.05 + pair.getValue() * 0.15 + pair.getValue());
        }
    }

}
