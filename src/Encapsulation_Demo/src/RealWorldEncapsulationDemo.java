package Encapsulation_Demo.src;

class Product {
    // Private fields protect product details.
    private String productName;
    private double price;

    // Setter validates product name before storing it.
    public void setProductName(String productName) {
        if (productName != null && !productName.trim().isEmpty()) {
            this.productName = productName;
        } else {
            System.out.println("Invalid product name.");
        }
    }

    // Getter returns the product name.
    public String getProductName() {
        return productName;
    }

    // Setter validates that price cannot be negative.
    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative.");
        }
    }

    // Getter returns the product price.
    public double getPrice() {
        return price;
    }
}

public class RealWorldEncapsulationDemo {

    public static void main(String[] args) {
        // Create a product object.
        Product product = new Product();

        // Set values using validated setter methods.
        product.setProductName("Laptop");
        product.setPrice(250000.00);

        // Display the protected data through getters.
        System.out.println("Product Name: " + product.getProductName());
        System.out.println("Price       : " + product.getPrice());
    }
}
