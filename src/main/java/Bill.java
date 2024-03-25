import java.util.List; // Added import statement

public class Bill {
    private List<Product> itemList;
    private double totalAmount;
    private String paymentMethod;

    public Bill(List<Product> itemList) {
        this.itemList = itemList;
        this.totalAmount = calculateTotal();
    }

    private double calculateTotal() {
        double total = 0;
        for (Product product : itemList) {
            total += product.getCost();
        }
        return total;
    }

    public void generateBill() {
        System.out.println("Total Amount: $" + totalAmount);
        System.out.println("Payment Method: " + paymentMethod);
    }

    public void makePayment(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        System.out.println("Payment Successful");
        System.out.println("Paid: $" + totalAmount + " using " + paymentMethod);
    }
}