package foundations.section8.arrayListsEx02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx2 {

    public static void main(String[] args) {
        int count = 1;
        List<Integer> number = new ArrayList<>();

        for (int i = 0; i <= 10; i++) {
            number.add(i);
        }

        Iterator<Integer> iterator = number.iterator();
        System.out.println(number);  //List before removal

        while (iterator.hasNext()) {
            int i = iterator.next();

            if (i % 2 == 0) {
                iterator.remove();
            }

            count++;
        }

        System.out.println(number); // List after removal

    }
}
