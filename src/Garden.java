import java.awt.Color;
import java.util.HashMap;

import edu.macalester.graphics.*;

public class Garden {

private CanvasWindow canvas;
private GraphicsGroup label;
private HashMap<GraphicsGroup, Location> locationMap;
private GraphicsText strawberryText; 
private Rectangle strawberryBox;
private GraphicsGroup strawberryLabel;
private GraphicsText marketLabel;
private StrawberryPatch straw;
private Market market;


    public Garden() {
        canvas = new CanvasWindow("Sanity Garden", 900, 600); // Standard screen height for now
        World world = new World();
        locationMap = new HashMap<GraphicsGroup,Location>();
        strawberryText = new GraphicsText("Strawberry Patch", 0, 0);
        strawberryBox = new Rectangle(strawberryText.getX(), strawberryText.getY(), strawberryText.getWidth(), strawberryText.getHeight());
        strawberryBox.setFillColor(Color.BLACK);
        strawberryLabel = new GraphicsGroup(0, 0);
        strawberryLabel.add(strawberryBox);
        strawberryLabel.add(strawberryText);

        marketLabel = new GraphicsText("Market", 500, 500); 
        straw = new StrawberryPatch(canvas);
        market = new Market(canvas);

        label = new GraphicsGroup(0, 0);
        label.add(strawberryLabel, 100, 100);
        label.add(marketLabel, 500, 500);

        canvas.add(world.getWorldImage());
        canvas.add(label, 0, 0);

        locationMap.put(strawberryLabel, straw);
        //locationMap.put(marketLabel, market);
    }

    private void run() {
        canvas.draw();
        canvas.onClick(event ->{
            for (GraphicsGroup l : locationMap.keySet())
                if (l.getElementAt(event.getPosition().getX(), event.getPosition().getY()) == l){
                    canvas.removeAll();
                    canvas.add(locationMap.get(l));
                    
                }
        }
        );
    }

    public static void main(String[] args) {
        Garden garden = new Garden();
        garden.run();
    }

}
