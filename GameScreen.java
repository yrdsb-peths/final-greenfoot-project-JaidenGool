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
        
        // Sets the order for objects
        setPaintOrder(Cookie.class, GlowEffect.class);
        
        // Border for upgrades and other interface objects
        Frame frame = new Frame();
        addObject(frame, 1000, 450);
        
        // Clickable cookie
        Cookie cookie = new Cookie();
        addObject(cookie, getWidth()/4 -100, getHeight()/2);
        
        // Label to display cookies owned
        ScoreDisplay scoreDisplay = new ScoreDisplay();
        addObject(scoreDisplay, getWidth()/4 -100, 200);
        
        //Description for click upgrade
        Upgrade1Disc upgrade1Disc = new Upgrade1Disc();
        addObject(upgrade1Disc, 1010, 230);
        
        // Glow effect behind the cookie
        GlowEffect glow = new GlowEffect();
        addObject(glow, getWidth()/4 -100, getHeight()/2);
        
        //UpgradeButton for ClickUpgrade
        Upgrade1Button upgrade1Button = new Upgrade1Button();
        addObject(upgrade1Button, 1270, 232);
        
        //Image for ClickUpgrade
        CursorUpgrade cursorUpgrade = new CursorUpgrade();
        addObject(cursorUpgrade, 750, 220);
        
        //Displays the cost for the first upgrade
        Upgrade1Cost upgrade1Cost = new Upgrade1Cost();
        addObject(upgrade1Cost, 1010, 280);
        
        //Factory name
        Label factoryName = new Label(StartScreen.factoryName + "'s factory", 50);
        addObject(factoryName, getWidth()/4 - 85, 100);
        
        //Grandma image
        Grandma grandma = new Grandma();
        addObject(grandma, 750, 390);
        
        //Upgrade 2 description
        Upgrade2Disc upgrade2Disc = new Upgrade2Disc();
        addObject(upgrade2Disc, 1010, 380);
        
        //Upgrade 2 cost
        Upgrade2Cost upgrade2Cost = new Upgrade2Cost();
        addObject(upgrade2Cost, 1010, 430);
        
        //Upgrade 2 buy button
        Upgrade2Button upgrade2Button = new Upgrade2Button();
        addObject(upgrade2Button, 1270, 380);
        
    }
}
