public class Item {
    private int itemCount;
    private String title;
    private double price;

    /**
     * Creates an overall item clas that keeps track of how many of each fruit the player has
     */

    public Item(String title, double price, int itemCount) {
        this.price = price;
        this.title = title;
        this.itemCount = itemCount;
    }

    public int getItemCount() {
        return itemCount;
    }

    public void setItemCount(int newAmount) {
        itemCount = newAmount;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

}
