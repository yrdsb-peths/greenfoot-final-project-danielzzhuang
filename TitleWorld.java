import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public TitleWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        SnowMountianBackground bg=new SnowMountianBackground();
        addObject(bg, getWidth()/2, getHeight()/2);
        
        Label titleLabel = new Label("Fishing Game", 100);
        addObject(titleLabel, getWidth()/2, 100);
        
        Label instructionLabel_0 = new Label("Press <F> to fish when you in game", 60);
        addObject(instructionLabel_0, getWidth()/2, 300);
        Label instructionLabel_1 = new Label("Press <R> to retract FishingRod", 60);
        addObject(instructionLabel_1, getWidth()/2, 350);
        Label instructionLabel_2 = new Label("Press <B> to open backpack", 60);
        addObject(instructionLabel_2, getWidth()/2, 400);
        
        Label instructionLabel = new Label("Press <space> to begin", 40);
        addObject(instructionLabel, getWidth()/2, 500);
        


    }
    public void act()
    {
        if(Greenfoot.isKeyDown("space")){
            FishingWorld fWorld = new FishingWorld();
            Greenfoot.setWorld(fWorld);
        }
    }
}
