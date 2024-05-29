import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main game screen
 * 
 * @author Jaiden Gool
 * @version 05-24-24
 */
public class GameScreen extends World
{
    public GameScreen()
    {   
        // Creates a 1440x900 screen
        super(1440, 900, 1, false);
        
        // Border for upgrades and other interface objects
        Frame frame = new Frame();
        addObject(frame, 1000, 450);
        
        // Clickable cookie
        Cookie cookie = new Cookie();
        addObject(cookie, getWidth()/4 -100, getHeight()/2);
        
        // Label to display cookies owned
        ScoreDisplay scoreDisplay = new ScoreDisplay();
        addObject(scoreDisplay, getWidth()/4 -100, 200);
    }
}
