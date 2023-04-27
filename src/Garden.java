import java.util.ArrayList;
import java.util.List;
import edu.macalester.graphics.*;

public class Garden {

    private CanvasWindow canvas;
    private GraphicsGroup label;
    private List<GraphicsObject> exitButton; // May change GraphicsObject to "Label" class?
    private List<Location> locations;
    private StrawberryPatch straw;
    private Market market;
    private World world;

    /**
     * Authors: Chris Lohmeier, Emma Nguyen and Lola Vescovo Comp 127 Final Project
     */

    /**
     * Creates a garden where you can click on locations and plant and sell various foods
     */

    public Garden() {
        canvas = new CanvasWindow("Sanity Garden", 900, 600); // Standard screen height for now
        world = new World();

        straw = new StrawberryPatch(canvas);
        market = new Market(canvas);
        locations = new ArrayList<Location>();
        locations.add(market);
        locations.add(straw);

        label = new GraphicsGroup();
        label.add(straw.getLabel());
        label.add(market.getLabel());

        drawWorld();
    }

    private void drawWorld() {
        canvas.add(world.getWorldImage());
        canvas.add(label);
    }

    /**
     * creates the main world with the locations placed and click-able.
     */
    
    private void run() {
        canvas.draw();
        canvas.onClick(event -> {
            for (Location location : locations) {
                if (location.getLabelBox().getElementAt(event.getPosition().getX(),
                    event.getPosition().getY()) == location.getLabelBox()) {
                    canvas.removeAll();
                    canvas.add(location);
                }
            }
        });
    }
    public static void main(String[] args) {
        Garden garden = new Garden();
        garden.run();
    }

}
