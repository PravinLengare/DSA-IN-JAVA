package OOPs.EcommerceOrderSystem;

public class Product {
    private String productName;
    private Double price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Product(String productName, Double price) {
        this.productName = productName;
        this.price = price;
    }
    public Double getDiscountedPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}
