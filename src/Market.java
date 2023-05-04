import java.util.HashMap;
import java.util.List;

import edu.macalester.graphics.*;
import edu.macalester.graphics.ui.Button;

public class Market extends Location {

    private double balance;
    private GraphicsText balanceDisplay;
    private HashMap<Item, Button> itemButtons;
    private HashMap<Item, GraphicsText> itemDisplays;
    private List<Item> itemTypes;

    /**
     * Creates a market from location where you can sell your fruit for a profit and buy items to help
     * you grow more plants
     */

    public Market(CanvasWindow canvas, List<Item> itemList) {
        super("Market", 750, 540); // this is where we place the market label on the main screen
        itemDisplays = new HashMap<>();
        itemButtons = new HashMap<>();

        this.itemTypes = itemList;

        balance = 0;
        balanceDisplay = new GraphicsText("$" + balance, 740, 505);

        background = new Image(0, 0, "market.png");
        drawLocation();

        for (Item item : itemTypes) {
            itemButtons.put(item, new Button(item.getTitle() + ": " + item.getPrice()));
            add(itemButtons.get(item), 300 + itemTypes.indexOf(item) * 170, 125);
            GraphicsText display = new GraphicsText(" " + item.getItemCount(), 740, 530 + itemTypes.indexOf(item) * 25);
            add(display);
            itemDisplays.put(item, display);

        }
        add(balanceDisplay);
        sell(canvas);
    }

    /**
     * Takes an item out of inventory when you click to sell but adds money to total profit
     * 
     * keeps count of item inventory display, makes sure that if the button is clicked beyond the number
     * of items, the balance and inventory don't change
     */

    private void sell(CanvasWindow canvas) {
        for (Item item : itemTypes) {
            itemButtons.get(item).onClick(() -> {
                int itemCount = item.getItemCount();
                if (itemCount > 0) {
                    item.setItemCount(itemCount = itemCount - 1);
                    balance = balance + item.getPrice();
                }
                if (itemCount <= 0) {
                    item.setItemCount(0);
                }
                updateDisplay(item);
            });
        }
    }

    private void updateDisplay(Item item) {
        itemDisplays.get(item).setText(" " + item.getItemCount());
        balanceDisplay.setText("$" + balance);
    }

    public void updateItemTypes(List<Item> newList) {
        itemTypes = newList;
        for (Item item : itemTypes) {
            updateDisplay(item);
        }
    }

    public void resetGrowthStage() {
        
    }

}

