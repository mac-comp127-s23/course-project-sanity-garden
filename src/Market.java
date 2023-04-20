import edu.macalester.graphics.*;

public class Market extends Location {

    private int berryInventory;
    // private int berrySeedCount;// are we interested in keeping count of seeds?? 
   // private int appleInventory; 
    private double balance;
    private GraphicsText balanceDisplay; 
    private Image strawberry;
    private GraphicsText berryText;

    public Market(CanvasWindow canvas) {

        balance = 0;
        
        elements = new GraphicsGroup(0, 0);
        strawberry = new Image(300,350, "strawberryBud.jpeg"); // strawberry bud is a placeholder for now 
        berryText = new GraphicsText("Sell a strawberry for $1.50 here:");
        balanceDisplay = new GraphicsText("your balance: " + balance);
        elements.add(balanceDisplay);
        elements.add(strawberry);
        elements.add(berryText);

        background = new Image(0,0, "Market.png"); 
        //this.berryInventory = StrawberryPatch.strawberryCount; // whatever we end up making the count for strawberry to be?? so two separate instances? 
       // this.appleInventory = appleOrchard.appleCount;

       drawLocation();
       sellFruit(canvas);


        
    }

    private void sellFruit(CanvasWindow canvas){
        canvas.onClick(event -> {
            if (elements.getElementAt(event.getPosition()) == strawberry){
                balance = balance + 1.5;
                berryInventory--;
            }
        });
        
        // if (appleInventory){
        //     balance = balance + 5;
        // }
    }

    // private void buySeeds(){
    //     if (strawberry){
    //         balance = balance + 1.5;
    //         invetory 
    //     }
        // if (apple){
        //     balance = balance + 5;
        // }
    // }
    // private void run() {
    //     canvas.draw();
    // }

    // public static void main(String[] args) {
    //     Market market = new Market();
    //     market.run();
    // }
    
}

// buy and sell things, keep track of money 
