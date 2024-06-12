import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main game screen
 * 
 * @author Jaiden Gool
 * @version 05-24-24
 */
public class GameScreen extends World
{
    private SimpleTimer timer = new SimpleTimer();
    GreenfootImage goalsText = new GreenfootImage("goals.png");
    
    public GameScreen()
    {   
        // Creates a 1440x900 screen
        super(1440, 900, 1, false);
        
        //Initialize timer
        timer.mark();
        
        StartScreen.bgMusic.playLoop();
        
        // Sets the order for objects
        setPaintOrder(ClickEffect.class, Cookie.class, GlowEffect.class);
        
        // Border for upgrades and other interface objects
        Frame frame = new Frame();
        addObject(frame, 1000, 450);
        
        // It is a cat at the top left
        Cat cat = new Cat();
        addObject(cat, 50, 50);
        
        Label upgradesLabel = new Label("Upgrades", 50);
        addObject(upgradesLabel, 1010, 150);
        
        //Goals text
        GreenfootImage goalsText = new GreenfootImage("goals.png");
        goalsText.scale(180, 65);
        getBackground().drawImage(goalsText, 710, 680);
        
        //Goal Description
        GoalDescription goalDescription = new GoalDescription();
        addObject(goalDescription, 1040, 716);
        
        //Goal Button
        GoalBuyButton goalBuyButton = new GoalBuyButton();
        addObject(goalBuyButton, 1270, 716);
        
        //Factory name
        if(StartScreen.factoryName.isEmpty())
        {
            Label factoryName = new Label("Your factory", 50);
            addObject(factoryName, getWidth()/4 - 95, 100);
        }
        else
        {
            Label factoryName = new Label(StartScreen.factoryName + "'s factory", 50);
            addObject(factoryName, getWidth()/4 - 85, 100);
        }
        
        //Displays cookies gained per second
        CookiesPS cookiesPs = new CookiesPS();
        addObject(cookiesPs, getWidth()/4 - 85, getHeight()/2 + 200);
        
        //Farm image
        Farm farm = new Farm();
        addObject(farm, 750, 560);
        
        //Grandma image
        Grandma grandma = new Grandma();
        addObject(grandma, 750, 390);
        
        //Image for ClickUpgrade
        CursorUpgrade cursorUpgrade = new CursorUpgrade();
        addObject(cursorUpgrade, 750, 220);
        
        // Clickable cookie
        Cookie cookie = new Cookie();
        addObject(cookie, getWidth()/4 -100, getHeight()/2);
        
        // Glow effect behind the cookie
        GlowEffect glow = new GlowEffect();
        addObject(glow, getWidth()/4 -100, getHeight()/2);
        
        // Label to display cookies owned
        ScoreDisplay scoreDisplay = new ScoreDisplay();
        addObject(scoreDisplay, getWidth()/4 -90, 200);
        
        //Upgrade 1 Description
        Upgrade1Disc upgrade1Disc = new Upgrade1Disc();
        addObject(upgrade1Disc, 1010, 230);
        
        //Upgrade 1 cost
        Upgrade1Cost upgrade1Cost = new Upgrade1Cost();
        addObject(upgrade1Cost, 1010, 280);
        
        //Upgrade 1 owned
        Upgrade1Owned upgrade1Owned = new Upgrade1Owned();
        addObject(upgrade1Owned, 1270, 212);
        
        //Upgrade 1 Buy Button
        Upgrade1Button upgrade1Button = new Upgrade1Button();
        addObject(upgrade1Button, 1270, 252);
        
        //Upgrade 2 description
        Upgrade2Disc upgrade2Disc = new Upgrade2Disc();
        addObject(upgrade2Disc, 1010, 380);
        
        //Upgrade 2 cost
        Upgrade2Cost upgrade2Cost = new Upgrade2Cost();
        addObject(upgrade2Cost, 1010, 430);
        
        //Upgrade 2 buy button
        Upgrade2Button upgrade2Button = new Upgrade2Button();
        addObject(upgrade2Button, 1270, 410);
        
        //Upgrade 2 owned
        Upgrade2Owned upgrade2Owned = new Upgrade2Owned();
        addObject(upgrade2Owned, 1270, 370);
        
        //Upgrade 3 description
        Upgrade3Disc upgrade3Disc = new Upgrade3Disc();
        addObject(upgrade3Disc, 1010, 530);
        
        //Upgrade 3 cost
        Upgrade3Cost upgrade3Cost = new Upgrade3Cost();
        addObject(upgrade3Cost, 1010, 580);
        
        //Upgrade 3 buy button
        Upgrade3Button upgrade3Button = new Upgrade3Button();
        addObject(upgrade3Button, 1270, 560);
        
        //Upgrade 3 owned
        Upgrade3Owned upgrade3Owned = new Upgrade3Owned();
        addObject(upgrade3Owned, 1270, 520);
        
    }
    
    public void act()
    {
        //Grandma upgrade
        if(timer.millisElapsed() > 1000 && Upgrade2Button.grandmaCount >=1)
        {
            ScoreDisplay.score += (Upgrade2Button.grandmaCount *50);
        }
        
        //Farm upgrade
        if(timer.millisElapsed() > 1000 && Upgrade3Button.farmCount >=1)
        {
            ScoreDisplay.score += (Upgrade3Button.farmCount *100);
        }
        
        if(timer.millisElapsed() > 1000)
        {
            timer.mark();
        }
        
    }
}
