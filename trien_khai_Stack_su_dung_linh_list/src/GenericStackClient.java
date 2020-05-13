import java.util.ArrayList;

public class GenericStackClient {
    public static void stackOfIStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        ArrayList<String> newStack = new ArrayList<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push operations: " + stack.size());
        System.out.printf("1.2. Pop elements from stack : ");
        while (stack.size() != 0) {
           newStack.add(newStack.size(),stack.pop());
        }

        System.out.println("\n1.3. Size of stack after pop operations : " + stack.size());
        System.out.println("\n1.4. Size of stack after pop operations : " + newStack.size());

        for (int i = 0; i < newStack.size();i++){
            System.out.println( newStack.get(i));
        }

    }

    public static void stackOfIInteger() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        ArrayList<Integer> newStack = new ArrayList<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1 Size of stack after push operations: " + stack.size());
        System.out.printf("2.2. Pop elements from stack : ");
        while (stack.size() != 0) {
            newStack.add(newStack.size(),stack.pop());
        }

        System.out.println("\n2.3. Size of stack after pop operations : " + stack.size());
        System.out.println("\n2.4. Size of stack after pop operations : " + newStack.size());

        for (int i = 0; i < newStack.size();i++){
            System.out.println( newStack.get(i));
        }

    }
}
