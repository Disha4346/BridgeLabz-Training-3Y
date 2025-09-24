import java.util.ArrayList;
import java.util.List;

// Product class
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getDetails() {
        return name + " ($" + price + ")";
    }

    public double getPrice() {
        return price;
    }
}

// Order class (aggregates products)
class Order {
    private int orderId;
    private List<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void showOrderDetails() {
        System.out.println("Order #" + orderId + " contains:");
        double total = 0;
        for (Product p : products) {
            System.out.println(" - " + p.getDetails());
            total += p.getPrice();
        }
        System.out.println("Total Price: $" + total);
    }
}

// Customer class
class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    // Communication: placing an order
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed Order #" + order.hashCode());
    }

    public void showOrders() {
        System.out.println(name + "'s Orders:");
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}

// Main class
public class ECommerceOrder {
    public static void main(String[] args) {
        // Create products
        Product p1 = new Product("Laptop", 750.00);
        Product p2 = new Product("Phone", 500.00);
        Product p3 = new Product("Headphones", 50.00);

        // Create customer
        Customer c1 = new Customer("Alice");

        // Create orders
        Order o1 = new Order(101);
        o1.addProduct(p1);
        o1.addProduct(p3);

        Order o2 = new Order(102);
        o2.addProduct(p2);

        // Customer places orders
        c1.placeOrder(o1);
        c1.placeOrder(o2);

        // Show details
        c1.showOrders();
    }
}
