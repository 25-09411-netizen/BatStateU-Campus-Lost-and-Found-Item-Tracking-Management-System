
# BATSTATEU CAMPUS LOST AND FOUND ITEM TRACKING AND MANAGEMENT SYSTEM

A Java-Based Lost and Found Management System for Batangas State University.

---

## 1. Project Description

The BatStateU Campus Lost and Found Item Tracking and Management System is a Java-based application designed to help students and university personnel report, search, and manage lost and found items within the campus.

The system provides an organized way to record lost and found items, making it easier to search for items and check their current status.

---

## 2. Problem Being Addressed

Losing personal belongings inside the campus can be a problem for students and university personnel. Without an organized record, it can be difficult to search for lost items, check reported items, and know if an item has already been claimed.

This project aims to provide a simple system that helps organize and manage lost and found item records.

---

## 3. Project Objectives

### General Objective

To develop a Java-based application that will help manage and track lost and found items within Batangas State University.

### Specific Objectives

- To allow users to report lost and found items.
- To store and organize item information.
- To allow users to view and search item records.
- To help identify possible matches between lost and found items.
- To manage the status of reported items.
- To make the lost and found process more organized and convenient.

---

## 4. Target Users

The system is intended for:

- BatStateU Students
- Faculty Members
- University Staff
- Lost and Found Personnel

---

## 5. Main Features

- **Report Lost Item** – Allows users to enter information about an item they have lost.
- **Report Found Item** – Allows users to enter information about an item they have found.
- **View All Records** – Displays all lost and found item records stored in the system.
- **Search Item** – Allows users to search using an item ID, item name, or location.
- **Possible Matches** – Displays lost and found items that may match each other.
- **Claim Found Item** – Allows users to enter the item ID of a found item they want to claim.
- **Update Item Status** – Allows users to change the status of an item record.
- **Remove Item Record** – Allows users to remove an item record using its item ID.

---

## 6. Technologies Used

- **Java** – Main programming language used to develop the system.
- **Object-Oriented Programming (OOP)** – Used to organize the program into classes and objects.
- **ArrayList** – Used to store item records while the program is running.
- **Scanner** – Used to receive input from users.

---

## 7. Program Structure

The system is divided into five main classes. Each class has its own role and responsibilities.

### 7.1 Main Class (`Main.java`)

**Role:** Starts the application.

**Responsibilities:**

- Displays the starting screen of the system.
- Creates a `LostAndFoundSystem` object.
- Calls the method that starts the application.

**Relationship:**

- Uses the `LostAndFoundSystem` class to run the program.

### 7.2 LostAndFoundSystem Class (`LostAndFoundSystem.java`)

**Role:** Main controller of the system. It handles the main operations.

**Responsibilities:**

- Displays and manages the system menu.
- Adds lost and found item records.
- Displays all item records.
- Searches for specific items.
- Finds possible matches.
- Handles item claiming and status updates.
- Removes item records.

**Relationship:**

- Uses an `ArrayList` to store item records.
- Works with `LostItem` and `FoundItem` objects through the `Item` parent class.

### 7.3 Item Class (`Item.java`)

**Role:** Abstract parent class for lost and found items.

**Responsibilities:**

- Contains common information about an item.
- Uses private attributes to protect item information.
- Provides getter and setter methods.
- Declares the abstract `displayInfo()` method.

**Relationship:**

- Serves as the parent class of `LostItem` and `FoundItem`.

### 7.4 LostItem Class (`LostItem.java`)

**Role:** Represents items reported as lost.

**Responsibilities:**

- Uses the common information from the `Item` class.
- Provides its own version of the `displayInfo()` method.
- Represents records of missing items.

**Relationship:**

- Inherits from the `Item` class.

### 7.5 FoundItem Class (`FoundItem.java`)

**Role:** Represents items reported as found.

**Responsibilities:**

- Uses the common information from the `Item` class.
- Provides its own version of the `displayInfo()` method.
- Represents records of items found on campus.

**Relationship:**

- Inherits from the `Item` class.

---

## 8. OOP Concepts Demonstrated

The project uses the four main principles of Object-Oriented Programming: Encapsulation, Inheritance, Polymorphism, and Abstraction.

### 8.1 Encapsulation

**Code Used:** Private attributes and public getter and setter methods in `Item.java`.

**Example Code:**

```java
private String itemName;

public String getItemName() {
    return itemName;
}

public void setItemName(String itemName) {
    this.itemName = itemName;
}
```

**Explanation:**

The `private` keyword prevents other classes from directly accessing the `itemName` variable. The getter and setter methods allow other classes to access or update its value in a controlled way.

**Purpose in the System:**

It helps protect item information and keeps access to the item's data organized.

### 8.2 Inheritance

**Code Used:** The `extends` keyword in `LostItem.java` and `FoundItem.java`.

**Example Code:**

```java
public class LostItem extends Item {

}

public class FoundItem extends Item {

}
```

**Explanation:**

The `extends` keyword allows `LostItem` and `FoundItem` to inherit common attributes and methods from the `Item` parent class.

**Purpose in the System:**

It avoids repeating the same item information in different classes and makes the code easier to organize.

### 8.3 Polymorphism

**Code Used:** Method overriding of `displayInfo()` in `LostItem.java` and `FoundItem.java`.

**Example Code:**

```java
@Override
public void displayInfo() {
    // Displays item information
}
```

**Explanation:**

Both child classes use the same method name, but each class has its own way of displaying information.

**Purpose in the System:**

It allows the system to display different types of item information using the same method name.

### 8.4 Abstraction

**Code Used:** The `abstract` keyword in `Item.java`.

**Example Code:**

```java
public abstract class Item {
    public abstract void displayInfo();
}
```

**Explanation:**

The `Item` class is an abstract parent class. It provides a common structure for lost and found items. The abstract `displayInfo()` method requires the child classes to provide their own implementation.

**Purpose in the System:**

It provides a common structure for both lost and found items while allowing each child class to display its own information.

---

## 9. Instructions for Running the Program

- Make sure Java is installed on your computer.
- Download or clone the project repository from GitHub.
- Open the project folder using a Java IDE such as NetBeans, IntelliJ IDEA, or VS Code.
- Locate the `Main.java` file.
- Run the `Main.java` file to start the application.
- Follow the instructions displayed in the program.

---

## 10. Sample Screenshots

The following screenshots show the different features and functions of the system.

### 10.1 System Start / Main Menu

This screenshot shows the starting screen of the system. It displays the system title and the available menu options that users can choose from.

### 10.2 Report Item

This screenshot shows the form used to report a lost or found item. Users need to fill in the required information. A person who lost an item can report it as lost, while a person who found an item can report it as found.

### 10.3 View All Records

This screenshot displays all the lost and found item records stored in the system. Users can check the details of each reported item, including its item ID, name, location, and current status.

### 10.4 Search Item

This screenshot shows the search feature. The user can enter an item ID, item name, or location to find a specific record. For example, searching for "Phone" displays related lost and found item records.

### 10.5 Possible Matches

This screenshot displays possible matches between lost and found items. For example, if someone reports a lost phone and another person reports finding a phone, the system can show these records as possible matches for checking.

### 10.6 Claim Found Item

This screenshot shows the process of claiming a found item. The user is asked to enter the item ID of the found item they want to claim. After entering the item ID, the system changes the item's status to show that ownership is being verified.

### 10.7 Update Item Status

This screenshot shows how to update an item's status. The user enters the item ID of the record they want to update. For example, entering `ITEM-002` allows the user to change its status to `Claimed`. The system then updates the record.

### 10.8 Remove Item Record

This screenshot shows how to remove an item record from the system. The user enters the item ID of the record they want to remove. This helps keep the system's records organized.

### 10.9 Exit System

This screenshot shows the exit option. When the user selects this option, the program ends and the application closes.

---

## 11. Known Limitations

- The system is console-based and does not have a graphical user interface.
- Item records are stored using an `ArrayList`.
- Records are temporary and are not permanently saved after the program closes.
- The system is designed for basic lost and found record management.

---

## 12. Future Improvements

- Add a graphical user interface (GUI).
- Add permanent data storage using a database.
- Add user accounts and login features.
- Improve the search and matching functions.
- Add image uploads for lost and found items.

---

## 13. Team Members and Roles

| Team Member | Role |
|---|---|
| Garing Kristine Joy | Project Leader |
| Panganiban Kerk Daniel | Lead Programmer |
| Panganiban Jhanel | System / Design Lead |
| Viceral Jhayzel | Documentation Lead |

---

## 14. Project Contributors

This project was developed through the teamwork and contributions of all group members. Each member helped in planning, designing, programming, testing, and documenting the system.
