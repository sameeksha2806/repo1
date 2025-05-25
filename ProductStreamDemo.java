import java.util.*;
import java.util.stream.*;
  
class Product {
    int id;
    String name;
    double price;
    String type;
    double rating;

    public Product(int id, String name, double price, String type, double rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.type = type;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return name + " | Type: " + type + " | Price: " + price + " | Rating: " + rating;
    }
}

public class ProductStreamDemo {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product(1, "Laptop", 55000, "Electronics", 4.5),
            new Product(2, "Phone", 25000, "Electronics", 4.2),
            new Product(3, "Shirt", 1500, "Clothing", 3.8),
            new Product(4, "Mixer", 3000, "Appliance", 4.0),
            new Product(5, "TV", 40000, "Electronics", 4.8),
            new Product(6, "Book", 700, "Stationery", 4.1),
            new Product(7, "Headphones", 2000, "Electronics", 3.5),
            new Product(8, "Sneakers", 5000, "Clothing", 4.3)
        );

        // i) Products with rating between 4 and 5
        System.out.println("i) Products with rating between 4 and 5:");
        products.stream()
            .filter(p -> p.rating >= 4 && p.rating <= 5)
            .forEach(System.out::println);

        // ii) First 3 products with price > 10000
        System.out.println("\nii) First 3 products with price > 10000:");
        products.stream()
            .filter(p -> p.price > 10000)
            .limit(3)
            .forEach(System.out::println);

        // iii) Number of products under each type
        System.out.println("\niii) Number of products under each type:");
        Map<String, Long> countByType = products.stream()
            .collect(Collectors.groupingBy(p -> p.type, Collectors.counting()));
        countByType.forEach((type, count) -> 
            System.out.println(type + " => " + count + " product(s)")
        );

        // iv) Average rating of products with type = "Electronics"
        System.out.println("\niv) Average rating of Electronics products:");
        double avgRating = products.stream()
            .filter(p -> p.type.equalsIgnoreCase("Electronics"))
            .mapToDouble(p -> p.rating)
            .average()
            .orElse(0.0);
        System.out.println("Average Rating: " + avgRating);
    }
}
