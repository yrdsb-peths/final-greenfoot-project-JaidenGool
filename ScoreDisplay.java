import greenfoot.*;
import java.util.*;

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
    Color back = new Color(111,78,55, 255);
    public ScoreDisplay()
    {
        scoreScaling = 1;
        score = 0;
        GreenfootImage image = new GreenfootImage("Cookies: " + score, 70, fore, back);
        setImage(image);
    }
    public void act()
    {
        GreenfootImage image = new GreenfootImage("Cookies: " + score, 70, fore, back);
        setImage(image);
    }
}
