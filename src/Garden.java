
import edu.macalester.graphics.*;

public class Garden {

private CanvasWindow canvas;
//private Image worldMap;
private World world;

    public Garden() {

        canvas = new CanvasWindow("Sanity Garden", 700, 700);
        //worldMap.setImagePath("res/Map of The Shimmering Sea.jpg");

        //world = new World();
        //world.setWorldImage(worldMap);
        //world.setWorldImage();
        //canvas.add(world.getWorldImage(), 0, 0);
        // Rectangle rect = new Rectangle(0, 0, 50, 50);
        // world.add(rect, 0, 0);
        // canvas.add(world, 0, 0);
        Image image = new Image(0, 0, "Map.jpg");
        canvas.add(image);

    }

    private void run() {
        canvas.draw();
    }

    public static void main(String[] args) {
        
        Garden garden = new Garden();
        garden.run();


    }

}
