# 📦 Java Inventory Management System

A Java-based inventory management system demonstrating **OOP**, **inheritance**, **file I/O**, and basic product management operations. This project showcases core Java skills used in real-world applications, including class hierarchies, data persistence, and object manipulation.

---

## ✨ Features

- Object-Oriented Design — Uses classes, inheritance, and polymorphism  
- Product Hierarchy — Electronics and FoodItem extend a base Product class  
- Inventory Manager — Add, update, and retrieve products  
- File Persistence — Saves and loads inventory from `inventory.txt`  
- Automatic Loading — Loads existing inventory on startup  
- Simple Demo Workflow — Adds sample products and updates quantities  

---

## 📁 Folder Structure

Java-Inventory-Management-System/

├── Product.java

├── Electronics.java

├── FoodItem.java

├── InventoryManager.java

├── FilePersistence.java

├── InventoryApp.java

└── inventory.txt


---

## 🚀 How to Run

### **Using jGRASP**
1. Place all `.java` files in the same folder  
2. Open the folder in jGRASP  
3. Compile `InventoryApp.java`  
4. Run the program  
5. `inventory.txt` will be created automatically if missing  

### **Using VS Code**
1. Open the **entire folder**  
2. Ensure Java extensions are installed  
3. Run `InventoryApp.java`  
4. Make sure `inventory.txt` is in the same directory  

---

## 🧠 How It Works

### **Load Inventory**
The program attempts to load existing data from `inventory.txt`.  
If the file doesn’t exist, it starts fresh.

### **Add Demo Products**
Two sample products are added:

- Laptop (Electronics)  
- Milk (FoodItem)

### **Update Quantity**
The quantity of the Laptop is updated.

### **Save Inventory**
All products are saved back into `inventory.txt`.

---

## 🔮 Future Improvements

- Interactive Console Menu  
- Prevent Duplicate Product IDs  
- Search and Filter Options  
- Sorting Algorithms  
- GUI Version  
- JSON or Database Storage  

---

## 📜 License

This project is open-source and free to use for learning and portfolio purposes.

