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
        
        
        /* v1.0
        Label instructionLabel_0 = new Label("Press <f> to fish when you in game", 40);
        addObject(instructionLabel_0, getWidth()/2, 300);
        
        Label instructionLabel_1 = new Label("Press <space> to catch fish when fish hooked", 30);
        addObject(instructionLabel_1, getWidth()/2, 350);
        
        Label instructionLabel_2 = new Label("Press <r> to retract FishingRod", 40);
        addObject(instructionLabel_2, getWidth()/2, 400);
        
        Label instructionLabel_3 = new Label("Press <b> to open or close backpack", 40);
        addObject(instructionLabel_3, getWidth()/2, 450);
        
        Label instructionLabel_4 = new Label("Press <space> to begin", 30);
        addObject(instructionLabel_4, getWidth()/2, 500);
        */

        
        Label instructionLabel_0 = new Label("Press <f> to get fish", 40);
        addObject(instructionLabel_0, getWidth()/2, 300);
        
        Label instructionLabel_3 = new Label("Press <b> to open or close backpack", 40);
        addObject(instructionLabel_3, getWidth()/2, 450);
        
        Label instructionLabel_4 = new Label("Press <space> to begin", 30);
        addObject(instructionLabel_4, getWidth()/2, 500);
        
    }
    public void act()
    {
        
        if(Greenfoot.isKeyDown("space")){
            snowyMountian_Night sWorld = new snowyMountian_Night();
            Greenfoot.setWorld(sWorld);
        }
        
        /*v1.0
        if(Greenfoot.isKeyDown("space")){
            FishingWorld fWorld = new FishingWorld();
            Greenfoot.setWorld(fWorld);
        }
        */
       
    }
}
