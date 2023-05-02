import java.util.ArrayList;
import java.util.List;
import edu.macalester.graphics.*;

public class Garden {

    private CanvasWindow canvas;
    private GraphicsGroup labels;
    private List<Location> locations;
    private StrawberryPatch straw;
    private AppleOrchard apple;
    private Market market;
    private World world;
    private Item strawberries;
    private Item apples;
    private List<Item> itemList;

    /**
     * Authors: Chris Lohmeier, Emma Nguyen and Lola Vescovo Comp 127 Final Project
     */

    /**
     * Creates a garden where you can click on locations and plant and sell various foods.
     */

    public Garden() {
        canvas = new CanvasWindow("Sanity Garden", 900, 600); // Standard screen height for now
        world = new World();

        itemList = new ArrayList<>();

        strawberries = new Item("Strawberry", 1.5, 20);
        itemList.add(strawberries);

        apples = new Item("Apple", 2, 15);
        itemList.add(apples);

        straw = new StrawberryPatch(canvas);
        apple = new AppleOrchard(canvas);
        market = new Market(canvas, itemList);
        locations = new ArrayList<Location>();
        locations.add(market);
        locations.add(straw);
        locations.add(apple);

        labels = new GraphicsGroup();
        labels.add(straw.getLabel());
        labels.add(market.getLabel());
        labels.add(apple.getLabel());

        drawWorld();
    }

    private void drawWorld() {
        canvas.add(world.getWorldImage());
        canvas.add(labels);
    }

    /**
     * creates the main world with the locations placed and click-able.
     */
    
    private void run() {
        canvas.draw();
        canvas.onClick(event -> {
            for (Location location : locations) {
                if (canvas.getElementAt(event.getPosition().getX(),
                    event.getPosition().getY()) == location.getLabelBox()) {
                    canvas.removeAll();
                    canvas.add(location);
                    checkExit(location);
                    System.out.println(location.getLabelBox());
                }
            }
        });
    }

    private void checkExit(Location location) {
        canvas.onClick(event -> {
            if (canvas.getElementAt(event.getPosition().getX(),
                event.getPosition().getY()) == location.getExitBox()) {
                canvas.removeAll();
                drawWorld();
            }
        });
    }

    public static void main(String[] args) {
        Garden garden = new Garden();
        garden.run();
    }

}
