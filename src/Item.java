public abstract class Item {


    private String itemId;
    private String itemName;
    private String description;
    private String location;
    private String date;
    private String reporterName;
    private String status;


    public Item(String itemId, String itemName, String description,
                String location, String date, String reporterName,
                String status) {


        this.itemId = itemId;
        this.itemName = itemName;
        this.description = description;
        this.location = location;
        this.date = date;
        this.reporterName = reporterName;
        this.status = status;
    }


    public String getItemId() {
        return itemId;
    }


    public String getItemName() {
        return itemName;
    }


    public String getDescription() {
        return description;
    }


    public String getLocation() {
        return location;
    }


    public String getDate() {
        return date;
    }


    public String getReporterName() {
        return reporterName;
    }


    public String getStatus() {
        return status;
    }


    public void setStatus(String status) {
        this.status = status;
    }


    public abstract void displayInfo();
}
