import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Displays cookies gained per second via upgrades
 * 
 * @author Jaiden Gool
 * @version 2024-06-09
 */
public class CookiesPS extends Actor
{
    Color fore = new Color(255, 255, 255, 255);
    Color back = new Color(0, 0, 0, 80);
    public CookiesPS()
    {
        GreenfootImage image = new GreenfootImage("Cookies Per Second: " + ((Upgrade2Button.grandmaCount * 50) + (Upgrade3Button.farmCount * 100)), 40, fore, back);
        setImage(image);
    }
    
    public void act()
    {
        GreenfootImage image = new GreenfootImage("Cookies Per Second: " + ((Upgrade2Button.grandmaCount * 50) + (Upgrade3Button.farmCount * 100)), 40, fore, back);
        setImage(image);
    }
}
