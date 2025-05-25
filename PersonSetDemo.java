import java.util.*;

class Person {
    String name;
    int age;
    double income;

    Person(String name, int age, double income) {
        this.name = name;
        this.age = age;
        this.income = income;
    }

    @Override
    public String toString() {
        return name + " (Age: " + age + ", Income: " + income + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return this.name.equals(other.name) && this.age == other.age && this.income == other.income;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, income);
    }
}

public class PersonSetDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Person> setA = new HashSet<>();

        System.out.print("Enter number of persons: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Income: ");
            double income = sc.nextDouble();
            sc.nextLine(); // consume newline

            setA.add(new Person(name, age, income));
        }

        // I. Set B: age > 60
        Set<Person> setB = new HashSet<>();
        for (Person p : setA) {
            if (p.age > 60) {
                setB.add(p);
            }
        }

        // II. Set C: income < 10000
        Set<Person> setC = new HashSet<>();
        for (Person p : setA) {
            if (p.income < 10000) {
                setC.add(p);
            }
        }

        // III. B ∩ C
        Set<Person> intersection = new HashSet<>(setB);
        intersection.retainAll(setC);

        // Displaying all sets
        System.out.println("\nSet A (All Persons):");
        printSet(setA);

        System.out.println("\nSet B (Age > 60):");
        printSet(setB);

        System.out.println("\nSet C (Income < 10000):");
        printSet(setC);

        System.out.println("\nSet B ∩ C:");
        printSet(intersection);
    }

    public static void printSet(Set<Person> set) {
        if (set.isEmpty()) {
            System.out.println("No persons found.");
        } else {
            for (Person p : set) {
                System.out.println(p);
            }
        }
    }
}
