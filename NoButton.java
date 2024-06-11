import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class NoButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NoButton extends Actor
{
    public void act()
    {
        buttonClicked();
    }
    
    public void buttonClicked()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.stop();
        }
    }
}
