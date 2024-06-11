import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GoalDescription here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GoalDescription extends Actor
{
    Color fore = new Color(255, 255, 255, 255);
    Color back = new Color(189, 181, 159);
    public static int gameGoal = 1000;
    
    public void GoalDescripton()
    {
        gameGoal = 1000;
        GreenfootImage image = new GreenfootImage("   Current goal:   \n   " + gameGoal + " cookies   ", 30, fore, back);
        setImage(image);
    }
    
    public void act()
    {
        if(gameGoal >= 500000000)
        {
            gameGoal = 500000000;
            GreenfootImage image = new GreenfootImage("   Final goal:   \n   500M cookies   ", 30, fore, back);
            setImage(image);
        }
        else
        {
            if(gameGoal >= 999999)
            {
                GreenfootImage image = new GreenfootImage("   Current goal:   \n   " + gameGoal/1000000 + "M cookies   ", 30, fore, back);
                setImage(image);
            }
            
            else
            {
                GreenfootImage image = new GreenfootImage("   Current goal:   \n   " + gameGoal + " cookies   ", 30, fore, back);
                setImage(image);
            }
        }
    }
}
