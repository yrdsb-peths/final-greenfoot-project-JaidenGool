import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Buy button for first upgrade
 * 
 * @author Jaiden Gool 
 * @version 2024-06-03
 */
public class UpgradeButton extends Actor
{
    GreenfootSound click = new GreenfootSound("cookieclick.mp3");
    public void act()
    {
        buttonClicked();
    }
    
    public void buttonClicked()
    {
        if(Greenfoot.mouseClicked(this))
        {
            ScoreDisplay.scoreScaling++;
            click.play();
        }
    }
}
