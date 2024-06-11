import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class YesButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class YesButton extends Actor
{
    public void act()
    {
        buttonClicked();
    }
    
    public void buttonClicked()
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new StartScreen());
        }
    }
}
