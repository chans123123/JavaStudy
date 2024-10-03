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
