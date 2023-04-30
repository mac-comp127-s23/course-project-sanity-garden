import java.awt.Font;

import edu.macalester.graphics.*;
import edu.macalester.graphics.ui.Button;

public class Market extends Location {

    private int berryInventory;
    // private int berrySeedCount;// are we interested in keeping count of seeds??
    // private int appleInventory;
    private double balance;
    private GraphicsText balanceDisplay;
    private Image strawberry;
    private Button berryButton;
    private GraphicsText appleText;
    private GraphicsText  berryDisplay;

    /**
     * Creates a market from location where you can sell your fruit for a profit and buy
     * items to help you grow (if we have time to implement that part)
     */

    public Market(CanvasWindow canvas) {
        super("Market", 750, 540); // this is where we place the market label on the main screen
        balance = 0;
        berryInventory = 20; //placeholder for Strawberry.howMany
        elements = new GraphicsGroup(0, 0);
        balanceDisplay = new GraphicsText("$" + balance, 740, 505); 
        // strawberry = new Image(300, 350, "strawberryBud.jpeg"); 
        berryButton = new Button("click to sell strawberry for $1.50");
        berryButton.setPosition(425, 125);
        berryDisplay = new GraphicsText(" " + berryInventory, 740, 530);
        elements.add(balanceDisplay);
        elements.add(berryDisplay);

        appleText = new GraphicsText("sell an apple for $2.00", 450, 50);
       
    
        elements.add(berryButton);
        background = new Image(0, 0, "market.png");
        drawLocation();
        sell(canvas);
    }

   /**
     * Takes a strawberry out of inventory when you click to sell
     * but adds money to total profit
     */

    private void sell(CanvasWindow canvas) {
        berryButton.onClick(() -> {
                updateBerryDisplay();
        });
        // if (appleInventory){
        // balance = balance + 5;
        // }
    }
/**
 * keeps count of berry inventory display, makes sure that if the button is clicked beyond the number of berries, the 
 * balance and inventory don't change
 */
    private void updateBerryDisplay(){
        if (berryInventory > 0){
            berryInventory--;
            balance = balance + 1.5;
            berryDisplay.setText(" " + berryInventory);
            balanceDisplay.setText("$" + balance);
        }
        if (berryInventory <= 0){
            berryInventory = 0;
            berryDisplay.setText("0");
            balanceDisplay.setText("" + balance);
        }
    }




    // private void buySeeds(){
    // if (strawberry){
    // balance = balance + 1.5;
    // invetory
    // }
    // if (apple){
    // balance = balance + 5;
    // }
    // }

}

