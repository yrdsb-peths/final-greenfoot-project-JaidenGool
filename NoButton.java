import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Stops the game and music
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
        //Stops game and music when clicked
        if(Greenfoot.mouseClicked(this))
        {
            if(StartScreen.bgMusic.isPlaying())
            {
                StartScreen.bgMusic.stop();
            }
            Greenfoot.stop();
        }
    }
}
