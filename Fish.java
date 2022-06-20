import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * this is a fish class that include: amount of fish and fish image 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish extends Actor
{
    private String fishName;
    private int fishNumber;
    public static int[] amountFish = new int[14];

    public Fish(int fishNumber, String name){
        fishNumber = fishNumber;
        fishName = name;
        
    }
    //this method 2ill increase the fish amount of the input number type by 1
    public void addAmountFish(int num){
        amountFish[num]++;
    }
    /**
     * Act - do whatever the ClownFish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
}
