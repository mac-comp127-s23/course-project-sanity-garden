import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import edu.macalester.graphics.*;

public class Garden {

    private CanvasWindow canvas;
    private GraphicsGroup buttons;
    private List<Location> locations;
    private StrawberryPatch straw;
    private AppleOrchard apple;
    private Market market;
    private World world;
    private Item strawberries;
    private Item apples;
    private List<Item> itemList;
    private HashMap<Location, Item> itemLocations;
;
    /**
     * Authors: Chris Lohmeier, Emma Nguyen and Lola Vescovo Comp 127 Final Project
     * Acknwoledgements: Abby Marsh, Nicole Branch, Nurain Jiwani and Timothy Lang
     */

    /**
     * Creates a garden where you can click on locations and plant and sell various foods.
     */

    public Garden() {
        canvas = new CanvasWindow("Sanity Garden", 900, 600); // Standard screen height for now
        world = new World();


        itemList = new ArrayList<>();

        strawberries = new Item("Strawberry", 1.5, 0);
        itemList.add(strawberries);

        apples = new Item("Apple", 2, 0);
        itemList.add(apples);

        straw = new StrawberryPatch(canvas);
        apple = new AppleOrchard(canvas);
        market = new Market(canvas, itemList);
        locations = new ArrayList<Location>();
        locations.add(market);
        locations.add(apple);
        locations.add(straw);

        itemLocations = new HashMap<Location, Item>();
        itemLocations.put(apple, apples);
        itemLocations.put(straw, strawberries);

        buttons = new GraphicsGroup();
        buttons.add(straw.getLabelButton());
        buttons.add(market.getLabelButton());
        buttons.add(apple.getLabelButton());

        drawWorld();
    }

    private void drawWorld() {
        canvas.add(world.getWorldImage());
        canvas.add(buttons);
    }

    /**
     * creates the main world with the locations placed and click-able.
     */

    private void run() {
        canvas.animate(() -> {
            checkAdditionalItems();
        });
        for (Location location : locations) {
            location.getLabelButton().onClick(() -> {
                canvas.removeAll();
                canvas.add(location);
                checkExit(location);
            });
        }
    }

    /**
     * Allows the user to click on an exit box in the current location and update the canvas
     * back to the world map
     */

    private void checkExit(Location location) {
        location.getExitButton().onClick(() -> {
                canvas.removeAll();
                drawWorld();
                location.resetGrowthStage();
            
        });
    }

    /**
     * checks to see if there are new fruits in each location that produces an item
     */
    private void checkAdditionalItems() {
        for (Location location : itemLocations.keySet()) {
            if (location.getAdditionalItem()) {
                updateItems(1, itemLocations.get(location));
                location.setAdditionalItem(false);
            }
        }
    }

    /**
     * updates the number of items (fruits) based on what the player has grown
     */

    private void updateItems(int newCount, Item item) {
        item.setItemCount(item.getItemCount() + newCount);
        market.updateItemTypes(itemList);
    }

    public static void main(String[] args) {
        Garden garden = new Garden();
        garden.run();
    }

}
