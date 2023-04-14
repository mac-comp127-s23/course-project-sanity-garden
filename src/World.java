import edu.macalester.graphics.*;

public class World {

    private Image worldMap;

    public World() {

    }

    public void setWorldImage() {
        worldMap.setImagePath("Map.jpg");
    }

    public Image getWorldImage() {
        return worldMap;
    }

}
