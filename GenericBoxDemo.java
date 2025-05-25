// Generic class definition, reusable code for any type
class Box<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    
}

// Demo class
public class GenericBoxDemo {
    public static void main(String[] args) {
        // Box for Integer
        Box<Integer> intBox = new Box<>();
        intBox.set(100);
	intBox.set(500);
        System.out.println("Integer value: " + intBox.get());
        

        // Box for String
        Box<String> strBox = new Box<>();
        strBox.set("Hello Generics");
        System.out.println("String value: " + strBox.get());
        

        // Box for Double
        Box<Double> doubleBox = new Box<>();
        doubleBox.set(3.14);
        System.out.println("Double value: " + doubleBox.get());
      
    }
}
