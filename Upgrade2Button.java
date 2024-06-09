import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Buy button for first upgrade
 * 
 * @author Jaiden Gool 
 * @version 2024-06-03
 */
public class Upgrade2Button extends Actor
{
    GreenfootSound click = new GreenfootSound("cookieclick.mp3");
    public static int upgradeReq = 10;
    public static int grandmaCount = 0;
    public static int upgradeReqScaling = 2;
    public static int score = 0;
    Color fore = new Color(255, 255, 255, 255);
    Color back = new Color(189, 181, 159);
    
    public Upgrade2Button()
    {
        upgradeReq = 10;
        grandmaCount = 0;
        score = 0;
        GreenfootImage image = new GreenfootImage("     Buy     ", 24, fore, back);
        setImage(image);
    }
    
    public void act()
    {
        buttonClicked();
        score = ScoreDisplay.score;
    }
    
    public void buttonClicked()
    {
        if(Greenfoot.mouseClicked(this))
        {
            if(ScoreDisplay.score >= upgradeReq)
            {
                grandmaCount++;
                ScoreDisplay.score -= upgradeReq;
                click.play();
                upgradeReq *= upgradeReqScaling;
            }
        }
    }
}
