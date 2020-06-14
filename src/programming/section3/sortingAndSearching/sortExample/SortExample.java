package programming.section3.sortingAndSearching.sortExample;

/**
 @author Aleksandr Ilin
 */

public class SortExample {

    private int[] numbers = {40, 7, 59, 4, 1};

    protected void selectionSort(int[] arr) {
        int indexMin;

        for (int i = 0; i < arr.length; i++) {
            indexMin = i;

            for (int j = i + 1; j < arr.length; j++) {
                indexMin = (arr[j] < arr[indexMin]) ? j : i;

                int temp = arr[i];
                arr[i] = arr[indexMin];
                arr[indexMin] = temp;
            }
        }
    }

    protected void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    protected int sequentialSearch(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                System.out.printf("The number %d is at position %d in the list\n", value, i);
                return i;
            }
        }
        System.out.printf("The number %d is not in the list\n", value);
        return -1;
    }

    protected void displayValues(int[] arr) {
        for (int i : arr) {
            System.out.printf("%d ", i);
        }
        System.out.println();
    }


    public static void main(String[] args) {

        SortExample sortSelect = new SortExample();
        sortSelect.displayValues(sortSelect.numbers);
        sortSelect.selectionSort(sortSelect.numbers);
        sortSelect.displayValues(sortSelect.numbers);

        System.out.println();

        SortExample sortBubble = new SortExample();
        sortBubble.displayValues(sortBubble.numbers);
        sortBubble.bubbleSort(sortBubble.numbers);
        sortBubble.displayValues(sortBubble.numbers);

        System.out.println();

        SortExample search = new SortExample();
        search.sequentialSearch(search.numbers, 13);
        search.sequentialSearch(search.numbers, 7);
    }

}
