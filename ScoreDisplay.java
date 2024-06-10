import greenfoot.*;
import java.util.*;
import java.math.BigInteger;

/**
 * Displays amount of cookies currently owned
 * 
 * @author Jaiden Gool
 * @version 05-28-2024
 */
public class ScoreDisplay extends Actor
{
    public static int score = 0;
    public static int scoreScaling = 1;
    Color fore = new Color(255, 255, 255, 255);
    Color back = new Color(0, 0, 0, 80);
    public ScoreDisplay()
    {
        scoreScaling = 1;
        score = 0;
        GreenfootImage image = new GreenfootImage("Cookies: " + score, 70, fore, back);
        setImage(image);
    }
    public void act()
    {
        if(score >= 999999999)
        {
            GreenfootImage image = new GreenfootImage("Cookies: " + (score/1000000000) + "B", 70, fore, back);
            setImage(image);
        }
        
        else if(score >= 999999)
        {
            GreenfootImage image = new GreenfootImage("Cookies: " + (score/1000000) + "M", 70, fore, back);
            setImage(image);
        }
        
        else
        {
            GreenfootImage image = new GreenfootImage("Cookies: " + score, 70, fore, back);
            setImage(image);
        }
        
    }
}
