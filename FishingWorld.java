import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Fishing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class FishingWorld extends World
{
    boolean isFishing = false;
    boolean canCatchFish = false;
    /**
     * Constructor for objects of class Fishing.
     * 
     */
    
    GreenfootImage[] idleRodWaiting = new GreenfootImage[3];
    GreenfootImage[] idleFishingType0 = new GreenfootImage[4];
    GreenfootImage[] idleFishingType1 = new GreenfootImage[4];
    GreenfootImage[] idleFishingType2 = new GreenfootImage[3];
    
    SimpleTimer animationTimer_FishingRod = new SimpleTimer();
    public boolean backpackOpen=false;
    
    
    public FishingWorld(){
        super(900,600,1);
        
        addCat();
        
        BackPackPage bkPage = new BackPackPage();
        if(Greenfoot.isKeyDown("b")){
            addObject(bkPage, 450, 300);
            backpackOpen=true;
            if(Greenfoot.isKeyDown("b")){
                removeObject(bkPage);
            }
        }
        /*
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
        */
    }
    public void addCat()
    {
        Cat cat = new Cat();
        addObject(cat,250,560);
    }
    /*
    public void startFishing(){
        if(Greenfoot.isKeyDown("s")){
            int randomFishingType = Greenfoot.getRandomNumber(10);
            if(randomFishingType==0){

                if(Greenfoot.isKeyDown("space")){
                    int randomFish = Greenfoot.getRandomNumber(15);
                    addAmountFish(randomFish);
                }
                else{
                    animateFishingRod();
                }
            }
        }
    }*/
    
    public void beginFishing(){
        CastFishingRod.animateFishingRod();
        isFishing = true;
    }
    
    
    
    public void act(){
        if(isFishing){
            // 
            if (!canCatchFish) {
                //randomnumber from 0 - 100
                // if number > 95 then
                //    show the animiated rod
                //    canCatchFish = true
            }
            
        }
        if(canCatchFish){
            if(Greenfoot.isKeyDown("space")){
                // do whatever to catch fish
            }
        }
    }
}
