package OOPs.EcommerceOrderSystem;

import java.util.ArrayList;
import java.util.List;

public class Implement {
    public static void main(String[] args) {
        Address a = new Address("Lengarewadi","Atpadi",415301);
        Address a1 = new Address("Tathawade","Pune",415300);
        Address a2 = new Address("Taj","Mumbai",415333);
        Electronics e = new Electronics("Laptop",200000.0);
        Electronics e1 = new Electronics("Keyboard",200.0);
        Clothing c = new Clothing("Shirt",1500.0);

        Customer customer = new Customer(1,"Pravin",a,new EmailNotification(),e);
        Customer customer1 = new Customer(2,"Amol",a1,new SMSNotification(),c);
        Customer customer2 = new Customer(3,"Ram",a2,new EmailNotification(),e1);

        System.out.println("Customer details : ");

        List<Customer> customers = new ArrayList<>();
        customers.add(customer);
        customers.add(customer1);
        customers.add(customer2);
        System.out.println("-------------------------------------");
        for (Customer customerVar :customers){
            System.out.println("CustomerId : "+customerVar.getCustomerId());
            System.out.println("CustomerName : "+customerVar.getCustomerName());
            System.out.println("CustomerAddress : "+customerVar.getAddress());
            System.out.print("Product : "+customerVar.getProduct());
            System.out.println(" with the discount price : "+customerVar.getProduct().getDiscountedPrice());

            System.out.println("Notification : "+customerVar.getNotificationService().sendNotification("Order placed successfully !"));
            System.out.println("-------------------------------------");
        }
        List<Product> products = new ArrayList<>();
        products.add(e);
        products.add(c);
        products.add(e1);
        System.out.println("--- Order Summary ---");
        for (Product product: products){
            System.out.println("Product: " + product.getProductName() + " | Price: " + product.getDiscountedPrice());

        }

    }
}
