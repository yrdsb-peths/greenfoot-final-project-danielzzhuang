import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ClownFish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClownFish extends Actor
{
    public int clownFishNumber=0;
    /**
     * Act - do whatever the ClownFish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public int setClownFishNumber(int x){
        clownFishNumber+=x;
        return clownFishNumber;
    }
    
}
