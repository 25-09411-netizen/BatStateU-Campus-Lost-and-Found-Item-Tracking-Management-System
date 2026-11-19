#BATSTATEU CAMPUS LOST AND FOUND ITEM TRACKING AND MANAGEMENT SYSTEM
Project Description
The BatStateU Campus Lost and Found Item Tracking and Management System is a Java-based application designed to help students and university personnel report, search, and manage lost and found items within the campus.
The system provides a simple way to record lost and found items so users can easily check item information and find possible matches.
Problem Being Addressed
Losing personal belongings inside the campus can be a problem for students and university personnel. Without an organized record, it can be difficult to search for lost items, check reported items, and know whether an item has already been claimed.
This project aims to provide a simple system that helps organize and manage lost and found item records.
Project Objectives
General Objective
To develop a Java-based application that will help manage and track lost and found items within Batangas State University.
Specific Objectives
To allow users to report lost and found items.
To store and organize item information.
To allow users to view and search item records.
To help identify possible matches between lost and found items.
To manage the status of reported items.
To make the lost and found process more organized and convenient.
Target Users
The system is intended for:
BatStateU students
Faculty members
University staff
Lost and Found personnel
Main Features
Report Lost Item – Allows users to record information about an item they have lost.
Report Found Item – Allows users to record information about an item they have found.
View All Items – Displays the available lost and found records.
Search Items – Allows users to search for a specific item.
Find Possible Matches – Helps identify possible matches between lost and found item reports.
Claim Found Item – Allows a found item record to be marked as claimed.
Update Item Status – Allows the status of an item to be changed.
Remove Item Record – Allows an item record to be removed from the system.
Technologies Used
Java – Main programming language.
Object-Oriented Programming (OOP) – Used to organize the program into classes and objects.
ArrayList – Used to store item records while the program is running.
Scanner – Used to receive user input.
Program Structure
The system is made up of five main Java classes. Each class has its own responsibility.
1. Main Class (Main.java)
Role: Starts the application.
Responsibilities:
Displays the system title or welcome message.
Creates a LostAndFoundSystem object.
Calls the method that starts the system.
Relationship:
Uses the LostAndFoundSystem class to run the application.
2. LostAndFoundSystem Class (LostAndFoundSystem.java)
Role: Main controller of the system. Handles the main operations.
Responsibilities:
Displays and manages the system menu.
Adds lost and found item records.
Displays all item records.
Searches for items.
Finds possible matches.
Handles item claiming and status updates.
Removes item records.
Relationship:
Uses an ArrayList<Item> to store item records.
Works with LostItem and FoundItem objects through the parent Item class.
3. Item Class (Item.java)
Role: Abstract parent class for lost and found items.
Responsibilities:
Contains common information about an item.
Keeps item information in private attributes.
Provides getter and setter methods.
Declares the abstract displayInfo() method.
Relationship:
Serves as the parent class of LostItem and FoundItem.
4. LostItem Class (LostItem.java)
Role: Represents an item reported as lost.
Responsibilities:
Uses the common information from the Item class.
Provides its own implementation of displayInfo().
Identifies the record as a lost item.
Relationship:
Inherits from the Item class.
5. FoundItem Class (FoundItem.java)
Role: Represents an item reported as found.
Responsibilities:
Uses the common information from the Item class.
Provides its own implementation of displayInfo().
Identifies the record as a found item.
Relationship:
Inherits from the Item class.
OOP Concepts Demonstrated
The project uses the four main principles of Object-Oriented Programming: Encapsulation, Inheritance, Polymorphism, and Abstraction.
1. Encapsulation
Code used: Private attributes and public getter and setter methods in Item.java.
Example:
private String itemName; public String getItemName() { return itemName; } public void setItemName(String itemName) { this.itemName = itemName; }
Explanation:
The private keyword prevents other classes from directly accessing the itemName variable. The getter and setter methods allow other classes to access or update its value in a controlled way.
Purpose in the system:
It helps protect item information and keeps access to the item's data organized.
2. Inheritance
Code used: The extends keyword in LostItem.java and FoundItem.java.
Example:
public class LostItem extends Item { // Lost item details } public class FoundItem extends Item { // Found item details }
Explanation:
The extends keyword allows LostItem and FoundItem to inherit the common attributes and methods from the Item parent class.
Purpose in the system:
It avoids repeating the same item information in different classes and makes the code easier to organize.
3. Polymorphism
Code used: Method overriding of displayInfo() in LostItem.java and FoundItem.java.
Example:
@Override public void displayInfo() { // Displays lost item information }
The FoundItem class also has its own version of displayInfo().
Explanation:
Both child classes use the same method name, but each class has its own way of displaying information.
Purpose in the system:
It allows the system to display different item information using the same method name.
4. Abstraction
Code used: The abstract keyword in Item.java.
Example:
public abstract class Item { public abstract void displayInfo(); }
Explanation:
The Item class is an abstract class. It provides the common structure for lost and found items. The abstract displayInfo() method requires the child classes to provide their own implementation.
Purpose in the system:
It provides a common structure for both lost and found items while allowing each child class to display its own information.
Instructions for Running the Program
Make sure Java is installed on your computer.
Download or clone the project repository from GitHub.
Open the project folder using a Java IDE, such as NetBeans, IntelliJ IDEA, or VS Code.
Locate the Main.java file.
Run the Main.java file to start the application.
Follow the instructions displayed in the program.
Sample Screenshots
Screenshots of the actual program will be added here.
These screenshots will show the system menu and examples of its main features.
Known Limitations
The system is currently console-based and does not have a graphical user interface.
Item records are stored using an ArrayList.
Records are temporary and may not remain available after the program is closed.
The system is designed for basic lost and found record management.
Future Improvements
Add a graphical user interface (GUI).
Add permanent data storage using a database.
Add user accounts and login features.
Improve the search and matching functions.
Add image uploads for lost and found items.
Team Members and Roles
Team MemberRoleGaring Kristine JoyProject LeaderPanganiban Kerk DanielLead ProgrammerPanganiban JhanelSystem / Design LeadViceral JhayzelDocumentation Lead
Project Contributors
This project was developed through the teamwork and contributions of all group members.
Each member helped in planning, designing, programming, testing, and documenting the system.

You, 2 min
Ano gagawen ko

KERK DANIEL PANGANIBAN, 2 min
Lalagay sa readme.md

Tas

Buburahin mo ung sample screen shot

Then ito ipalit mo
