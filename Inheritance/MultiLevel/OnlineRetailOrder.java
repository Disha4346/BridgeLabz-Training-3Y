class Order {
    private String orderId;
    private String orderDate;

    public Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void getOrderStatus() {
        System.out.println("Order ID: " + orderId + " | Date: " + orderDate + " | Status: Placed");
    }
}

class ShippedOrder extends Order {
    private String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public void getOrderStatus() {
        System.out.println("Order ID: " + getOrderId() + " | Date: " + getOrderDate() +
                           " | Tracking No: " + trackingNumber + " | Status: Shipped");
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    public DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    public void getOrderStatus() {
        System.out.println("Order ID: " + getOrderId() + " | Date: " + getOrderDate() +
                           " | Delivered On: " + deliveryDate + " | Status: Delivered");
    }
}

public class OnlineRetailOrder {
    public static void main(String[] args) {
        Order placed = new Order("ORD101", "2025-09-18");
        ShippedOrder shipped = new ShippedOrder("ORD102", "2025-09-17", "TRK12345");
        DeliveredOrder delivered = new DeliveredOrder("ORD103", "2025-09-15", "TRK98765", "2025-09-18");

        placed.getOrderStatus();
        shipped.getOrderStatus();
        delivered.getOrderStatus();
    }
}
