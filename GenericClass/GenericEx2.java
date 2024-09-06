package GenericClass;

public class GenericStackEx<T> {
    int index;
    Object[] stack;

    public GenericStackEx() {
        index = 0;
        stack = new Object[10];
    }
    public void pushStack(T value) {
        stack[index] = value;
        index++;
        if (index > 10) {
            System.out.println("스택 용량 꽉참 못넣는다.");
        }
    }
    public void popStack() {
        if (index == 0) {
            System.out.println("비어있습니다. 못 꺼내요..");
        }
        index --;
        System.out.println((T)stack[index]);
    }

    public static void main(String[] args) {
        GenericStackEx<Integer> genericStackEx = new GenericStackEx<>();
        genericStackEx.pushStack(1);
        genericStackEx.pushStack(3);
        genericStackEx.pushStack(5);

        for (int i = 0; i < 3; i++) {
            genericStackEx.popStack();
        }
    }
}
