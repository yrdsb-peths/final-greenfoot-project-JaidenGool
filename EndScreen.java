import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * End screen
 * 
 * @author Jaiden Gool 
 * @version 2024-06-12
 */
public class EndScreen extends World
{

    public EndScreen()
    {    
        super(1440, 900, 1, false);
        setBackground("blackBackground.png");
        
        GreenfootImage endText = new GreenfootImage("endingText.png");
        getBackground().drawImage(endText, 100, 300);
        
        YesButton yesButton = new YesButton();
        addObject(yesButton, 500, 560);
        
        NoButton noButton = new NoButton();
        addObject(noButton, 620, 560);
    }
}
