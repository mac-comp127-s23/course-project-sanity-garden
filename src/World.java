import edu.macalester.graphics.*;

public class World extends GraphicsGroup {

    private Image worldMap;

    public World() {
        worldMap = new Image(0, 0, "Map.png");
        add(worldMap);
    }

    public Image getWorldImage() {
        return worldMap;
    }

}
