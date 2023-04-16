
import edu.macalester.graphics.*;

public class Garden {

private CanvasWindow canvas;
private GraphicsGroup locations;
private Image worldMap;
private Image strawberryPatch;
private  GraphicsText strawberryLabel; 



    public Garden() {

        canvas = new CanvasWindow("Sanity Garden", 700, 478);
        Image worldMap = new Image(0, 0, "Map.jpg");
        Image strawberryPatch = new Image(0, 0, "patch.jpg");
        GraphicsText strawberryLabel = new GraphicsText("Strawberry Patch", 0, 0);

        worldMap.setMaxHeight(700);
        worldMap.setMaxWidth(700);


        canvas.add(worldMap);
        canvas.add(strawberryLabel, 300, 300);
  
        canvas.onClick(event ->{
            canvas.remove(worldMap);
            canvas.add(strawberryPatch, 0, 0);

        }
        );

    }

    private void run() {
        canvas.draw();
    }

    public static void main(String[] args) {
        
        Garden garden = new Garden();
        garden.run();


    }

}
