
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

        elements = new GraphicsGroup(200, 200); //this is where we position the dirt labels together
        dirtLabelLeft = new GraphicsText("Click to Plant a Strawberry");
        dirtLabelRight = new GraphicsText("Click to PLant a Strawberry", 400, 200); // this is how far waway dirt right is from dirt left
        elements.add(dirtLabelLeft);
        elements.add(dirtLabelRight);

        background = new Image(0, 0, "realstrawberrypatch.png");
        strawberryBud = new Image(0, 0, "strawberryBud.jpeg");
        strawberry = new  Strawberry(new Image("strawberry.png"));
        elements.add(strawberry.getPlant()); //added this, now onclick method doesn't work for straw bud image >_<

        drawLocation();
        plantStrawberry(canvas);


    }

    private void plantStrawberry(CanvasWindow canvas) {
        // when you click on the dirt patch it plants a seed

        
        canvas.onClick(event -> {

            if (elements.getElementAt(event.getPosition()) == dirtLabelLeft) {
                strawberry.grow();
                canvas.add(strawberry.getPlant());
            }
            if (elements.getElementAt(event.getPosition()) == dirtLabelRight) {
                strawberry.grow();

                canvas.add(strawberry.getPlant());
            }
        });

    }



}
