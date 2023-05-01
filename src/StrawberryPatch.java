
import Plants.Strawberry;
import edu.macalester.graphics.*;

public class StrawberryPatch extends Location {

    private Strawberry strawberry;
    private Label newDirtLabelLeft;
    private Label newDirtLabelRight;

    /**
     * Creates a strawberry patch from location where you can click to plant and grow strawberries
     * and then harvest them.
     */

    public StrawberryPatch(CanvasWindow canvas) {

        super("Strawberry Patch", 150, 400); // this is where we place the strawberry patch label on the main screen
    
        newDirtLabelLeft = new Label("Click to Plant a Strawberry", 125, 300); //this is where we place dirtLeft
        newDirtLabelRight = new Label("Click to Plant a Strawberry", 575, 300); //this is where we place dirtRight

        
        background = new Image(0, 0, "strawberrypatch.png");
        strawberry = new  Strawberry(new Image("strawberry.png"));

        drawLocation();
        add(newDirtLabelLeft);
        add(newDirtLabelRight);

        plantStrawberry(canvas);
    }

     /**
     * Plants a seed when you click on the dirt patch
     */

    private void plantStrawberry(CanvasWindow canvas) {
        canvas.onClick(event -> {
            if (getElementAt(event.getPosition()) == newDirtLabelLeft.getLabelBox()) {
                strawberry.updatePlantImage();
                canvas.add(strawberry.getPlant());
                strawberry.grow();
                System.out.print(newDirtLabelLeft.getLabelBox());
            }
            if (getElementAt(event.getPosition()) == newDirtLabelRight.getLabelBox()) {
                strawberry.updatePlantImage();
                canvas.add(strawberry.getPlant());
                strawberry.grow();
            }
        });

    }



}
