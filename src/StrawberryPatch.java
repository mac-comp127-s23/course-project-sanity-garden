
import edu.macalester.graphics.*;

public class StrawberryPatch extends Location {

    private Strawberry strawberryLeft;
    private Strawberry strawberryRight;
    private Label newDirtLabelLeft;
    private Label newDirtLabelRight;

    /**
     * Creates a strawberry patch from location where you can click to plant and grow strawberries and
     * then harvest them.
     */

    public StrawberryPatch(CanvasWindow canvas) {

        super("Strawberry Patch", 150, 400); // this is where we place the strawberry patch label on the main screen

        newDirtLabelLeft = new Label("Click to Plant a Strawberry", 125, 300); // this is where we place dirtLeft
        newDirtLabelRight = new Label("Click to Plant a Strawberry", 575, 300); // this is where we place dirtRight

        background = new Image(0, 0, "strawberrypatch.png");
        strawberryLeft = new Strawberry(200, 300);
        strawberryRight = new Strawberry(650, 300);

        drawLocation();
        add(newDirtLabelLeft);
        add(newDirtLabelRight);

        plantStrawberry(canvas);
    }

    /**
     * Plants a strawberry when you click on each of the dirt patches. When you click multiple times,
     * the strawberry grows
     */

    private void plantStrawberry(CanvasWindow canvas) {
        canvas.onClick(eventLeft -> {
            if (getElementAt(eventLeft.getPosition()) == newDirtLabelLeft.getLabelBox()) {
                strawberryLeft.updatePlantImage();
                canvas.add(strawberryLeft.getPlant());
                if (strawberryRight.grow()) {
                    additionalItem = true;
                }
            }

        });
        canvas.onClick(eventRight -> {
            if (getElementAt(eventRight.getPosition()) == newDirtLabelRight.getLabelBox()) {
                strawberryRight.updatePlantImage();
                canvas.add(strawberryRight.getPlant());
                if (strawberryRight.grow()) {
                    additionalItem = true;
                }
            }
        });

    }
}
