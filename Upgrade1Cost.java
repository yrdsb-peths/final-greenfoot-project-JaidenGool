import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Upgrade1Cost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Upgrade1Cost extends Actor
{
    Color fore = new Color(255, 255, 255, 255);
    Color back = new Color(111,78,55, 255);
    
    public void Upgrade1Cost()
    {
        GreenfootImage image = new GreenfootImage("Cost: " + UpgradeButton.upgradeReq, 24, fore, back);
        setImage(image);
    }
    
    public void act()
    {
        GreenfootImage image = new GreenfootImage("Cost: " + UpgradeButton.upgradeReq, 24, fore, back);
        setImage(image);
    }
}
