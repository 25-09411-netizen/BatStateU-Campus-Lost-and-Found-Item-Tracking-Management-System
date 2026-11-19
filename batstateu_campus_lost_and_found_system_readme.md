# 🎒 BatStateU Campus Lost and Found Item Tracking and Management System

![Java](https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![OOP](https://img.shields.io/badge/Paradigm-OOP-blue?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Completed-success?style=for-the-badge)

## 📋 Project Description
The **BatStateU Campus Lost and Found Item Tracking and Management System** is a Java-based console application designed to help students and university personnel report, search, and manage lost and found items within the campus. The system provides a simple and structured way to record item details so users can easily track belongings and find possible matches.

---

## 🎯 Problem Being Addressed
Losing personal belongings inside the campus is a common challenge for students and university personnel. Without an organized record-keeping system, it becomes difficult to search for misplaced items, verify reported belongings, or determine whether an item has already been claimed. This project solves that problem by offering an organized, centralized console system to manage lost and found records efficiently.

---

## 🚀 Project Objectives

### General Objective
* To develop a Java-based application that manages and tracks lost and found items within **Batangas State University**.

### Specific Objectives
* To allow users to report lost and found items easily.
* To store and organize item information systematically.
* To allow users to view and search through existing item records.
* To help identify possible matches between lost and found item reports.
* To manage and update the status of reported items (e.g., Claimed/Unclaimed).
* To make the campus lost and found process more organized and convenient.

---

## 👥 Target Users
The system is intended for:
* **BatStateU Students**
* **Faculty Members**
* **University Staff**
* **Lost and Found Personnel**

---

## ✨ Main Features
* **Report Lost Item:** Allows users to record details about an item they have lost.
* **Report Found Item:** Allows users to log information about an item they have found on campus.
* **View All Items:** Displays a complete list of available lost and found records.
* **Search Items:** Enables users to search for a specific item using keywords.
* **Find Possible Matches:** Automatically helps identify potential matches between lost and found reports.
* **Claim Found Item:** Marks a found item record as claimed once returned to its owner.
* **Update Item Status:** Allows authorized users to modify the current status of an item.
* **Remove Item Record:** Deletes outdated or invalid item records from the system.

---

## 🛠️ Technologies Used
* **Java** – Core programming language.
* **Object-Oriented Programming (OOP)** – Used to structure the codebase cleanly into classes and objects.
* **`ArrayList`** – Dynamic data structure used to store item records during runtime.
* **`Scanner`** – Used to capture and process user input via the console.

---

## 🏗️ Program Structure
The system consists of **five (5) main Java classes**, each with a specific responsibility:

### 1. `Main.java`
* **Role:** Entry point of the application.
* **Responsibilities:** Displays the welcome message/system title, instantiates the `LostAndFoundSystem` object, and launches the program.
* **Relationship:** Uses `LostAndFoundSystem` to run the application.

### 2. `LostAndFoundSystem.java`
* **Role:** Main controller of the system.
* **Responsibilities:** Displays the interactive menu, handles adding/removing records, displays items, performs searches, matches lost/found items, and updates claim statuses.
* **Relationship:** Manages an `ArrayList<Item>` containing `LostItem` and `FoundItem` objects.

### 3. `Item.java`
* **Role:** Abstract parent class for all items.
* **Responsibilities:** Holds shared attributes (`private`), provides public getters and setters, and declares the abstract `displayInfo()` method.
* **Relationship:** Parent class inherited by `LostItem` and `FoundItem`.

### 4. `LostItem.java`
* **Role:** Represents a reported lost item.
* **Responsibilities:** Inherits common attributes from `Item`, identifies the record as a lost item, and overrides `displayInfo()`.
* **Relationship:** Child class extending `Item`.

### 5. `FoundItem.java`
* **Role:** Represents a reported found item.
* **Responsibilities:** Inherits common attributes from `Item`, identifies the record as a found item, and overrides `displayInfo()`.
* **Relationship:** Child class extending `Item`.

---

## 🧠 OOP Concepts Demonstrated
This project applies the four core pillars of Object-Oriented Programming:

### 1. Encapsulation
* **Implementation:** `private` attributes paired with `public` getter and setter methods in `Item.java`.
* **Purpose:** Protects item data from unauthorized direct access and ensures controlled data modification.
```java
private String itemName;

public String getItemName() { 
    return itemName; 
}

public void setItemName(String itemName) { 
    this.itemName = itemName; 
}
```

### 2. Inheritance
* **Implementation:** Using the `extends` keyword in `LostItem.java` and `FoundItem.java`.
* **Purpose:** Eliminates code duplication by allowing child classes to reuse attributes and methods from `Item.java`.
```java
public class LostItem extends Item { 
    // Lost item details 
}

public class FoundItem extends Item { 
    // Found item details 
}
```

### 3. Polymorphism
* **Implementation:** Method overriding (`@Override`) of `displayInfo()` in both `LostItem.java` and `FoundItem.java`.
* **Purpose:** Allows the system to call the same `displayInfo()` method on any `Item` object while outputting format-specific details depending on whether it is lost or found.
```java
@Override 
public void displayInfo() { 
    // Displays specific lost or found item information 
}
```

### 4. Abstraction
* **Implementation:** Using the `abstract` keyword for the `Item` class and its `displayInfo()` method.
* **Purpose:** Establishes a standardized blueprint for all item types while enforcing child classes to define their own display behavior.
```java
public abstract class Item { 
    public abstract void displayInfo(); 
}
```

---

## 💻 Instructions for Running the Program
1. Ensure **Java Development Kit (JDK)** is installed on your computer.
2. Download or clone this repository from GitHub:
   ```bash
   git clone https://github.com/your-username/batstateu-lost-and-found.git
   ```
3. Open the project folder in your preferred Java IDE (**NetBeans**, **IntelliJ IDEA**, **Eclipse**, or **VS Code**).
4. Locate and open the `Main.java` file.
5. Run `Main.java` and follow the on-screen console prompts.

---

## 📸 Sample Screenshots
> *Screenshots of the actual console menu, item reporting, and matching features will be added here.*

---

## ⚠️ Known Limitations
* **Console-Based Interface:** Currently runs purely in the command line without a Graphical User Interface (GUI).
* **Temporary Storage:** Item records are stored in memory using an `ArrayList`, meaning data resets once the application closes.
* **Basic Matching:** Designed primarily for straightforward text-based record tracking and matching.

---

## 🔮 Future Improvements
* [ ] Develop a user-friendly **Graphical User Interface (GUI)** using JavaFX or Swing.
* [ ] Integrate a relational **database (e.g., MySQL/SQLite)** for permanent data storage.
* [ ] Implement **user authentication** (Student/Admin login roles).
* [ ] Enhance search and matching algorithms (e.g., filtering by date, location, or category).
* [ ] Support **image uploads** for easier visual verification of items.

---

## 👨‍💻 Team Members and Roles

| Team Member | Role |
| :--- | :--- |
| **Garing, Kristine Joy** | Project Leader |
| **Panganiban, Kerk Daniel** | Lead Programmer |
| **Panganiban, Jhanel** | System / Design Lead |
| **Viceral, Jhayzel** | Documentation Lead |

### Project Contributors
This project was successfully developed through the collaborative effort of all group members—contributing across system planning, architecture design, Java programming, testing, and documentation.