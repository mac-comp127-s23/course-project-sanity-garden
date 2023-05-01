import edu.macalester.graphics.*;
abstract class Location extends GraphicsGroup {

    protected Label label;
    protected Label exitButton;
    protected Image background;

    /**
     * Creates an overall location class with an image and various labels
     * that can be used by strawberry patch, market and apple orchard.
     * 
     * To add an element, call add(*element you want to add*) AFTER drawLocation()
     */

    public Location(String title, double x, double y) {
        label = new Label(title, x, y);
        exitButton = new Label("Go Back", 50, 50);
    }

    public void drawLocation() {
        add(background);
        add(exitButton);
    }

    public Rectangle getExitBox() {
        return exitButton.getLabelBox();
    }

    public Label getLabel() {
        return label;
    }

    public Rectangle getLabelBox() {
        return label.getLabelBox();
    }

}
