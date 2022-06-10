import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ClownFish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Actor
{
    public static int clownFishNumber=0;
    GreenfootImage[] images = new GreenfootImage[14];
    String [] fishNameArr = {"clownFish", ""};
    private String fishName;
    private int fishNumber;
    public Fish(int fishNum){
        for(int i = 0; i < images.length; i++){
            images[i] = new GreenfootImage("images/fish/Fish" + i +".png");
        }
        setImage(images[fishNum]);
        fishName = fishNameArr[fishNum];
        fishNumber=0;
    }
    
    /**
     * Act - do whatever the ClownFish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public int setFishNum(int fishNum, int amount){
        
    }
}
