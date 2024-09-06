package GenericClass;

public class MyClass<T> {
    T value;
    void setValue(T a) {
        value = a;
    }
    T getValue() {
        return value;
    }

    public static void main(String[] args) {
        MyClass<String> stringMyClass = new MyClass<>(); // T를 String으로 구체화 시킴
        stringMyClass.setValue("Hello");
        stringMyClass.getValue();
        MyClass<Integer> integerMyClass = new MyClass<>(); // T를 Integer으로 구체화 시킴
        integerMyClass.setValue(5);
        stringMyClass.getValue();
    }
}
