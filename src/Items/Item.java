package Items;
public abstract class Item {

    protected int itemCount;
    protected String title;
    public double price;

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
