import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fishing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Fishing extends World
{
    
    /**
     * Constructor for objects of class Fishing.
     * 
     */
    GreenfootImage[] idleFishingRod = new GreenfootImage[3];
    SimpleTimer animationTimer_FishingRod = new SimpleTimer();
    
    public Fishing()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 600, 1); 
        for(int i=0; i<idleFishingRod.length; i++){
            idleFishingRod[i] = new GreenfootImage("images/fishingRodWaiting_idle/fishingRod" + i + ".png");
            setImage(idleFishingRod[i]);
            idleFishingRod[i].scale(120, 120);
        }
        animationTimer_FishingRod.mark();
        
    }
    int imageIndex_f=0;
    public void animateFishingRod(){
        if(animationTimer_FishingRod.millisElapsed() < 1300){
            return;
        }
        animationTimer_FishingRod.mark();
        setImage(idleFishingRod[imageIndex_f]);
        imageIndex_f = (imageIndex_f + 1) % idleFishingRod.length;
        }
    
    public void act(){
        animateFishingRod();
        if(Greenfoot.isKeyDown("space")){
            int randomFishingType = Greenfoot.getRandomNumber(3);
            if(randomFishingType==0){
                fishGroup0();
                
            }
            else if(randomFishingType==1){
                fishGroup1();
                
            }
            else{
                fishGroup2();
                
            }
        }
        Fish clownFish = new Fish(0, "clownFish");
        
        Fish blueFish = new Fish(1, "blueFish");
        Fish greenFish = new Fish(2, "greenFish");
        Fish pufferFish = new Fish(3, "pufferFish");
        Fish yellowFish = new Fish(4, "yellowFish");
        Fish anglerFish = new Fish(5, "anglerFish");
        Fish greenOrangeFish = new Fish(6, "greenOrangeFish");
        Fish yellowRedFish = new Fish(7, "yellowRedFish");
        Fish greenRedFish = new Fish(8, "greenRedFish");
        Fish grayFish = new Fish(9, "grayFish");
        Fish redFish = new Fish(10, "redFish");
        Fish flyingFish = new Fish(11, "flyingFish");
        Fish yellowGrayFish = new Fish(12, "yellowGrayFish");
        Fish duck = new Fish(13, "duck");
    }
    
    public void fishGroup0(){
        int randomFish = Greenfoot.getRandomNumber(5);
        addAmountFish(randomFish);
    }
    public void fishGroup1(){
        int randomFish = Greenfoot.getRandomNumber(5);
        addAmountFish(randomFish);
    }
    public void fishGroup2(){
        int randomFish = Greenfoot.getRandomNumber(5);
        addAmountFish(randomFish);
    }
}
