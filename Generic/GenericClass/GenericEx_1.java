class GStack<T> {
    int tos;
    Object [] stck;
    public GStack() {
        tos=0;
        stck = new Object[10]; //제네틱 타입 객체 생성 불가 그래서! Object객체 생성
    }
    /** pushStack Method
     * index 0부터 item을 저장함
     */
    public void push(T item) {
        if (tos == 10) {
            return;
        }
        stck[tos] = item;
        tos++;
    }
    /** popStack Method
     * 저장한 마지막 값 부터 꺼내옵니다.
     * Casting 주의!
     */
    public T pop() {
        if (tos ==0) {
            return null;
        }
        tos--;
        return (T)stck[tos]; //Casting 해야됨 Object 타입 -> T으로 [중요!!!!!!!!!!!!!!!]
    }
}
public class Mystack {
    public static void main(String[] args) {
        GStack<String> stringGStack = new GStack<>(); //string 타입 객체 생성
        stringGStack.push("seoul");
        stringGStack.push("busan");
        stringGStack.push("LA");

        for (int i = 0; i < 3; i++) {
            System.out.println(stringGStack.pop());
        }
        GStack<Integer> gStack = new GStack<>(); //integer 타입 객체 생성
        gStack.push(1);
        gStack.push(3);
        gStack.push(5);
        for (int i = 0; i < 3; i++) {
            System.out.println(gStack.pop());
        }
    }
}
