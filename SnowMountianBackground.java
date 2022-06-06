import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class snowMountianBackGround here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnowMountianBackground extends Actor
{
    GifImage backgroundGif = new GifImage("images/snowMountian_idke/snowMountianBackGround.gif");
    /**
     * Act - do whatever the snowMountianBackGround wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        setImage(backgroundGif.getCurrentImage());
    }
}
