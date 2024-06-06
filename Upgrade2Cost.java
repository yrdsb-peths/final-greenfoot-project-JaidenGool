import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Upgrade2Cost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Upgrade2Cost extends Actor
{
    Color fore = new Color(255, 255, 255, 255);
    Color back = new Color(189, 181, 159);
    
    public void Upgrade2Cost()
    {
        GreenfootImage image = new GreenfootImage("Cost: " + Upgrade2Button.upgradeReq, 24, fore, back);
        setImage(image);
    }
    
    public void act()
    {
        GreenfootImage image = new GreenfootImage("Cost: " + Upgrade2Button.upgradeReq, 24, fore, back);
        setImage(image);
    }
}
