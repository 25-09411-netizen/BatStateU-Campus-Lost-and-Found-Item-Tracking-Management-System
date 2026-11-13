import java.util.Scanner;


public class Main {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        LostAndFoundSystem system = new LostAndFoundSystem(input);


        int choice;


        do {


            System.out.println("\n========================================");
            System.out.println(" BATSTATEU CAMPUS LOST AND FOUND SYSTEM");
            System.out.println("========================================");
            System.out.println("1. Report Lost Item");
            System.out.println("2. Report Found Item");
            System.out.println("3. View All Items");
            System.out.println("4. Search Item");
            System.out.println("5. Find Possible Matches");
            System.out.println("6. Claim Found Item");
            System.out.println("7. Update Item Status");
            System.out.println("8. Remove Item Record");
            System.out.println("9. Exit");
            System.out.println("========================================");


            choice = system.readChoice("Enter your choice: ", 1, 9);


            switch (choice) {


                case 1:
                    system.addItem(true);
                    break;


                case 2:
                    system.addItem(false);
                    break;


                case 3:
                    system.displayAllItems();
                    break;


                case 4:
                    system.searchItem();
                    break;


                case 5:
                    system.findPossibleMatches();
                    break;


                case 6:
                    system.claimFoundItem();
                    break;


                case 7:
                    system.updateItemStatus();
                    break;


                case 8:
                    system.removeItem();
                    break;


                case 9:
                    System.out.println("Thank you for using the system!");
                    break;
            }


        } while (choice != 9);


        input.close();
    }
}
