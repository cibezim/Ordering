package scannerhomework;

import java.util.Scanner;

public class Ordering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();

        System.out.print("Enter price per item: ");
        double pricePerItem = scanner.nextDouble();

        System.out.print("Enter distance in miles: ");
        double distance = scanner.nextDouble();


        double totalCost = calculateTotalCost(distance, quantity, pricePerItem);


        System.out.println("________________________________________________");
        System.out.printf("%-15s %-8s %-10s %-10s %-10s\n", "Product", "Qty", "Price", "Miles", "Total");
        System.out.println("----           ---       -----       -----       -----");
        System.out.printf("%-15s %-8d %-9.2f %-9.2f %-9.2f\n", productName, quantity, pricePerItem, distance, totalCost);


        scanner.close();
    }

    private static double calculateTotalCost(double distance, int quantity, double pricePerItem) {
        double fee;

        if (distance >= 0 && distance <= 5) {
            fee = 2;
        } else if (distance <= 15) {
            fee = 5;
        } else if (distance <= 25) {
            fee = 10;
        } else if (distance <= 50) {
            fee = 15;
        } else {
            fee = 20;
        }

        return quantity * pricePerItem + fee;
    }
}
