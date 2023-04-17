import edu.macalester.graphics.*;

public class World extends GraphicsGroup {

    private Image worldMap;

    public World() {
        worldMap = new Image(0, 0, "Map.jpg");
        worldMap.setMaxHeight(700);
        worldMap.setMaxWidth(700);
        add(worldMap);
    }

    public Image getWorldImage() {
        return worldMap;
    }

}
