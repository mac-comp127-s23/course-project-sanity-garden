import edu.macalester.graphics.Image;

public class Strawberry {
public int howMany = 0;
public Image strawberryBud;



    public Strawberry(Image strawberryBud) {

        strawberryBud = new Image(0, 0, "strawberryBud.jpg");
 
    }

    public Image getStrawberry() {
        return this.strawberryBud;
    }
}


