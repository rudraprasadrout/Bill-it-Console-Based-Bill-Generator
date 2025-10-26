# Bill-it: Console-Based Bill Generator #

🧾 Project Overview

Bill-it is a simple, command-line utility built in Java designed to simulate a retail point-of-sale (POS) system for generating accurate, itemized customer receipts. It demonstrates fundamental Java programming concepts including array manipulation, formatted output, iterative control flow, and robust user input validation using the java.util.Scanner class.

✨ Features

Predefined Inventory: Uses hardcoded arrays for a simple, fixed inventory of items and prices.

Single Menu Display: Displays the full product menu only once at the start for a clean user experience.

Interactive Selection: Allows the user to specify the number of items and then select each item by number.

Robust Input Validation: Utilizes try-catch and conditional loops to ensure user inputs for item choice, quantity, and number of items are valid integers and positive values, preventing runtime exceptions.

Automatic Calculation: Calculates line totals, subtotal, $8.00\%$ sales tax, and the final grand total.

Formatted Receipt: Prints a professional, aligned, itemized receipt using System.out.printf().

🛠️ Technologies Used

Language: Java

Environment: Console/Terminal

▶️ How to Run Locally

To compile and run this application on your local machine, ensure you have the Java Development Kit (JDK) installed.

Save the Code: Save the provided Java code into a file named BillGenerator.java.

Compile: Open your terminal or command prompt, navigate to the directory where you saved the file, and compile the code:

javac BillGenerator.java


Execute: Run the compiled class file:

java BillGenerator




🚀 Future Enhancements

Potential improvements for this project include:

Dynamic Inventory: Move item data from hardcoded arrays to an external file or a simple database (like SQLite or Firestore) for persistent and dynamic updates.

Refactoring: Convert the single main method into multiple classes (e.g., Inventory, Calculator) to implement stronger Object-Oriented Programming (OOP) principles.


Discounts: Implement conditional discount logic (e.g., "Buy One Get One Free" or percentage-based coupons).

