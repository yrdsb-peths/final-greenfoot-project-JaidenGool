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
        super(1440, 900, 1, false);
        
        Frame frame = new Frame();
        addObject(frame, 1000, 450);
    }
}
