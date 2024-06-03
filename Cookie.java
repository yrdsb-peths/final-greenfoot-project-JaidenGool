import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cookie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cookie extends Actor
{
    GreenfootSound click = new GreenfootSound("cookieclick.mp3");
    public void act()
    {
        turn(-1);
        if(Greenfoot.mouseClicked(this))
        {
            ScoreDisplay.score++;
            turn(10);
            click.play();
        }
    }
}
