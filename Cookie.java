import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Cookie to be clicked by user
 * 
 * @author Jaiden Gool
 * @version 2024-06-04
 */
public class Cookie extends Actor
{
    GreenfootSound click = new GreenfootSound("cookieclick.mp3");
    
    public void act()
    {
        turn(-1);
        cookieClicked();
        
        if(Greenfoot.mouseClicked(null))
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            if(mouse != null)
            {
                getWorld().addObject(new ClickEffect(), mouse.getX(), mouse.getY());
            }
        }
    }
    
    /*
     * This method checks if the cookie is clicked
     * When the cookie is clicked, it adds 1 * the score scaling to the counter
     * It will also play a click sound a turn slightly clockwise
     */
    public void cookieClicked()
    {
        if(Greenfoot.mouseClicked(this))
        {
            ScoreDisplay.score+=(1 * (int)ScoreDisplay.scoreScaling);
            turn(5);
            click.play();
        }
    }
}
