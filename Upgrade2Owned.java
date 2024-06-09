import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Upgrade2Owned here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Upgrade2Owned extends Actor
{
    Color fore = new Color(255, 255, 255, 255);
    Color back = new Color(189, 181, 159);
    
    public Upgrade2Owned()
    {
        GreenfootImage image = new GreenfootImage(" Owned:  " + Upgrade2Button.grandmaCount + " ", 24, fore, back);
        setImage(image);
    }
    
    public void act()
    {
        GreenfootImage image = new GreenfootImage(" Owned:  " + Upgrade2Button.grandmaCount + " ", 24, fore, back);
        setImage(image);
    }
}
