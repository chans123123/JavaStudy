import Stack.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> integerStack = new Stack<Integer>();
        for (int i = 0; i < 5; i++) {
            integerStack.push(i);
        }
        integerStack = reverseStack(integerStack);

        for (int i = 0; i < 5; i++) {
            System.out.println(integerStack.pop());
        }
    }
    public static <T> Stack<T> reverseStack(Stack<T> stack) {
        Stack<T> stack1 = new Stack<T>();
        while (true) {
            T temp;
            temp = stack1.pop();
            if (temp == null) {
                break;
            } //if end
            else {
                stack1.push(temp);
            } // else end
        }//while end
        return stack1;
    }
}
