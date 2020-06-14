package Stone;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        List<Integer> mountain = Arrays.asList(2, 3, 5, 8, 9); // Создали гору камней
        mountain.sort(Collections.reverseOrder()); // Отсортировали гору (по убыванию)
        int[] heaps = new int[4]; //Создаём нужное нам колличество куч

        for (Integer weightStone : mountain) {  // Перебираем гору камней, раскладывая камни в самую лёгкую кучу
            heaps[0] += weightStone;
            Arrays.sort(heaps);
        }

        for (int i = 0; i < heaps.length; i++) {  // Вывод результата работы программы
            System.out.printf("Вес %d кучи составил: %d\n", i + 1, heaps[i]);
        }
    }
}
