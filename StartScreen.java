import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Title Screen for the Cookie Clicker
 * 
 * @author Jaiden Gool 
 * @version 05-22-24
 */
public class StartScreen extends World
{
    //Background Music
    public static GreenfootSound bgMusic = new GreenfootSound("click.mp3");
    //Title
    //Label titleLabel = new Label("Cookie Clicker", 75);
    GreenfootImage title = new GreenfootImage("title.png");
    
    //Instructions
    GreenfootImage instruction = new GreenfootImage("instruction.png");
    
    public static String factoryName = "";
    
    public void started()
    {
        Greenfoot.setWorld(new StartScreen());
    }
    
    public StartScreen()
    {    
        super(1440, 900, 1, false);
        
        getBackground().drawImage(title, 450, 260);
        getBackground().drawImage(instruction, 330, 350);
        
        Cookie cookie = new Cookie();
        GreenfootImage cookieScale = cookie.getImage();
        cookieScale.scale(200, 200);
        addObject(cookie, getWidth()/2, 600);
    }
    
    public void act()
    {
        if(Greenfoot.isKeyDown("Enter"))
        {
            factoryName = Greenfoot.ask("Name your factory: ");
            Greenfoot.setWorld(new GameScreen());
        }
    }
}
