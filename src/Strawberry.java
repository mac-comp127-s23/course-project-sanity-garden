
import edu.macalester.graphics.*;

public class Strawberry implements Location {

    private CanvasWindow canvas;
    private Image strawberryPatch;
    private Image strawberryBud;
    private GraphicsGroup allDirtLabels;
    private GraphicsText dirtLabelLeft;
    private GraphicsText dirtLabelRight;


    public Strawberry() {

        allDirtLabels = new GraphicsGroup(0, 0);
        allDirtLabels.add(dirtLabelLeft, 0, 0);
        allDirtLabels.add(dirtLabelRight, 100, 100);

        Image strawberryPatch = new Image(0, 0, "patch.jpg");
        Image strawberryBud = new Image(0, 0, "strawberryBud.jpeg");

        // CHANGE GARDEN SO THAT WHEN YOU CLICK ON STRAWBERRY LABEL IT REMOVES LABEL
        // AND TAKES YOU TO createStrawberryPatch METHOD

    }

    public void createStrawberryPatch(CanvasWindow canvas) {
        canvas.add(strawberryPatch, 0, 0);
        plantStrawberry();

    }

    private void plantStrawberry() {
        // when you click on the dirt patch it plants a seed

        canvas.onClick(event -> {
            if (allDirtLabels.getElementAt(event.getPosition()) == dirtLabelLeft) {
                canvas.add(strawberryBud, 0, 0);
            }
            if (allDirtLabels.getElementAt(event.getPosition()) == dirtLabelRight) {
                canvas.add(strawberryBud, 100, 100);
            }
        });

    }


    private void run() {
        canvas.draw();
    }

    public static void main(String[] args) {

        Strawberry strawberry = new Strawberry();
        strawberry.run();


    }

}
