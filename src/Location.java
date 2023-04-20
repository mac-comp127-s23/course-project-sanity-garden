import java.awt.Color;

import edu.macalester.graphics.*;

abstract class Location extends GraphicsGroup {
    
    protected GraphicsGroup label;
    protected GraphicsText labelText;
    protected Rectangle labelBox;
    protected Image background;
    protected GraphicsGroup elements;

    public Location(String title, double x, double y) {
        label = new GraphicsGroup();
        labelText = new GraphicsText(title, x, y);
        labelBox = new Rectangle(x, y - labelText.getHeight(), labelText.getWidth(), labelText.getHeight());
        labelBox.setFillColor(new Color(255, 255, 255, 100));
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

}
