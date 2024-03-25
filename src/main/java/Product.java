public class Product {
    private String category;
    private String itemName;
    private double cost;

    public Product(String category, String itemName, double cost) {
        this.category = category;
        this.itemName = itemName;
        this.cost = cost;
    }

    public void getProductDetails() {
        // Get product details
        System.out.println("Product Details:");
        System.out.println("Category: " + category);
        System.out.println("Item Name: " + itemName);
        System.out.println("Cost: $" + cost);
    }

  
    public double getCost() {
        return cost;
    }
}
