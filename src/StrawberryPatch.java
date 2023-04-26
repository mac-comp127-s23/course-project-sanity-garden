
import java.awt.Color;

import org.w3c.dom.ElementTraversal;

import edu.macalester.graphics.*;

public class StrawberryPatch extends Location {

    private Image strawberryBud;
    private GraphicsGroup allDirtLabels;
    private GraphicsText dirtLabelLeft;
    private GraphicsText dirtLabelRight;
    private Strawberry strawberry;

    public StrawberryPatch(CanvasWindow canvas) {

        super("Strawberry Patch", 150, 400); // this is where we place the strawberry patch label on the main screen

        elements = new GraphicsGroup(125, 300); //this is where we position the dirt labels together
        dirtLabelLeft = new GraphicsText("Click to Plant a Strawberry");
        dirtLabelLeft.setFillColor(Color.WHITE);
        dirtLabelRight = new GraphicsText("Click to Plant a Strawberry", 450, 0); // this is how far away dirt right is from dirt left
        dirtLabelRight.setFillColor(Color.WHITE);
        elements.add(dirtLabelLeft);
        elements.add(dirtLabelRight);

        background = new Image(0, 0, "strawberrypatch.png");
        strawberryBud = new Image(0, 0, "strawberryBud.jpeg");
        strawberry = new  Strawberry(new Image("strawberry.png"));

        drawLocation();
        plantStrawberry(canvas);
    }

    private void plantStrawberry(CanvasWindow canvas) {
        // when you click on the dirt patch it plants a seed
        canvas.onClick(event -> {

            if (elements.getElementAt(event.getPosition()) == dirtLabelLeft) {
                strawberry.updatePlantImage();
                canvas.add(strawberry.getPlant());
                strawberry.grow();
            }
            if (elements.getElementAt(event.getPosition()) == dirtLabelRight) {
                strawberry.updatePlantImage();
                canvas.add(strawberry.getPlant());
                strawberry.grow();
            }
        });

    }



}
