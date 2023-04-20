
import java.util.HashMap;

import edu.macalester.graphics.*;

public class Garden {

private CanvasWindow canvas;
private GraphicsGroup label;
private HashMap<GraphicsText, Location> locationMap;
private GraphicsText strawberryLabel; 
private StrawberryPatch straw;


    public Garden() {
        canvas = new CanvasWindow("Sanity Garden", 700, 478);
        World world = new World();
        locationMap = new HashMap<GraphicsText,Location>();
        strawberryLabel = new GraphicsText("Strawberry Patch", 0, 0); // Could each Location have a label within the class?
        straw = new StrawberryPatch(canvas); // This causes an error

        label = new GraphicsGroup(0, 0);
        label.add(strawberryLabel, 100, 100);

        canvas.add(world.getWorldImage());
        canvas.add(label, 0, 0);

        locationMap.put(strawberryLabel, straw);
    }

    private void run() {
        canvas.draw();
        canvas.onClick(event ->{
            for (GraphicsText l : locationMap.keySet())
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
