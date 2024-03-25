import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Registration module
        User user = new User("Yeshwant", "1234567890", "Adikmet, Hyderabad", "yesh@gmail.com");
        if (user.validateInput()) {
            System.out.println("You have been successfully registered. Welcome to the AtoZ online Application.");
        }

        // Product details module
        List<Product> products = new ArrayList<Product>();
        products.add(new Product("Grocery", "Rice", 5.99));
        products.add(new Product("Stationary", "Notebook", 2.49));
        // Display product details

        // Billing module
        Bill bill = new Bill(products);
        bill.generateBill();
        bill.makePayment("Cash on Delivery");
    }
}
