package OOPs.EcommerceOrderSystem;

public class Customer {
    private Integer customerId;
    private String customerName;

    private Product product;

    public Product getProduct() {
        return product;
    }

    private Address address;
    private NotificationService notificationService;

    public Customer(Integer customerId, String customerName, Address address, NotificationService notificationService,Product product) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.address = address;
        this.notificationService = notificationService;
        this.product = product;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }

    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", address=" + address +
                ", notificationService=" + notificationService +
                '}';
    }
}
