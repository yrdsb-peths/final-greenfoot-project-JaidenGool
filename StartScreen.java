import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen for the Cookie Clicker
 * 
 * @author Jaiden Gool 
 * @version 05-22-24
 */
public class StartScreen extends World
{
    //Title
    Label titleLabel = new Label("Cookie Clicker", 75);
    
    //Instructions
    Label instructionLabel = new Label("Press Enter to start", 65);
    public StartScreen()
    {    
        super(900, 700, 1, false);
        
        addObject(titleLabel, getWidth()/2, 260);
        addObject(instructionLabel, getWidth()/2, 400);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("Enter"))
        {
            Greenfoot.setWorld(new GameScreen());
        }
    }
}
