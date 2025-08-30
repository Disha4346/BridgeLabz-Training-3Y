package btech.third.comp;

// Program to calculate total purchase price
// Formula: total = unitPrice * quantity

import java.util.Scanner;

class PurchasePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input unit price
        System.out.print("Enter unit price: ");
        double unitPrice = sc.nextDouble();

        // Input quantity
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        if (unitPrice < 0 || quantity < 0) {
            System.out.println("Unit price and quantity must be non-negative.");
            sc.close();
            return;
        }

        // Calculation
        double total = unitPrice * quantity;

        // Output
        System.out.println("The total purchase price is INR " + total +
                           " if the quantity " + quantity + " and unit price is INR " + unitPrice);
        sc.close();
    }

}
