package Generic;

class GenericClass<T> {
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }
}

class GenericBox<T> {
    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public boolean isInstanceOf(Class<?> clazz) {
        return clazz.isInstance(value);
    }
}
public class GenericExample {
    public static void main(String[] args) {
        // Create instances of GenericBox
        GenericBox<String> stringBox = new GenericBox<>("Hello, Generics!");
        GenericBox<Integer> intBox = new GenericBox<>(123);

        // Check if value is an instance of a specific class
        System.out.println("stringBox contains String: " + stringBox.isInstanceOf(String.class)); // true
        System.out.println("intBox contains Integer: " + intBox.isInstanceOf(Integer.class));   // true

        // Using instanceof directly
        Object obj = "Sample String";
        if (obj instanceof String) {
            System.out.println("obj is an instance of String");
        }
    }
}
