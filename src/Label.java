import java.awt.Color;

import edu.macalester.graphics.GraphicsGroup;
import edu.macalester.graphics.GraphicsText;
import edu.macalester.graphics.Rectangle;

public class Label extends GraphicsGroup {

    private Rectangle labelBox;

    public Label(String title, double x, double y) {
        super(x, y);
        GraphicsText labelText = new GraphicsText(title);
        labelBox = new Rectangle(x, y - labelText.getHeight(), labelText.getWidth(), labelText.getHeight());
        labelBox.setFillColor(new Color(255, 255, 255,255));
        labelBox.setStroked(false);
        add(labelBox);
        add(labelText);
    }

    // Since canvas.onClick doesn't work with a GraphicsGroup, this should be used for event handlers on labels
    public Rectangle getLabelBox() {
        return labelBox;
    }
}
