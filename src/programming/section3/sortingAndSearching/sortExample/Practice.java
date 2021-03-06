package programming.section3.sortingAndSearching.sortExample;

/**
 @author Aleksandr Ilin
 */

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class Practice {
    private int[] numbers = new int[50];
    private Random random = new Random();

    protected int[] fillArray(int[] arr) {  // Метод который заполняет массив случайными числами от 0 до 100
        arr = Arrays.stream(arr).map(i -> random.nextInt(100)).toArray();
        System.out.println("Unordered list:");
        displayValues(arr);
        return arr;
    }

    protected void displayValues(int[] arr) {  // вывод массива
        for (int i : arr) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }


    public static void main(String[] args) throws IOException {
        Practice practice = new Practice();
        SortExample sx = new SortExample();
        InputNumber in = new InputNumber();
        practice.numbers = practice.fillArray(practice.numbers);

        int num = in.getInteger();
        sx.sequentialSearch(practice.numbers, num);
        sx.bubbleSort(practice.numbers);

        System.out.println("Ordered list");
        practice.displayValues(practice.numbers);
        sx.sequentialSearch(practice.numbers, num);

        in.br.close(); // close System.in
    } // end main method
}
