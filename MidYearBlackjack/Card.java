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
    public int cardPoints;
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
        setCard();
    }
    public void setCard() {
        if (cardChosen==1) {
            setImage("Number1.png");
            cardPoints = 1;
        } else if (cardChosen==2) {
            setImage("Number2.png");
            cardPoints = 2;
        } else if (cardChosen==3) {
            setImage("Number3.png");
            cardPoints = 3;
        } else if (cardChosen==4) {
            setImage("Number4.png");
            cardPoints = 4;
        } else if (cardChosen==5) {
            setImage("Number5.png");
            cardPoints = 5;
        } else if (cardChosen==6) {
            setImage("Number6.png");
            cardPoints = 6;
        } else if (cardChosen==7) {
            setImage("Number7.png");
            cardPoints = 7;
        } else if (cardChosen==8) {
            setImage("Number8.png");
            cardPoints = 8;
        } else if (cardChosen==9) {
            setImage("Number9.png");
            cardPoints = 9;
        } else if (cardChosen==10) {
            setImage("Number10.png");
            cardPoints = 10;
        } else if (cardChosen==11) {
            setImage("Number11.png");
            cardPoints = 11;
        }
    }
    
}
