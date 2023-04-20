
import org.w3c.dom.ElementTraversal;

import edu.macalester.graphics.*;

public class StrawberryPatch extends Location {

    private Image strawberryBud;
    private GraphicsGroup allDirtLabels;
    private GraphicsText dirtLabelLeft;
    private GraphicsText dirtLabelRight;


    public StrawberryPatch(CanvasWindow canvas) {

        elements = new GraphicsGroup(0, 0);
        dirtLabelLeft = new GraphicsText("Dirt Left", 0, 0);
        dirtLabelRight = new GraphicsText("Dirt Right", 100, 100);
        elements.add(dirtLabelLeft, 0, 0);
        elements.add(dirtLabelRight, 100, 100);

        background = new Image(0, 0, "patch.jpg");
        strawberryBud = new Image(0, 0, "strawberryBud.jpeg");

        drawLocation();
        plantStrawberry(canvas);


        // CHANGE GARDEN SO THAT WHEN YOU CLICK ON STRAWBERRY LABEL IT REMOVES LABEL
        // AND TAKES YOU TO createStrawberryPatch METHOD

    }

    private void plantStrawberry(CanvasWindow canvas) {
        // when you click on the dirt patch it plants a seed

        canvas.onClick(event -> {
            if (elements.getElementAt(event.getPosition()) == dirtLabelLeft) {
                canvas.add(strawberryBud, 0, 0);
            }
            if (elements.getElementAt(event.getPosition()) == dirtLabelRight) {
                canvas.add(strawberryBud, 100, 100);
            }
        });

    }


    // private void run() {
    //     canvas.draw();
    // }

    // public static void main(String[] args) {

    //     StrawberryPatch strawberry = new StrawberryPatch(canvas);
    //     strawberry.run();


    // }

}
