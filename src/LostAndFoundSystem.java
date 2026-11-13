import java.util.ArrayList;
import java.util.Scanner;


public class LostAndFoundSystem {


    private ArrayList<Item> items = new ArrayList<>();
    private Scanner input;


    public LostAndFoundSystem(Scanner input) {
        this.input = input;
    }


    private String getRequiredInput(String message) {


        String value;


        do {
            System.out.print(message);
            value = input.nextLine().trim();


            if (value.isEmpty()) {
                System.out.println("Input cannot be empty. Please try again.");
            }


        } while (value.isEmpty());


        return value;
    }


    public void addItem(boolean isLost) {


        System.out.println("\n===== REPORT " +
                (isLost ? "LOST" : "FOUND") + " ITEM =====");


        String name = getRequiredInput("Enter item name: ");
        String description = getRequiredInput("Enter item description: ");
        String location = getRequiredInput("Enter location: ");
        String date = getRequiredInput("Enter date: ");
        String reporter = getRequiredInput("Enter your name: ");


        String id = String.format("ITEM-%03d", items.size() + 1);


        Item newItem;


        if (isLost) {
            newItem = new LostItem(id, name, description,
                    location, date, reporter);
        } else {
            newItem = new FoundItem(id, name, description,
                    location, date, reporter);
        }


        items.add(newItem);


        System.out.println("\nItem successfully recorded!");
        System.out.println("Your Item ID is: " + id);
    }


    public void displayAllItems() {


        System.out.println("\n===== ALL ITEM RECORDS =====");


        if (items.isEmpty()) {
            System.out.println("No item records found.");
            return;
        }


        for (Item item : items) {
            item.displayInfo();
            System.out.println("--------------------------------");
        }
    }


    public void searchItem() {


        String keyword = getRequiredInput(
                "\nEnter item ID, name, or location to search: ");


        boolean found = false;


        for (Item item : items) {


            if (item.getItemId().equalsIgnoreCase(keyword)
                    || item.getItemName().toLowerCase().contains(keyword.toLowerCase())
                    || item.getLocation().toLowerCase().contains(keyword.toLowerCase())) {


                item.displayInfo();
                found = true;
            }
        }


        if (!found) {
            System.out.println("No matching item found.");
        }
    }


    public void findPossibleMatches() {


        System.out.println("\n===== POSSIBLE ITEM MATCHES =====");


        boolean found = false;


        for (Item lost : items) {


            if (lost instanceof LostItem) {


                for (Item discovered : items) {


                    if (discovered instanceof FoundItem
                            && lost.getItemName().equalsIgnoreCase(
                                    discovered.getItemName())) {


                        System.out.println("\nPossible match found!");
                        System.out.println("Lost Item:");
                        lost.displayInfo();


                        System.out.println("\nFound Item:");
                        discovered.displayInfo();


                        found = true;
                    }
                }
            }
        }


        if (!found) {
            System.out.println("No possible matches found.");
        }
    }


    public void claimFoundItem() {


        String id = getRequiredInput("\nEnter the Found Item ID: ");


        for (Item item : items) {


            if (item.getItemId().equalsIgnoreCase(id)
                    && item instanceof FoundItem) {


                if (item.getStatus().equals("Found")) {
                    item.setStatus("Claim Pending Verification");


                    System.out.println(
                        "Claim request recorded. Ownership must be verified by authorized personnel."
                    );


                } else {
                    System.out.println("This item is not available for a new claim request.");
                }


                return;
            }
        }


        System.out.println("Found item ID not found.");
    }


    public void updateItemStatus() {


        String id = getRequiredInput("\nEnter Item ID: ");


        for (Item item : items) {


            if (item.getItemId().equalsIgnoreCase(id)) {


                System.out.println("Current Status: " + item.getStatus());
                System.out.println("1. Lost");
                System.out.println("2. Found");
                System.out.println("3. Claim Pending Verification");
                System.out.println("4. Claimed");


                int choice = readChoice("Choose new status: ", 1, 4);


                switch (choice) {
                    case 1:
                        item.setStatus("Lost");
                        break;


                    case 2:
                        item.setStatus("Found");
                        break;


                    case 3:
                        item.setStatus("Claim Pending Verification");
                        break;


                    case 4:
                        item.setStatus("Claimed");
                        break;
                }


                System.out.println("Item status successfully updated!");
                return;
            }
        }


        System.out.println("Item ID not found.");
    }


    public void removeItem() {


        String id = getRequiredInput("\nEnter Item ID to remove: ");


        for (int i = 0; i < items.size(); i++) {


            if (items.get(i).getItemId().equalsIgnoreCase(id)) {


                items.remove(i);
                System.out.println("Item record successfully removed!");
                return;
            }
        }


        System.out.println("Item ID not found.");
    }


    public int readChoice(String message, int min, int max) {


        while (true) {


            System.out.print(message);
            String value = input.nextLine().trim();


            try {
                int choice = Integer.parseInt(value);


                if (choice >= min && choice <= max) {
                    return choice;
                }


                System.out.println("Invalid choice. Please try again.");


            } catch (NumberFormatException e) {
                System.out.println("Please enter a number. Try again.");
            }
        }
    }
}
