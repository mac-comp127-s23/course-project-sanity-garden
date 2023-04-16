
import edu.macalester.graphics.*;

public class Garden {

private CanvasWindow canvas;
private GraphicsGroup label;
private Image worldMap;
private Image strawberryPatch;
private Image market;
private Image appleOrchard;
private GraphicsText strawberryLabel; 
private GraphicsText marketLabel;
private GraphicsText appleLabel;


    public Garden() {

        canvas = new CanvasWindow("Sanity Garden", 700, 478);
        Image worldMap = new Image(0, 0, "Map.jpg");
        Image strawberryPatch = new Image(0, 0, "patch.jpg");
        Image appleOrchard = new Image(0, 0, "appleOrchard.jpeg");
        Image market = new Image(0, 0, "Market.png");

        GraphicsText strawberryLabel = new GraphicsText("Strawberry Patch", 0, 0);
        GraphicsText marketLabel = new GraphicsText("Market", 0, 0);
        GraphicsText appleLabel = new GraphicsText("Apple Orchard");

        worldMap.setMaxHeight(700);
        worldMap.setMaxWidth(700);

        label = new GraphicsGroup(0, 0);

        label.add(worldMap, 0, 0);
        label.add(strawberryLabel, 100, 100);
        label.add(marketLabel, 300, 300);
        label.add(appleLabel, 200, 200);

        canvas.add(label, 0, 0);
        // canvas.add(worldMap);
        // canvas.add(strawberryLabel, 300, 300);
        // canvas.add(marketLabel, 100, 100);
        // canvas.add(appleLabel, 200,200);
  
        canvas.onClick(event ->{
            if (label.getElementAt(event.getPosition()) == strawberryLabel){
                canvas.remove(label);
                canvas.add(strawberryPatch, 0, 0);
            }
            if (label.getElementAt(event.getPosition()) == marketLabel){
                canvas.remove(label);
                canvas.add(market, 0, 0);
            }
            if (label.getElementAt(event.getPosition()) == appleLabel){
                canvas.remove(label);
                canvas.add(appleOrchard, 0, 0);
            }
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
