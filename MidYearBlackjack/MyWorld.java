import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{   public int turnNumber;
    public boolean isFirstTurn = true;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(860, 472, 1); 
        prepare();
        turnNumber = 0;
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Player player1 = new Player();
        addObject(player1,100 ,200 );
        Dealer dealer = new Dealer();
        addObject(dealer, getWidth()/2, 30);
    }
    public void addTurn() {
        turnNumber++;
    }
    public int getTurns() {
        return turnNumber;
    }
    public void comparePoints() {
        Player player = (Player)getObjects(Player.class).get(0);
        Dealer dealer = (Dealer)getObjects(Dealer.class).get(0);
        int playerPoints = player.returnPlayerCardPoints();
        int dealerPoints = dealer.returnDealerCardPoints();
    }
    public void setFirstTurn() {
        if (turnNumber != 0) {
            isFirstTurn = false;
        }
    }
    public boolean returnFirstTurn() {
        return isFirstTurn;
    }
}
