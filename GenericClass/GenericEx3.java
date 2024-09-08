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
