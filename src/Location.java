import edu.macalester.graphics.*;

abstract class Location extends GraphicsGroup {
    
    protected GraphicsText label;
    protected Image background;
    protected GraphicsGroup elements;

    public void drawLocation() {
        add(background);
        add(elements);
    }

}
