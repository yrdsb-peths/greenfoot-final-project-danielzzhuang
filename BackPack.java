import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BackPackPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackPack extends Actor
{
    /**
     * Act - do whatever the BackPackPage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            BackPackPage BKpage = new BackPackPage();
            Greenfoot.setWorld(BKpage);
        }
    }
    public BackPack(){
        GreenfootImage image = getImage();
        image.scale(120,120);
        setImage(image);
    }
}
