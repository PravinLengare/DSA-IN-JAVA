package OOPs.EcommerceOrderSystem;

public class Clothing extends Product {
    private String productName;
    private Double price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Clothing(String productName, Double price) {
        super(productName, price);
        this.productName = productName;
        this.price = price;
    }

    @Override
    public Double getDiscountedPrice() {
        return .2 * price;
    }
}
