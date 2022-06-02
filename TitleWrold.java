import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleWrold here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TitleWrold extends World
{

    /**
     * Constructor for objects of class TitleWrold.
     * 
     */
    public TitleWrold()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Label titleLabel = new Label("Cat", 80);
        addObject(titleLabel, 300, 180);
        Label instructionLabel = new Label("Press <space> to begin", 50);
        addObject(instructionLabel, 300, 240);
        Label elephantInstructionLabel = new Label("press <A>, <D>, <Space> to move and jump", 30);
        addObject(elephantInstructionLabel, 300, 300);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("space")){
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
    }
}
