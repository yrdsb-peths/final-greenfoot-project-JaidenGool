import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ClickEffect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClickEffect extends Actor
{
    private int transparency;
    GreenfootSound click = new GreenfootSound("cookieclick.mp3");
    
    public ClickEffect()
    {
        GreenfootImage image = new GreenfootImage("file.png");
        image.scale(32, 32);
        setImage(image);
        transparency = 255;
    }
    
    public void act()
    {
        transparency -= 5;
        turn(3);
        
        if(transparency <= 0)
        {
            getWorld().removeObject(this);
        }
        
        else
        {
            getImage().setTransparency(transparency);
        }
        cookieClicked();
    }
    
    public void cookieClicked()
    {
        if(Greenfoot.mouseClicked(this))
        {
            ScoreDisplay.score+=(1 * (int)ScoreDisplay.scoreScaling);
            turn(10);
            click.play();
        }
    }
}
