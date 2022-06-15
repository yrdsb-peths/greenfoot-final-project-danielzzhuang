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
    private static int[] amountFish = new int[14];
    GreenfootImage[] images = new GreenfootImage[14];

    public Fish(int fishNumber, String name){
        for(int i = 0; i < images.length; i++){
            images[i] = new GreenfootImage("images/fish/fish" + i +".png");
        }
        setImage(images[fishNumber]);
        fishNumber = fishNumber;
        fishName = name;
        
        amountFish[fishNumber]++;
    }
    public void addAmountFish(int num){
        AmountFish[num]++;
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
