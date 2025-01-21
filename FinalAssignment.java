package pkgfinal; // Define package for organization

import java.util.Scanner; // Import Scanner for user input
import java.io.File; // Import File to handle file reading

public class Final { // Main class declaration
    
    /*
Brennan Ho 781493
Date: January 21 2025
Course: Grade 10 Comp Sci
Title: Credit Card Assignment 
Description:determines the balance of diffrent credit cards
VARIABLE DICTIONARY: 
 	filePath (String): Stores the file path to the ledger file containing customer data.
	customerCount (int): Tracks the total number of customers processed from the file.
	totalBalance (double): Accumulates the sum of all final balances for calculating the average balance.
	maxBalance (double): Tracks the highest final balance among all customers.
	minBalance (double): Tracks the lowest final balance among all customers.
	accountWithMaxBalance (String): Stores the account ID of the customer with the highest final balance.
	accountWithMinBalance (String): Stores the account ID of the customer with the lowest final balance.
	ledgerFile (File): Represents the ledger file as a File object for reading customer data.
	fileReader (Scanner): Reads the content of the ledger file line by line.
	record (String): Stores the current line being read from the ledger file.
	recordScanner (Scanner): Parses the individual data fields (account ID, balances, etc.) from a line in the file.
	accountID (String): Stores the unique identifier of the customer account.
	startingBalance (double): Represents the initial balance of the customer’s account before transactions.
	totalPurchases (double): Represents the total amount of purchases made by the customer.
	totalPayments (double): Represents the total amount of payments made by the customer.
	finalBalance (double): Stores the computed final balance for the customer after transactions.
	averageBalance (double): Stores the average final balance calculated for all customers.
	ex (Exception): Catches and stores exceptions that occur during file reading or line processing.
    */
    
// Function to compute the updated balance
    public static double computeUpdatedBalance(double startingBalance, double totalPurchases, double totalPayments) {
        // Calculate the updated balance
        return (startingBalance - totalPayments) + totalPurchases;
    }

    public static void main(String[] args) { // Entry point of the program
        String filePath = "C:\\Users\\781493\\OneDrive - Peel District School Board\\Documents\\NetBeansProjects\\Final\\src\\pkgfinal\\ledger.dat";
        // File path pointing to the ledger file

        // Variables for customer statistics
        int customerCount = 0; // Tracks number of customers processed
        double totalBalance = 0; // Cumulative sum of all final balances
        double maxBalance = Double.MIN_VALUE; // Tracks the highest balance
        double minBalance = Double.MAX_VALUE; // Tracks the lowest balance
        String accountWithMaxBalance = ""; // Stores account number with the highest balance
        String accountWithMinBalance = ""; // Stores account number with the lowest balance

        // Create a file object for the ledger
        File ledgerFile = new File(filePath); // Create a file object for the specified path

        // Try to read the file and process its content
        try (Scanner fileReader = new Scanner(ledgerFile)) { // Scanner for file reading
            while (fileReader.hasNextLine()) { // Loop through each line in the file
                String record = fileReader.nextLine(); // Read the current line

                try (Scanner recordScanner = new Scanner(record)) { // Scanner for processing individual record
                    recordScanner.useDelimiter("\\s+"); // Define delimiter as whitespace

                    // Parse account details
                    String accountID = recordScanner.next().trim(); // Read account ID
                    double openingBalance = recordScanner.nextDouble(); // Read initial balance
                    double purchases = recordScanner.nextDouble(); // Read total purchases
                    double payments = recordScanner.nextDouble(); // Read total payments

                    // Calculate the final balance
                    double finalBalance = computeUpdatedBalance(openingBalance, purchases, payments);

                    // Update cumulative statistics
                    totalBalance += finalBalance; // Add to total balance
                    customerCount++; // Increment the customer counter

                    // Check for new highest or lowest balance
                    if (finalBalance > maxBalance) { // If the balance is the new maximum
                        maxBalance = finalBalance; // Update max balance
                        accountWithMaxBalance = accountID; // Update corresponding account ID
                    }
                    if (finalBalance < minBalance) { // If the balance is the new minimum
                        minBalance = finalBalance; // Update min balance
                        accountWithMinBalance = accountID; // Update corresponding account ID
                    }

                    // Display account details
                    System.out.printf("Account: %s | Final Balance: %.2f\n", accountID, finalBalance);
                } catch (Exception ex) { // Handle errors in processing a single record
                    System.out.println("Error processing record: " + record); // Print error details
                }
            }

            // If customers were processed, calculate and display summary
            if (customerCount > 0) {
                double averageBalance = totalBalance / customerCount; // Calculate average balance
                System.out.printf("\nAverage Balance: %.2f\n", averageBalance); // Display average balance
                System.out.printf("Account with Highest Balance: %s | Final Balance: %.2f\n", accountWithMaxBalance, maxBalance); // Display account with highest balance
                System.out.printf("Account with Lowest Balance: %s | Final Balance: %.2f\n", accountWithMinBalance, minBalance); // Display account with lowest balance
            } else { // No valid customer data found
                System.out.println("No valid data found in the file.");
            }

        } catch (Exception ex) { // Handle file reading errors
            System.out.println("An error occurred while reading the file: " + ex.getMessage()); // Display error message
        }
    }
}
