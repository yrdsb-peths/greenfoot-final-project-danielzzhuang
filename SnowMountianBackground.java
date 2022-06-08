import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class snowMountianBackGround here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnowMountianBackground extends Actor
{
    GifImage backgroundGif = new GifImage("snowMountian_idle/snow.gif");
    
    /**
     * Act - do whatever the snowMountianBackGround wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        
    }
    
    protected void addedToWorld(World world){
        GreenfootImage image = backgroundGif.getCurrentImage();
        image.scale(world.getWidth(),world.getHeight());
        setImage(image);
    }
}
