import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Buy button for first upgrade
 * 
 * @author Jaiden Gool 
 * @version 2024-06-03
 */
public class GoalBuyButton extends Actor
{
    GreenfootSound click = new GreenfootSound("cookieclick.mp3");
    public static int upgradeReq = GoalDescription.gameGoal;
    public static int score = 0;
    Color fore = new Color(255, 255, 255, 255);
    Color back = new Color(189, 181, 159);
    
    public GoalBuyButton()
    {
        upgradeReq = 50;
        GreenfootImage image = new GreenfootImage("     Buy     ", 24, fore, back);
        setImage(image);
    }
    
    public void act()
    {
        buttonClicked();
        score = ScoreDisplay.score;
        upgradeReq = GoalDescription.gameGoal;
    }
    
    public void buttonClicked()
    {
        if(Greenfoot.mouseClicked(this))
        {
            if(score >= upgradeReq && upgradeReq != 500000000)
            {
                ScoreDisplay.score -= upgradeReq;
                click.play();
                GoalDescription.gameGoal*=5;
            }
        }
        
        if(Greenfoot.mouseClicked(this) && upgradeReq == 500000000 && score >= 500000000)
        {
            upgradeReq = 1000;
            Greenfoot.setWorld(new EndScreen());
        }
    }
}
