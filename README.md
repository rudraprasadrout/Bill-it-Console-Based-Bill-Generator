# 🧾 Bill-it: Console-Based Bill Generator

[![Language](https://img.shields.io/badge/Language-Java-orange.svg)](https://www.java.com/)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)

### 📖 Project Overview
**Bill-it** is a lightweight, command-line utility built in Java designed to simulate a retail point-of-sale (POS) system. It generates accurate, itemized customer receipts while demonstrating fundamental Java programming concepts such as array manipulation, formatted output, and robust input validation.

---

### ✨ Features
* **Predefined Inventory:** Uses hardcoded arrays for a simple, fixed inventory of items and prices.
* **Clean UI:** Displays the full product menu only once at the start for a streamlined user experience.
* **Interactive Selection:** Allows users to specify the number of items and select products by index.
* **Robust Input Validation:** Utilizes `try-catch` blocks and conditional loops to ensure all inputs (choice, quantity, total items) are valid positive integers.
* **Automatic Calculation:** Handles line totals, subtotal, 8% sales tax, and the final grand total.
* **Formatted Receipt:** Generates a professional, aligned, itemized receipt using `System.out.printf()`.

---

### 🛠️ Technologies Used
* **Language:** Java (JDK 8+)
* **Environment:** Console/Terminal
* **Core Classes:** `java.util.Scanner`

---

### ▶️ How to Run Locally
Ensure you have the **Java Development Kit (JDK)** installed on your machine.

1.  **Save the Code:** Save the provided Java code into a file named `BillGenerator.java`.
2.  **Compile:** Open your terminal, navigate to the directory, and run:
    ```bash
    javac BillGenerator.java
    ```
3.  **Execute:** Run the compiled class:
    ```bash
    java BillGenerator
    ```

---

### 🖥️ Example Usage
The program guides you through a purchase session like this:
1. View the Item Menu.
2. Input the number of unique items to buy.
3. Input the Item Number and Quantity for each.
4. Receive a formatted, itemized bill.

    <img width="442" height="772" alt="image" src="https://github.com/user-attachments/assets/66b54cb6-0869-4e0c-bbb8-7f00e4adc955" />


---

### 🚀 Future Enhancements
* **Dynamic Inventory:** Move item data from arrays to external files (JSON/CSV) or a database like SQLite for persistence.
* **OOP Refactoring:** Convert the single main method into modular classes (e.g., `Inventory`, `Calculator`, `Receipt`) for better design.
* **Discount Logic:** Implement "Buy One Get One" or percentage-based coupon systems.

---
*Developed as part of my Java Programming Portfolio.*
