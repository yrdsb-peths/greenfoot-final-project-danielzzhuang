import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ClownFish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Actor
{
    private String fishName;
    private int fishNumber;
    public Fish(int fishNum, String name){
        fishNumber = fishNum;
        fishName = name;
    }
    public void addFishNumber(int num){
        fishNumber+=num;
    }
    /**
     * Act - do whatever the ClownFish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    /*public int setFishNum(int fishNum, int amount){
        
    }*/
}
