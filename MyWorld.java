import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        SnowMountianBackground bg=new SnowMountianBackground();
        addObject(bg, getWidth()/2, getHeight()/2);
        
        
        


    }

    public void prepare()
    {
        
    }
    public void addBackPackPage()
    {
        BackPack backPack = new BackPack();
        addObject(backPack,80,550);
    }
}
