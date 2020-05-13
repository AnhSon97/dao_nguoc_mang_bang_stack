import java.util.ArrayList;
import java.util.EmptyStackException;

public class MyGenericStack<T> {
    private ArrayList<T> stack;

    public MyGenericStack() {
        stack = new ArrayList<T>();
    }

    public void push(T element) {
        stack.add(0,element);
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.remove(0);
    }

    public int size() {
        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) {
            return true;
        }
        return false;
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println("1. Stack of integers");
        GenericStackClient.stackOfIStrings();


        System.out.println("2.Stack of integer");
        GenericStackClient.stackOfIInteger();
    }
}
