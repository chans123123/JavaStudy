package GenericClass;

public class GenericStackEx<T> {
    int index;
    Object[] stack;

    public GenericStackEx() {
        index = 0;
        stack = new Object[10]; //제네틱 타입 객체 생성 불가 그래서! Object객체 생성
    }
    /** pushStack Method
     * index 0부터 value를 저장함
     * 만약 stack 크기보다 크면 경고메세지 출력
     * 예외처리 해야되지만 귀찮아요~
     */
    public void pushStack(T value) {
        stack[index] = value;
        index++;
        if (index > stack.length) {
            System.out.println("스택 용량 꽉참 못넣는다.");
        }
    }
    /** popStack Method
     * 저장한 마지막 값 부터 꺼내와요~
     * 예외처리 해야되지만 귀찮아요~
     * Casting 주의!
     */
    public void popStack() {
        if (index == 0) {
            System.out.println("비어있습니다. 못 꺼내요..");
        }
        index --;
        System.out.println((T)stack[index]); //Casting 해야됨 Object 타입 -> T으로
    }

    public static void main(String[] args) {
        GenericStackEx<Integer> genericStackEx = new GenericStackEx<>();
        genericStackEx.pushStack(1);
        genericStackEx.pushStack(3);
        genericStackEx.pushStack(5);
        
        Stack<Integer> integerStack = new Stack<Integer>();
        for (int i = 0; i < 5; i++) {
            integerStack.push(i);
        }
        integerStack = reverseStack(integerStack);

        for (int i = 0; i < 5; i++) {
            System.out.println(integerStack.pop());
        }

        for (int i = 0; i < 3; i++) {
            genericStackEx.popStack();
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
