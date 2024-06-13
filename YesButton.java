import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Restarts game
 * 
 * @author Jaiden Gool
 * @version 2024-06-12
 */
public class YesButton extends Actor
{
    public void act()
    {
        buttonClicked();
    }
    
    public void buttonClicked()
    {
        //Restarts game
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new StartScreen());
        }
    }
}
