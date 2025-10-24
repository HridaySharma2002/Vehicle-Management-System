# 🚗 Vehicle Management System  

A **Java-based console application** demonstrating **Object-Oriented Programming (OOP)** principles through a simple yet extensible vehicle management simulation.  
This project models real-world vehicle types—such as bikes and electric cars—using abstraction, inheritance, encapsulation, interfaces, and polymorphism.  

---

## 📘 Table of Contents  
- [Overview](#overview)  
- [Features](#features)  
- [UML Class Structure](#uml-class-structure)  
- [File Structure](#file-structure)  
- [Technologies](#technologies)  
- [How to Run](#how-to-run)  
- [Example Code Snippet](#example-code-snippet)  
- [OOP Concepts Displayed](#oop-concepts-displayed)  
- [Future Improvements](#future-improvements)  
- [Author](#author)  
- [License](#license)  

---

## 🧩 Overview  

The **Vehicle Management System** is a **Java console application** that demonstrates key **OOP concepts** by managing different vehicle types.  
It serves as an excellent **educational project** or a **foundation for beginners** learning class hierarchies, abstraction, and interfaces in Java.

---

## ✨ Features  

- 🚘 **Add and manage multiple vehicle types** (Bike, ElectricCar, etc.)  
- 🔋 **Supports both conventional and electric vehicles**  
- 🧱 **Showcases inheritance, abstraction, and polymorphism**  
- 🧩 **Implements interfaces for modular design**  
- 🧠 **Uses abstract classes and method overriding effectively**  
- 🧹 **Simple, modular structure for easy maintenance and extension**

---

## 🧭 UML Class Structure  

```
               +---------------------+
               |      Vehicle        |  <-- Abstract Class
               +---------------------+
               | - brand: String     |
               | - model: String     |
               | - price: double     |
               +---------------------+
               | + displayInfo()     |
               +---------------------+
                         ^
                         |
             ----------------------------
             |                          |
      +--------------+        +----------------+
      |    Bike      |        |  ElectricCar   |
      +--------------+        +----------------+
      | - isManual   |        | - batteryCap   |
      |              |        | - range        |
      +--------------+        +----------------+
              |                        ^
              |                        |
      +----------------------+  +-------------------+
      | implements Vehicle   |  | implements        |
      |                      |  | ElectricVehicle,  |
      |                      |  | SmartFeatures     |
      +----------------------+  +-------------------+
```

---

## 📁 File Structure  

| File | Description |
|------|--------------|
| **Vehicle.java** | Abstract parent class representing a generic vehicle. Contains shared attributes and behaviors. |
| **Bike.java** | Subclass representing a manual or motorbike with overridden methods. |
| **ElectricVehicle.java** | Interface defining electric vehicle behaviors (charging, battery info). |
| **ElectricCar.java** | Subclass implementing both `ElectricVehicle` and `SmartFeatures`. Represents an advanced electric car. |
| **SmartFeatures.java** | Interface defining modern functionalities like `autoDrive()` or `enableGPS()`. |
| **Main.java** | Entry point demonstrating class interaction and polymorphism. |

---

## 🛠️ Technologies  

- **Language:** Java (JDK 17 or later)  
- **Paradigm:** Object-Oriented Programming (OOP)  
- **Tools:** IntelliJ IDEA, Eclipse, or VS Code  
- **Version Control:** Git & GitHub  

---

## 🚀 How to Run  

1. **Clone the repository**  
   ```bash
   git clone https://github.com/HridaySharma2002/Vehicle-Management-System.git
   ```
2. **Open the project** in your preferred Java IDE (IntelliJ, Eclipse, or VS Code).  
3. **Compile and run** `Main.java`.  
4. Observe console output demonstrating polymorphism and OOP interactions.

---

## 💻 Example Code Snippet  

```java
Vehicle car = new ElectricCar("Tesla", "Model S", 80000, 100);
Vehicle bike = new Bike("Royal Enfield", "Classic 350", 2500, true);

car.displayInfo();  // Displays electric car details
bike.displayInfo(); // Displays bike details
```

**Output:**
```
Vehicle: Tesla Model S
Price: 80000
Battery Capacity: 100 kWh
Smart Feature: Autopilot activated!

Vehicle: Royal Enfield Classic 350
Type: Manual Bike
Price: 2500
```

---

## 🧠 OOP Concepts Displayed  

| Concept | Implementation |
|----------|----------------|
| **Abstraction** | `Vehicle` serves as the base abstract class. |
| **Encapsulation** | Attributes are private with getters and setters. |
| **Inheritance** | `ElectricCar` and `Bike` extend `Vehicle`. |
| **Polymorphism** | `displayInfo()` behaves differently across subclasses. |
| **Interfaces** | `ElectricVehicle` and `SmartFeatures` define reusable contracts. |

---

## 🔮 Future Improvements  

- 💾 Implement persistent storage using files or databases.  
- 🖥️ Add GUI using **JavaFX** or **Swing** for better user experience.  
- 🔍 Introduce vehicle search and filter functionalities.  
- 🚚 Extend the system with additional types (e.g., **Truck**, **Bus**, **SUV**).  

---

## 👨‍💻 Author  

**Hriday Sharma**  
Software Engineering Graduate | Delhi, India  

📧 Email: [kshriday@gmail.com](mailto:kshriday@gmail.com)  
🌐 GitHub: [HridaySharma2002](https://github.com/HridaySharma2002)

---

## 📜 License  

This project currently **has no license specified**.  
For **academic and personal learning use only**.  
