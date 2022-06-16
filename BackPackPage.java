import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackPackPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackPackPage extends Actor
{
    /**
     * Act - do whatever the BackPackPage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public BackPackPage(){
        GreenfootImage image = getImage();
        image.scale(700,550);
        setImage(image);
    }
    
    public void hide(){
        setLocation(getWorld().getWidth()/2, 1000);
    }
    public void show(){
        setLocation(getWorld().getWidth()/2, 300);
    }
    public void act()
    {
        // Add your action code here.
    }
}
