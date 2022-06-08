import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fishing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Fishing extends World
{
    public int totalFish=0;
    /**
     * Constructor for objects of class Fishing.
     * 
     */
    public Fishing()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        if(Greenfoot.isKeyDown("space")){
            int randomFishGroup = Greenfoot.getRandomNumber(3);
            if(randomFishGroup==0){
                fishGroup0();
                totalFish++;
            }
            else if(randomFishGroup==1){
                fishGroup1();
                totalFish++;
            }
            else{
                fishGroup2();
                totalFish++;
            }
        }
    }
    public void fishGroup0(){
        
    }
    public void fishGroup1(){
        
    }
    public void fishGroup2(){
        
    }
}
