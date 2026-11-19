# 🎓 BatStateU Campus Lost and Found Item Tracking and Management System

> **A Java-Based Lost and Found Management System for Batangas State University.**

---

## 📋 Table of Contents
1. [Project Description](#-1-project-description)
2. [Problem Being Addressed](#-2-problem-being-addressed)
3. [Project Objectives](#-3-project-objectives)
4. [Target Users](#-4-target-users)
5. [Main Features](#-5-main-features)
6. [Technologies Used](#-6-technologies-used)
7. [Program Structure](#-7-program-structure)
8. [OOP Concepts Demonstrated](#-8-oop-concepts-demonstrated)
9. [Instructions for Running the Program](#-9-instructions-for-running-the-program)
10. [Sample Screenshots](#-10-sample-screenshots)
11. [Known Limitations](#-11-known-limitations)
12. [Future Improvements](#-12-future-improvements)
13. [Team Members and Roles](#-13-team-members-and-roles)
14. [Project Contributors](#-14-project-contributors)

---

## 📖 1. Project Description

The **BatStateU Campus Lost and Found Item Tracking and Management System** is a Java-based console application designed to help students and university personnel report, search, and manage lost and found items within the campus. 

The system provides an organized way to record lost and found items, making it easier for users to check item information, track statuses, and identify possible matches.

---

## ⚠️ 2. Problem Being Addressed

Losing personal belongings inside the campus is a common problem for students and university personnel. Without an organized record-keeping process, it is difficult to search for lost items, verify reported items, and know whether an item has already been claimed.

This project aims to provide a simple, structured system that helps organize and manage lost and found item records efficiently.

---

## 🎯 3. Project Objectives

### General Objective
To develop a Java-based application that will help manage and track lost and found items within Batangas State University.

### Specific Objectives
* To allow users to report lost and found items.
* To store and organize item information systematically.
* To allow users to view and search item records easily.
* To help identify possible matches between lost and found items.
* To manage and update the status of reported items.
* To make the campus lost and found process more organized and convenient.

---

## 👥 4. Target Users

The system is intended for:
* **BatStateU Students**
* **Faculty Members**
* **University Staff**
* **Lost and Found Personnel**

---

## ✨ 5. Main Features

* **Report Lost Item** – Allows users to enter and record information about an item they have lost.
* **Report Found Item** – Allows users to enter and record information about an item they have found on campus.
* **View All Records** – Displays all lost and found item records currently stored in the system.
* **Search Item** – Allows users to search for specific records using an Item ID, item name, or location.
* **Possible Matches** – Helps identify and display lost and found items that may match each other.
* **Claim Found Item** – Allows users to enter the Item ID of a found item they want to claim, flagging it for ownership verification.
* **Update Item Status** – Allows authorized users to change the status of an item record (e.g., *Claimed*).
* **Remove Item Record** – Allows an item record to be removed from the system using its Item ID to keep records organized.

---

## 🛠️ 6. Technologies Used

* **Java** – Main programming language used to develop the system.
* **Object-Oriented Programming (OOP)** – Used to structure and organize the program into modular classes and objects.
* **ArrayList** – Used to dynamically store item records while the program is running.
* **Scanner** – Used to receive and process user input from the console.

---

## 🏗️ 7. Program Structure

The system is divided into five main Java classes, each with its own specific role and responsibilities:

### 7.1 `Main.java` (Main Class)
* **Role:** Starts the application.
* **Responsibilities:**
  * Displays the system title and starting welcome screen.
  * Instantiates a `LostAndFoundSystem` object.
  * Calls the method that starts the main system loop.
* **Relationship:** Uses the `LostAndFoundSystem` class to run the application.

### 7.2 `LostAndFoundSystem.java` (System Controller Class)
* **Role:** Main controller of the system; handles all core operations.
* **Responsibilities:**
  * Displays and manages the main interactive menu.
  * Adds new lost and found item records.
  * Displays all stored item records.
  * Searches for specific items and finds possible matches.
  * Handles item claiming, status updates, and record removal.
* **Relationship:** Uses an `ArrayList<Item>` to store item records and interacts with `LostItem` and `FoundItem` objects polymorphically through the `Item` parent class.

### 7.3 `Item.java` (Abstract Parent Class)
* **Role:** Abstract parent class for all lost and found items.
* **Responsibilities:**
  * Contains common attributes and information about an item.
  * Uses `private` attributes to protect item data.
  * Provides public getter and setter methods.
  * Declares the abstract `displayInfo()` method.
* **Relationship:** Serves as the superclass for `LostItem` and `FoundItem`.

### 7.4 `LostItem.java` (Child Class)
* **Role:** Represents an item reported as lost.
* **Responsibilities:**
  * Inherits common item attributes and methods from `Item`.
  * Provides its own implementation of `displayInfo()`.
  * Identifies the record specifically as a missing/lost item.
* **Relationship:** Inherits from the `Item` class (`extends Item`).

### 7.5 `FoundItem.java` (Child Class)
* **Role:** Represents an item reported as found.
* **Responsibilities:**
  * Inherits common item attributes and methods from `Item`.
  * Provides its own implementation of `displayInfo()`.
  * Identifies the record specifically as a found item on campus.
* **Relationship:** Inherits from the `Item` class (`extends Item`).

---

## 🧩 8. OOP Concepts Demonstrated

This project applies the four core principles of Object-Oriented Programming:

### 8.1 Encapsulation
* **Code Used:** `private` attributes and `public` getter/setter methods in `Item.java`.
* **Example:**
  ```java
  private String itemName;

  public String getItemName() {
      return itemName;
  }

  public void setItemName(String itemName) {
      this.itemName = itemName;
  }
  ```
* **Explanation & Purpose:** The `private` keyword prevents other classes from directly modifying `itemName`. The getter and setter methods enforce controlled access, protecting item information and keeping data management organized.

### 8.2 Inheritance
* **Code Used:** The `extends` keyword in `LostItem.java` and `FoundItem.java`.
* **Example:**
  ```java
  public class LostItem extends Item {
      // Lost item details
  }

  public class FoundItem extends Item {
      // Found item details
  }
  ```
* **Explanation & Purpose:** Allows `LostItem` and `FoundItem` to inherit common attributes and methods from `Item`, avoiding code duplication and keeping the codebase clean.

### 8.3 Polymorphism
* **Code Used:** Method overriding (`@Override`) of `displayInfo()` in `LostItem.java` and `FoundItem.java`.
* **Example:**
  ```java
  @Override
  public void displayInfo() {
      // Displays specific lost or found item information
  }
  ```
* **Explanation & Purpose:** Both child classes share the same method signature (`displayInfo()`) but execute their own tailored output formats depending on whether the object is a lost or found item.

### 8.4 Abstraction
* **Code Used:** The `abstract` keyword in `Item.java`.
* **Example:**
  ```java
  public abstract class Item {
      public abstract void displayInfo();
  }
  ```
* **Explanation & Purpose:** `Item` serves as an abstract blueprint that cannot be instantiated directly. Defining `displayInfo()` as abstract enforces that all subclasses provide their own concrete implementation.

---

## 🚀 9. Instructions for Running the Program

1. **Install Java:** Make sure the Java Development Kit (JDK) is installed on your computer.
2. **Clone or Download:** Download the ZIP file or clone this repository from GitHub:
   ```bash
   git clone https://github.com/your-username/batstateu-lost-and-found.git
   ```
3. **Open in IDE:** Open the project folder using any Java IDE (e.g., NetBeans, IntelliJ IDEA, Eclipse, or VS Code).
4. **Locate Main File:** Navigate to the `src` folder and locate `Main.java`.
5. **Run Application:** Run `Main.java` to launch the console application and follow the on-screen menu prompts.

---

## 📸 10. Sample Screenshots

> *Note: Replace the image placeholders below with actual screenshot links from your repository (e.g., `![Main Menu](screenshots/menu.png)`).*

### 10.1 System Start / Main Menu
Displays the starting screen of the system, including the project title and available menu options (Report Item, View Records, Search, Possible Matches, Claim Item, Update Status, Remove Record, and Exit).
> `[Insert Screenshot: System Start / Main Menu]`

### 10.2 Report Item
Shows the input prompts used to report a lost or found item. Users fill in the required details (such as item name, description, and location) to log the record into the system.
> `[Insert Screenshot: Report Lost/Found Item]`

### 10.3 View All Records
Displays all lost and found item records currently stored in the system, showing each item's ID, name, location, and current status.
> `[Insert Screenshot: View All Records]`

### 10.4 Search Item
Allows users to search by Item ID, item name, or location. For example, searching `"Phone"` filters and displays all matching lost and found phone records.
> `[Insert Screenshot: Search Item]`

### 10.5 Possible Matches
Displays potential matches between lost and found reports based on item details (e.g., pairing a reported lost phone with a reported found phone for verification).
> `[Insert Screenshot: Possible Matches]`

### 10.6 Claim Found Item
Prompts the user to enter the Item ID of a found item they wish to claim, automatically updating its status to indicate that ownership verification is in progress.
> `[Insert Screenshot: Claim Found Item]`

### 10.7 Update Item Status
Allows updating a record's status via its Item ID (e.g., changing `ITEM-002` to **Claimed**) and saves the updated status in the list.
> `[Insert Screenshot: Update Item Status]`

### 10.8 Remove Item Record
Prompts for an Item ID to delete resolved or unnecessary records (such as matched items `ITEM-001` and `ITEM-002` after claiming) to keep the system organized.
> `[Insert Screenshot: Remove Item Record]`

### 10.9 Exit System
Displays the closing message when the user selects the exit option, safely terminating the application.
> `[Insert Screenshot: Exit System]`

---

## 🚧 11. Known Limitations

* **Console-Based Interface:** The application currently runs purely in the console and lacks a Graphical User Interface (GUI).
* **Temporary In-Memory Storage:** Item records are stored in an `ArrayList`, meaning all data is cleared once the program closes.
* **Basic Record Management:** Designed primarily for foundational tracking without advanced authentication or automated notifications.

---

## 🔮 12. Future Improvements

* **Graphical User Interface (GUI):** Develop a user-friendly desktop or web interface (e.g., JavaFX, Swing, or Spring Boot).
* **Persistent Database Storage:** Integrate a relational database (such as MySQL or PostgreSQL) to permanently save records.
* **User Authentication:** Add role-based login accounts for students, staff, and Lost & Found administrators.
* **Enhanced Search & Matching:** Implement keyword scoring, date filters, and category-based matching algorithms.
* **Image Uploads:** Allow users to attach photos of lost and found items for easier visual identification.

---

## 👨‍💻 13. Team Members and Roles

| Team Member | Role |
| :--- | :--- |
| **Garing, Kristine Joy** | Project Leader |
| **Panganiban, Kerk Daniel** | Lead Programmer |
| **Panganiban, Jhanel** | System / Design Lead |
| **Viceral, Jhayzel** | Documentation Lead |

---

## 🤝 14. Project Contributors

This project was developed through the collaborative effort and contributions of all group members. Each member actively participated in planning, system design, programming, testing, and documentation.