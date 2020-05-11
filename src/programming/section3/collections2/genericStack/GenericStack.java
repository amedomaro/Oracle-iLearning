package programming.section3.collections2.genericStack;

import java.util.ArrayList;
import java.util.List;

public class GenericStack<T> {

    private List<T> items = new ArrayList<>();
    private int top;

    public GenericStack() {
        this.top = 0;
    } // end constructor

    protected void push(T item) {
        items.add(item);
    }

    protected void pop() {
        if (isEmpty()) {
            throw new GenericStackException();
        } else {
            items.remove(0);
        }
    }

    protected boolean isEmpty(){
        return items.size() == 0;
    }
}
 class GenericStackException extends RuntimeException {

 }