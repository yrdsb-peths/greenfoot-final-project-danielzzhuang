import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cancel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cancel extends Actor
{
    /**
     * Act - do whatever the Cancel wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Cancel(){
        GreenfootImage image = getImage();
        image.scale(120,120);
        setImage(image);
    }
    public void act()
    {
        if (Greenfoot.mouseClicked(this)){
            BackPackIsOpen=false;
        }
    }
}