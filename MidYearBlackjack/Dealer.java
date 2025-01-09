import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Dealer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dealer extends Actor
{   public int cardPoints;
    public Card dealerCard1;
    public Card dealerCard2;
    public Dealer() {
        cardPoints = 0;
        dealerCard1 = new Card();
        dealerCard2 = new Card();
    }
    /**
     * Act - do whatever the Dealer wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        for (int test = 0; test<1; test++) {
            getWorld().addObject(dealerCard1, getWorld().getWidth()/2, 
            getWorld().getHeight()/2);
            //getWorld().addObject(dealerCard2, getWorld().getWidth()/2, 
            //getWorld().getHeight()/2);
        }
        for (int test2 = 0; test2<1; test2++) {
            getWorld().addObject(dealerCard2, getWorld().getWidth()/2+10, 
            getWorld().getHeight()/2+10);
        }
    }
}
