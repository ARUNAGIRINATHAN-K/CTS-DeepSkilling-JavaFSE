import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P005", "Laptop", "Electronics"),
            new Product("P001", "Smartphone", "Electronics"),
            new Product("P004", "Desk Chair", "Furniture"),
            new Product("P002", "Coffee Maker", "Appliances"),
            new Product("P003", "Running Shoes", "Apparel")
        };

        System.out.println("--- Linear Search ---");
        Product foundLinear = SearchAlgorithm.linearSearch(products, "P004");
        if (foundLinear != null) {
            System.out.println("Linear Search Found: " + foundLinear);
        } else {
            System.out.println("Linear Search: Product not found.");
        }

        System.out.println("\n--- Binary Search ---");
        Arrays.sort(products); 
        
        System.out.println("Array sorted by Product ID:");
        for(Product p : products) {
            System.out.println(p);
        }
        
        Product foundBinary = SearchAlgorithm.binarySearch(products, "P004");
        if (foundBinary != null) {
            System.out.println("\nBinary Search Found: " + foundBinary);
        } else {
            System.out.println("\nBinary Search: Product not found.");
        }
    }
}
