
import java.awt.Color;

import org.w3c.dom.ElementTraversal;

import edu.macalester.graphics.*;

public class StrawberryPatch extends Location {

    private Image strawberryBud;
    private Rectangle dirtLeftBox;
    private Rectangle dirtRightBox;
    private Strawberry strawberry;
    private Label newDirtLabelLeft;
    private Label newDirtLabelRight;


    public StrawberryPatch(CanvasWindow canvas) {

        super("Strawberry Patch", 150, 400); // this is where we place the strawberry patch label on the main screen
        elements = new GraphicsGroup();
    
        newDirtLabelLeft = new Label("Click to Plant a Strawberry", 125, 300); //this is where we place dirtLeft
        newDirtLabelRight = new Label("Click to Plant a Strawberry", 575, 300); //this is where we place dirtRight

        elements.add(newDirtLabelLeft);
        elements.add(newDirtLabelRight);
        
        background = new Image(0, 0, "strawberrypatch.png");
        strawberryBud = new Image(0, 0, "strawberryBud.jpeg");
        strawberry = new  Strawberry(new Image("strawberry.png"));

        drawLocation();
        plantStrawberry(canvas);
    }

    private void plantStrawberry(CanvasWindow canvas) {
        // when you click on the dirt patch it plants a seed
        canvas.onClick(event -> {

            if (elements.getElementAt(event.getPosition()) == dirtLeftBox) {
                strawberry.next();
                canvas.add(strawberry.getPlant());
                strawberry.grow();
            }
            if (elements.getElementAt(event.getPosition()) == dirtRightBox) {
                strawberry.next();
                canvas.add(strawberry.getPlant());
                strawberry.grow();
            }
        });

    }



}
