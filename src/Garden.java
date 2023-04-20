import java.util.ArrayList;
import java.util.List;

import edu.macalester.graphics.*;

public class Garden {

private CanvasWindow canvas;
private GraphicsGroup label;
private List<Location> locations;
private StrawberryPatch straw;
private Market market;


    public Garden() {
        canvas = new CanvasWindow("Sanity Garden", 900, 600); // Standard screen height for now
        World world = new World();
        locations = new ArrayList<Location>();

        straw = new StrawberryPatch(canvas);
        market = new Market(canvas);

        label = new GraphicsGroup();
        label.add(straw.getLabel());
        label.add(market.getLabel());

        canvas.add(world.getWorldImage());
        canvas.add(label);

        locations.add(market);
        locations.add(straw);
    }

    private void run() {
        canvas.draw();
        canvas.onClick(event -> {
            for (Location location : locations) {
                if (location.getLabelBox().getElementAt(event.getPosition().getX(), event.getPosition().getY()) == location.getLabelBox()) {
                    canvas.removeAll();
                    canvas.add(location);
                }
            }
        }
        );
    }

    public static void main(String[] args) {
        Garden garden = new Garden();
        garden.run();
    }

}
