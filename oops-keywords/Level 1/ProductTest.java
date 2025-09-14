public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Laptop", 80000, 2);
        Product p2 = new Product(2, "Mouse", 500, 5);

        p1.displayProductDetails();
        p2.displayProductDetails();

        Product.updateDiscount(15.0);

        System.out.println("\nAfter updating discount:\n");
        p1.displayProductDetails();
        p2.displayProductDetails();
    }
}
