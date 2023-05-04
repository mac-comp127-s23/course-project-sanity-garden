import edu.macalester.graphics.*;
import edu.macalester.graphics.ui.Button;
abstract class Location extends GraphicsGroup {

    protected Button labelButton;
    protected Button exitButton;
    protected Image background;
    protected boolean additionalItem;

    /**
     * Creates an overall location class with an image and various labels
     * that can be used by strawberry patch, market and apple orchard.
     * 
     * To add an element, call add(*element you want to add*) AFTER drawLocation()
     */

    public Location(String title, double x, double y) {
        labelButton = new Button(title);
        labelButton.setPosition(x, y);
        exitButton = new Button("Go Back");
        exitButton.setPosition(50, 50);
        additionalItem = false;
    }

    public void drawLocation() {
        add(background);
        add(exitButton);
    }

    public Button getExitButton() {
        return exitButton;
    }

    public Button getLabelButton() {
        return labelButton;
    }

    public boolean getAdditionalItem() {
        return additionalItem;
    }

    public void setAdditionalItem(boolean b) {
        additionalItem = b;
    }

    abstract void resetGrowthStage();
}
