
import java.util.HashMap;

import edu.macalester.graphics.*;

public class Garden2 {

private CanvasWindow canvas;
private GraphicsGroup label;
private HashMap<GraphicsText, Location> locationMap;
private GraphicsText strawberryLabel; 
private Strawberry straw;


    public Garden2() {
        canvas = new CanvasWindow("Sanity Garden", 700, 478);
        World world = new World();
        locationMap = new HashMap<GraphicsText,Location>();
        strawberryLabel = new GraphicsText("Strawberry Patch", 0, 0); // Could each Location have a label within the class?
        //straw = new Strawberry(); // This causes an error

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
                    //locationMap.get(l) // Put a createPatch method in location?
                    //straw.createStrawberryPatch(canvas);
                }
        }
        );
    }

    public static void main(String[] args) {
        Garden2 garden = new Garden2();
        garden.run();
    }

}
