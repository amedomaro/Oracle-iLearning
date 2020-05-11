package programming.section3.collections2.genericStack;

public class Main {

    public static void main(String[] args) {
        GenericStack<Integer> gs = new GenericStack<>();

        for (int i = 0; i < 4; i++) {
            gs.push(i);
        }

        for (int i = 0; i < 5; i++) {
            System.out.printf("Delete item number %d\n", i + 1);
            gs.pop();
        }
    }
}
