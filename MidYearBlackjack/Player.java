import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    public int cardPoints;
    public Card playerCard1 = new Card();
    public Card playerCard2 = new Card();
    public int number = 1;
    public Player() {
        //getWorld().addObject(playerCard1, 233, 261);
        //getWorld().addObject(playerCard2, 281, 312);
    }
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (number ==1) {
        getWorld().addObject(playerCard1, 233, 261);
    }
    number = 5;
}
}
