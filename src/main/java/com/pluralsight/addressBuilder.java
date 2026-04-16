package com.pluralsight;

import java.util.Scanner;

public class addressBuilder {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create the StringBuilder object
        StringBuilder address = new StringBuilder();

        // Ask for user input
        System.out.print("Full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine();

        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine();

        System.out.print("Billing State: ");
        String billingState = scanner.nextLine();

        System.out.print("Billing Zip: ");
        String billingZip = scanner.nextLine();

        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine();

        System.out.print("Shipping City: ");
        String shippingCity = scanner.nextLine();

        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine();

        System.out.print("Shipping Zip: ");
        String shippingZip = scanner.nextLine();

        // Build output using StringBuilder
        address.append(fullName).append("\n");
        address.append("Billing Address:\n");
        address.append(billingStreet).append("\n");
        address.append(billingCity);
        address.append(", ");
        address.append(billingState);
        address.append(" ");
        address.append(billingZip);
        address.append("\n");

        address.append("Shipping Address:\n");
        address.append(shippingStreet).append("\n");
        address.append(shippingCity);
        address.append(", ");
        address.append(shippingState);
        address.append(" ");
        address.append(shippingZip);


        // Print final result
        System.out.println("\nCustomer Information:");
        System.out.println(address.toString());



    }
}