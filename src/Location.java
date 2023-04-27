import java.awt.Color;
import edu.macalester.graphics.*;
abstract class Location extends GraphicsGroup {

    protected GraphicsGroup label;
    protected GraphicsText labelText;
    protected Rectangle labelBox;
    protected Image background;
    protected GraphicsGroup elements;
    protected CanvasWindow canvasWindow;

    /**
     * Creates an overall location class with an image and various labels
     * that can be used by strawberry patch, market and apple orchard.
     */

    public Location(String title, double x, double y) {
        label = new GraphicsGroup();
        labelText = new GraphicsText(title, x, y);
        labelBox = new Rectangle(x, y - labelText.getHeight(), labelText.getWidth(), labelText.getHeight());
        labelBox.setFillColor(new Color(255, 255, 255, 0));
        labelBox.setStroked(false);
        label.add(labelBox);
        label.add(labelText);
    }

    public void drawLocation() {
        add(background);
        add(elements);
    }

    public GraphicsGroup getLabel() {
        return label;
    }
    
    public Rectangle getLabelBox() {
        return labelBox;
    }

    // public boolean exit() {
    // Unimplemented: for loop that checks if the "exitButton" has been clicked, and returns true if that is the case
    // }

}
