package Items;
public class StrawberryItem implements Item {
    
    private int itemCount;

    @Override
    public int getItemCount() {
        return itemCount;
    }

    @Override
    public void setItemCount(int newAmount) {
        itemCount = newAmount;
    }
}
