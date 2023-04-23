import edu.macalester.graphics.*;

public class World extends GraphicsGroup {

    private Image background;
    private Image elements;

    public World() {
        background = new Image(0, 0, "background.png");
        elements = new Image(0, 0, "testMushroom.png");
        add(background);
        add(elements);
    }

    public GraphicsGroup getWorldImage() {
        return this;
    }

}
