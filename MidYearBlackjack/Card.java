import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Card here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Card extends Actor
{
    private int cardChosen;
    public Card() {
        cardChosen = Greenfoot.getRandomNumber(11)+1;
        setCard();
        getImage().scale(getImage().getWidth()/4,getImage().getHeight()/4);
    }
    /**
     * Act - do whatever the Card wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void setCard() {
        if (cardChosen==1) {
            setImage("Number1.png");
        } else if (cardChosen==2) {
            setImage("Number2.png");
        } else if (cardChosen==3) {
            setImage("Number3.png");
        } else if (cardChosen==4) {
            setImage("Number4.png");
        } else if (cardChosen==5) {
            setImage("Number5.png");
        } else if (cardChosen==6) {
            setImage("Number6.png");
        } else if (cardChosen==7) {
            setImage("Number7.png");
        } else if (cardChosen==8) {
            setImage("Number8.png");
        } else if (cardChosen==9) {
            setImage("Number9.png");
        } else if (cardChosen==10) {
            setImage("Number10.png");
        } else {
            setImage("Number11.png");
        }
    }
}
