@FunctionalInterface
interface PiValue {
    double getPi();
}

public class LambdaPi {
    public static void main(String[] args) {
        PiValue pi = () -> 3.14159;
        System.out.println("Pi is: " + pi.getPi());
    }
}
   

 import java.util.function.Supplier;

public class LambdaPi {
    public static void main(String[] args) {
        Supplier<Double> pi = () -> 3.14159;
        System.out.println("Pi is: " + pi.get());
    }
}
