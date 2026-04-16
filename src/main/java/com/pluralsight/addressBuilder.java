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

        //Building output
        address.append(fullName).append(" ");
        address.append("Billing Address: ");
        address.append(billingStreet).append(" ");
        address.append(billingCity)
                .append(", ")
                .append(billingState)
                .append(" ")
                .append(billingZip)
                .append("\n");

        address.append("Shipping Address: ");
        address.append(shippingStreet).append(" ");
        address.append(shippingCity)
                .append(", ")
                .append(shippingState)
                .append(" ")
                .append(shippingZip);

        // Print final result
        System.out.println("\nCustomer Information:");
        System.out.println(address.toString());



    }
}