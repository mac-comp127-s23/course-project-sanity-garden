import java.util.ArrayList;

import edu.macalester.graphics.Image;

public class Strawberry extends Plant{
public int howMany = 0;
public Image strawberryBud;

    public Strawberry(Image strawberryBud) {

        super();


        price = 3;
        numberStages = 2;
        plantImages = new ArrayList<>(numberStages);

        plantImages.add(new Image("testMushroom.png"));
        plantImages.add(new Image("strawberryBud.jpeg"));
        plantImages.add(new Image("strawberry.png"));
        
 
    }

    public Image getStrawberry() {
        return this.strawberryBud;
    }
}


