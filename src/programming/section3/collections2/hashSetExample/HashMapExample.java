package programming.section3.collections2.hashSetExample;

/**
 @author Aleksandr Ilin
 */

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    private Map<String, String> fruitBowl = new HashMap<>();

    protected void addElements(Map<String, String> fruitBowl) {
        fruitBowl.put("Apple", "Green");
        fruitBowl.put("Cherry", "Red");
        fruitBowl.put("Orange", "Orange");
        fruitBowl.put("Banana", "Yellow");
    }

    protected void displayElements(Map<String, String> fruitBowl) {
        for (HashMap.Entry<String, String> entry : fruitBowl.entrySet()) {
            System.out.printf("Fruit: %-8s - Color: %-8s\n", entry.getKey(), entry.getValue());
        }
    }

    protected void findElement(Map<String, String> fruitBowl, String fruit) {
        if (fruitBowl.containsKey(fruit)) {
            System.out.printf("The %s is %s\n",fruit ,fruitBowl.get(fruit));
        } else {
            System.out.printf("There is no %s in the bowl\n", fruit);
        }
    }

    public static void main(String[] args) {

        HashMapExample hme = new HashMapExample();

        hme.addElements(hme.fruitBowl);
        hme.displayElements(hme.fruitBowl);
        hme.findElement(hme.fruitBowl, "Apple");
        hme.findElement(hme.fruitBowl, "Kiwi");
    }
}
