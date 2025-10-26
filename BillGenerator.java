import java.util.InputMismatchException;
import java.util.Scanner;

public class BillGenerator {
    public static void main(String[] args) {
        // Initialize Scanner for reading user input
        Scanner scanner = new Scanner(System.in);

        // Predefined item list and prices (Inventory Data Structure)
        String[] availableItems = {"Apples", "Milk", "Bread", "Eggs", "Rice", "Sugar", "Butter", "Juice"};
        double[] prices = {2.5, 3.2, 1.5, 0.5, 4.0, 2.0, 5.0, 3.8};

        // Display application header
        System.out.println("====================================================");
        System.out.println("          Bill-it your personal BILL GENERATOR      ");
        System.out.println("====================================================");
        System.out.println("Welcome! Please select items from the menu below.");
        System.out.println("----------------------------------------------------");

        // ---  Display the full menu ONCE before the selection loop ---
        System.out.println("Available Items:");
        System.out.println("----------------------------------------------------");
        for (int j = 0; j < availableItems.length; j++) {
            // Use printf for clean, aligned output
            System.out.printf("%2d. %-10s | $%.2f%n", (j + 1), availableItems[j], prices[j]);
        }
        System.out.println("----------------------------------------------------");
        // -----------------------------------------------------------------------------

        int n = 0;
        boolean validInput = false;

        // Input validation loop for the number of different items (n)
        while (!validInput) {
            System.out.print("Enter number of different items you want to purchase: ");
            try {
                if (scanner.hasNextInt()) {
                    n = scanner.nextInt();
                    if (n > 0) {
                        validInput = true;
                    } else {
                        System.out.println("Invalid input! Please enter a number greater than zero.");
                    }
                } else {
                    System.out.println("Invalid input! Please enter a whole number.");
                    scanner.next(); // Consume invalid input
                }
            } catch (InputMismatchException e) {
                 // Fallback for robustness
                 System.out.println("Invalid input! Please enter a whole number.");
                 scanner.next(); // Consume invalid input
            }
        }
        
        // Consume newline character left by nextInt()
        scanner.nextLine();

        // Arrays to store chosen items' details
        String[] itemNames = new String[n];
        double[] itemPrices = new double[n];
        int[] itemQuantities = new int[n];

        // Item selection loop (Iterates 'n' times for 'n' different items)
        for (int i = 0; i < n; i++) {
            int choice = -1;
            int quantity = -1;
            
            System.out.println("\n--- Selecting Item " + (i + 1) + " of " + n + " ---");
            
            // Input validation loop for item choice
            validInput = false;
            while (!validInput) {
                System.out.print("Select item " + (i + 1) + " (Enter item number 1-" + availableItems.length + "): ");
                try {
                    if (scanner.hasNextInt()) {
                        choice = scanner.nextInt();
                        if (choice >= 1 && choice <= availableItems.length) {
                            validInput = true;
                        } else {
                            System.out.println("Invalid choice! Please enter a number between 1 and " + availableItems.length + ".");
                        }
                    } else {
                        System.out.println("Invalid choice! Please enter a whole number.");
                        scanner.next(); // Consume invalid input
                    }
                } catch (Exception e) {
                    System.out.println("An error occurred during selection. Please try again.");
                    scanner.next();
                }
            }
            
            // Consume the newline after choice input
            scanner.nextLine(); 

            // Map user choice to inventory data
            itemNames[i] = availableItems[choice - 1];
            itemPrices[i] = prices[choice - 1];

            // Input validation loop for quantity
            validInput = false;
            while (!validInput) {
                System.out.print("Enter quantity for " + itemNames[i] + ": ");
                 try {
                    if (scanner.hasNextInt()) {
                        quantity = scanner.nextInt();
                        if (quantity > 0) {
                            validInput = true;
                        } else {
                            System.out.println("Invalid quantity! Quantity must be greater than zero.");
                        }
                    } else {
                        System.out.println("Invalid quantity! Please enter a whole number.");
                        scanner.next(); // Consume invalid input
                    }
                } catch (Exception e) {
                    System.out.println("An error occurred during quantity input. Please try again.");
                    scanner.next();
                }
            }
            // Consume the newline after quantity input
            scanner.nextLine(); 
            
            itemQuantities[i] = quantity;
        }

        // Calculation Phase
        double subtotal = 0;
        for (int i = 0; i < n; i++) {
            subtotal += itemPrices[i] * itemQuantities[i];
        }

        double taxRate = 0.08;
        double tax = subtotal * taxRate;
        double total = subtotal + tax;

        // Display final bill (Output Phase)
        System.out.println("\n\n====================================================");
        System.out.println("              CUSTOMER BILL RECEIPT                 ");
        System.out.println("====================================================");
        System.out.printf("%-15s %-10s %-10s %-10s%n", "Item", "Price", "Qty", "Total");
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < n; i++) {
            double lineTotal = itemPrices[i] * itemQuantities[i];
            System.out.printf("%-15s %-10.2f %-10d %-10.2f%n", itemNames[i], itemPrices[i], itemQuantities[i], lineTotal);
        }

        System.out.println("----------------------------------------------------");
        // Format subtotal and totals to two decimal places
        System.out.printf("%-25s : $%.2f%n", "Subtotal", subtotal);
        System.out.printf("%-25s : $%.2f%n", "Tax (8.00%)", tax);
        System.out.println("----------------------------------------------------");
        System.out.printf("%-25s : $%.2f%n", "Grand Total", total);
        System.out.println("====================================================");
        System.out.println("Thank you for shopping with us!");
        System.out.println("====================================================");

        // Resource cleanup
        scanner.close();
    }
}
