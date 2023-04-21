import edu.macalester.graphics.Image;

public abstract class Plant {
    public int howMany = 0;
    public Image plantBud;


    public Plant(Image plantBud, String jpeg) {

        plantBud = new Image(0, 0, jpeg);
 
    }

    public Image getPlant() {
        return this.plantBud;
    }

}

