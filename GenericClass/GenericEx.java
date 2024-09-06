package GenericClass;

public class MyClass<T> {
    T value;
    void setValue(T a) {
        value = a;
    }
    T getValue() {
        return value;
    }
}
