public class LostItem extends Item {


    public LostItem(String id, String name, String description,
                    String location, String date, String reporter) {


        super(id, name, description, location, date, reporter, "Lost");
    }


    @Override
    public void displayInfo() {


        System.out.println("\nType: LOST ITEM");
        System.out.println("ID: " + getItemId());
        System.out.println("Name: " + getItemName());
        System.out.println("Description: " + getDescription());
        System.out.println("Location: " + getLocation());
        System.out.println("Date: " + getDate());
        System.out.println("Reported by: " + getReporterName());
        System.out.println("Status: " + getStatus());
    }
}
