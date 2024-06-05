import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Buy button for first upgrade
 * 
 * @author Jaiden Gool 
 * @version 2024-06-03
 */
public class Upgrade1Button extends Actor
{
    GreenfootSound click = new GreenfootSound("cookieclick.mp3");
    public static int upgradeReq = 100;
    public static int upgradeReqScaling = 5;
    public static int score = 0;
    
    public Upgrade1Button()
    {
        upgradeReq = 100;
        upgradeReqScaling = 5;
        score = 0;
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
                ScoreDisplay.scoreScaling++;
                ScoreDisplay.score -= upgradeReq;
                click.play();
                upgradeReq *= upgradeReqScaling;
            }
        }
    }
}
