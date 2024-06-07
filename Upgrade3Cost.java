import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Upgrade3Cost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Upgrade3Cost extends Actor
{
    Color fore = new Color(255, 255, 255, 255);
    Color back = new Color(189, 181, 159);
    
    public void Upgrade3Cost()
    {
        GreenfootImage image = new GreenfootImage("Cost: " + Upgrade3Button.upgradeReq, 24, fore, back);
        setImage(image);
    }
    
    public void act()
    {
        GreenfootImage image = new GreenfootImage("Cost: " + Upgrade3Button.upgradeReq, 24, fore, back);
        setImage(image);
    }
}
