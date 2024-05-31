import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Glowing effect behind the cookie
 * 
 * @author Jaiden Gool
 * @version May 31, 2024
 */
public class GlowEffect extends Actor
{
    public GlowEffect()
    {
        GreenfootImage image = getImage();
        image.scale(350, 350);
    }
    
    public void act()
    {
        turn(1);
    }
}
