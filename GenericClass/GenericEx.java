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
        MyClass<String> stringMyClass = new MyClass<>();
        stringMyClass.setValue("Hello");
        stringMyClass.getValue();
        MyClass<Integer> integerMyClass = new MyClass<>();
        integerMyClass.setValue(5);
        stringMyClass.getValue();
    }
}
