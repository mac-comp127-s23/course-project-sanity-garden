import edu.macalester.graphics.*;
abstract class Location extends GraphicsGroup {

    protected Label label;
    protected Label exitButton;
    protected Image background;
    protected GraphicsGroup elements;

    /**
     * Creates an overall location class with an image and various labels
     * that can be used by strawberry patch, market and apple orchard.
     */

    public Location(String title, double x, double y) {
        label = new Label(title, x, y);
        exitButton = new Label("Go Back", 50, 50);
    }

    public void drawLocation() {
        add(background);
        add(elements);
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
