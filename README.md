# Inventory & Logistics Management System (Java)

A console-based **Inventory and Logistics Management System** developed using **Java**, applying **Object-Oriented Programming (OOP)** concepts and the **Collections Framework**.

This project allows users to manage inventory items, place orders, track order history, and handle out-of-stock scenarios.

---

## 📌 Features

- Manage inventory items (Raw Materials & Finished Goods)
- View available stock
- Place orders
- Track placed orders (Order History)
- Automatic stock updates
- Custom exception handling for out-of-stock items
- Menu-driven console application

---

## 🛠️ Technologies Used

- Java
- OOP Concepts
  - Abstraction
  - Inheritance
  - Polymorphism
  - Encapsulation
- Java Collections (`ArrayList`)
- Exception Handling
- Git & GitHub

---

## 📂 Project Structure

Inventory-Logistics-Java
└── src
└── inventory
├── Item.java
├── RawMaterial.java
├── FinishedGoods.java
├── Supplier.java
├── Order.java
├── InventoryManager.java
├── OutOfStockException.java
└── MainApp.java


---

## ▶️ How to Run the Project

### Using Eclipse / IntelliJ / VS Code

1. Clone the repository:
   ```bash
   git clone https://github.com/yashwantchatti005/Inventory-Logistics-Java.git
Open the project in your IDE

Navigate to:

src/inventory/MainApp.java
Run MainApp.java as a Java Application

🧠 OOP Concepts Used
Concept	Implementation
Abstraction	Item abstract class
Inheritance	RawMaterial, FinishedGoods
Polymorphism	Overridden updateStock() method
Encapsulation	Private fields with getters
Exception Handling	OutOfStockException
Collections	ArrayList<Item>, ArrayList<Order>
📊 Sample Output
--- Inventory & Logistics Menu ---
1. View Inventory
2. Place Order
3. View Placed Orders
4. Exit
🚀 Future Enhancements
Database integration using JDBC & MySQL

GUI using JavaFX or Swing

Supplier–Item mapping

Delivery and shipment tracking

Invoice and billing generation

👨‍💻 Author
Yashwant Chatti
GitHub: https://github.com/yashwantchatti005

📄 License
This project is created for learning and academic purposes.


---

## 🟢 Push README to GitHub

After creating `README.md`, run:

```bash
git add README.md
git commit -m "Added README file"
git push
