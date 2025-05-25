// Generic class restricted to Number types only
class NumericBox<T extends Number> {
    private T value;

    public NumericBox(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }

    // Example method that uses a Number method
  public double square() {
        return value.doubleValue() * value.doubleValue();
    }
}
// Demo class
public class BoundedGenericDemo {
    public static void main(String[] args) {
        NumericBox<Integer> intBox = new NumericBox<>(5);
        System.out.println("Integer value: " + intBox.get());
        System.out.println("Square: " + intBox.square());

        NumericBox<Double> doubleBox = new NumericBox<>(3.14);
        System.out.println("Double value: " + doubleBox.get());
        System.out.println("Square: " + doubleBox.square());

        // This will cause a compile-time error
        // NumericBox<String> strBox = new NumericBox<>("Hello");
    }
}
