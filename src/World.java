import edu.macalester.graphics.*;

public class World extends GraphicsGroup {

    private Image background;
    private Image elements;

    public World() {
        background = new Image(0, 0, "Map.png");
        elements = new Image(0, 0, "elements.png");
        add(background);
        add(elements);
    }

    public GraphicsGroup getWorldImage() {
        return this;
    }

}
