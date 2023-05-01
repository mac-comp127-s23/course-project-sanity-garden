import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import edu.macalester.graphics.*;
import edu.macalester.graphics.ui.Button;

public class Market extends Location {

    private double balance;
    private GraphicsText balanceDisplay;
    private Item strawberries;
    private Item apples;
    private List<Item> itemTypes;
    private HashMap<Item, Button> itemButtons;
    private HashMap<Item, GraphicsText> itemDisplays;

    /**
     * Creates a market from location where you can sell your fruit for a profit and buy
     * items to help you grow (if we have time to implement that part)
     */

    public Market(CanvasWindow canvas) {
        super("Market", 750, 540); // this is where we place the market label on the main screen
        itemTypes = new ArrayList<>();
        itemDisplays = new HashMap<>();
        itemButtons = new HashMap<>();

        strawberries = new Item("Strawbery", 1.5, 20);
        itemTypes.add(strawberries);

        apples = new Item("Apple", 2, 15);
        itemTypes.add(apples);

        balance = 0;
        balanceDisplay = new GraphicsText("$" + balance, 740, 505); 
    
        background = new Image(0, 0, "market.png");
        drawLocation();

        for (Item item : itemTypes) {
            itemButtons.put(item, new Button(item.getTitle() + ": " + item.getPrice()));
            add(itemButtons.get(item), 425 + itemTypes.indexOf(item)*150, 125);
            GraphicsText display = new GraphicsText(" " + item.getItemCount(), 740, 530 + itemTypes.indexOf(item)*25);
            add(display);
            itemDisplays.put(item, display);
            
        }
        add(balanceDisplay);
        sell(canvas);
    }

   /**
     * Takes a strawberry out of inventory when you click to sell
     * but adds money to total profit
     */

    private void sell(CanvasWindow canvas) {
        for (Item item : itemTypes) { 
            itemButtons.get(item).onClick(() -> {
                    updateDisplay(item);
            });
        }
    }
    /**
     * keeps count of berry inventory display, makes sure that if the button is clicked beyond the number of berries, the 
     * balance and inventory don't change
     */
    private void updateDisplay(Item item){
        int itemCount = item.getItemCount();
        if (itemCount > 0){
            item.setItemCount(itemCount = itemCount - 1);
            balance = balance + item.getPrice();
            itemDisplays.get(item).setText(" " + itemCount);
            balanceDisplay.setText("$" + balance);
        }
        if (itemCount <= 0){
            item.setItemCount(0);
            itemDisplays.get(item).setText("0");
            balanceDisplay.setText("" + balance);
        }
    }

}

