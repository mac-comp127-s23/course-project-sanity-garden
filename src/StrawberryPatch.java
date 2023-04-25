
import org.w3c.dom.ElementTraversal;

import edu.macalester.graphics.*;

public class StrawberryPatch extends Location {

    private Image strawberryBud;
    private GraphicsGroup allDirtLabels;
    private GraphicsText dirtLabelLeft;
    private GraphicsText dirtLabelRight;
    private Strawberry strawberry;


    public StrawberryPatch(CanvasWindow canvas) {

        super("Strawberry Patch", 300, 100);

        elements = new GraphicsGroup(0, 0);
        dirtLabelLeft = new GraphicsText("Dirt Left");
        dirtLabelRight = new GraphicsText("Dirt Right");
        elements.add(dirtLabelLeft);
        elements.add(dirtLabelRight,100, 100);

        background = new Image(0, 0, "realstrawberrypatch.jpg");
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
