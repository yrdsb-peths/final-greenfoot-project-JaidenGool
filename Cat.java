import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Animated cat using an array
 * 
 * @author Jaiden Gool
 * @version 2024-06-10
 */
public class Cat extends Actor
{
    private GreenfootImage[] catImages;
    private int currentIndex;
    private int delay;
    private int animationCounter;
    
    public Cat()
    {
        catImages = new GreenfootImage[2];
        catImages[0] = new GreenfootImage("catclosed.png");
        catImages[1] = new GreenfootImage("catopen.png");
        
        catImages[0].scale(60, 60);
        catImages[1].scale(60, 60);
        
        currentIndex = 0;
        delay = 250;
        animationCounter = 0;
        setImage(catImages[0]);
    }
    
    public void act()
    {
        animateCat();
    }
    
    public void animateCat()
    {
        animationCounter++;
        
        if(animationCounter >= delay)
        {
            animationCounter = 0;
            currentIndex = (currentIndex + 1) % catImages.length;
            setImage(catImages[currentIndex]);
            if(currentIndex == 0)
            {
                move(-4);
            }
            else
            {
                move(4);
            }
            
        }
    }
}
