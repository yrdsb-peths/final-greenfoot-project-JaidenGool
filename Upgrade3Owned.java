import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Upgrade3Owned here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Upgrade3Owned extends Actor
{
    Color fore = new Color(255, 255, 255, 255);
    Color back = new Color(189, 181, 159);
    
    public Upgrade3Owned()
    {
        GreenfootImage image = new GreenfootImage(" Owned:  " + Upgrade3Button.farmCount + " ", 24, fore, back);
        setImage(image);
    }
    
    public void act()
    {
        GreenfootImage image = new GreenfootImage(" Owned:  " + Upgrade3Button.farmCount + " ", 24, fore, back);
        setImage(image);
    }
}
