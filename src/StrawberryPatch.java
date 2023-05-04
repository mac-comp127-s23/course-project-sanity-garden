
import edu.macalester.graphics.*;
import edu.macalester.graphics.ui.Button;

public class StrawberryPatch extends Location {

    private Strawberry strawberryLeft;
    private Strawberry strawberryRight;
    private Button leftButton;
    private Button rightButton;
    

    /**
     * Creates a strawberry patch from location where you can click to plant and grow strawberries and
     * then harvest them.
     */

    public StrawberryPatch(CanvasWindow canvas) {

        super("Strawberry Patch", 150, 400); // this is where we place the strawberry patch label on the main screen

        leftButton = new Button("Click here to plant a strawberry");
        rightButton = new Button("Click here to plant a strawberry");

        leftButton.setPosition(130, 500);
        rightButton.setPosition(580, 500);


        background = new Image(0, 0, "strawberrypatch.png");
        strawberryLeft = new Strawberry(200, 300);
        strawberryRight = new Strawberry(650, 300);

        drawLocation();
        add(leftButton);
        add(rightButton);

        plantStrawberry(canvas);
    }

    /**
     * Plants a strawberry when you click on each of the dirt patches. When you click multiple times,
     * the strawberry grows
     */

    private void plantStrawberry(CanvasWindow canvas) {
        leftButton.onClick(() -> { //switching to button
                strawberryLeft.updatePlantImage();
                canvas.add(strawberryLeft.getPlant());
                if (strawberryLeft.grow()) {
                    additionalItem = true;
                    for (Image image : strawberryLeft.getPlantImages()) {
                        canvas.pause(20);
                        canvas.remove(image);
                    }
                }

        });
            rightButton.onClick(() -> { //switching to button
                strawberryRight.updatePlantImage();
                canvas.add(strawberryRight.getPlant());
                if (strawberryRight.grow()) {
                    additionalItem = true;
                    canvas.pause(20);
                    for (Image image : strawberryRight.getPlantImages()) {
                        canvas.pause(20);
                        canvas.remove(image);
                    }
                }
        });
    }
    
    public void resetGrowthStage() {
        strawberryLeft.setGrowthStage(0);
        strawberryRight.setGrowthStage(0);
    }
    
    
}
