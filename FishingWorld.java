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
    public boolean backpackOpen=false;
    public boolean fishingRodExist=false;
    /**
     * Constructor for objects of class Fishing.
     * 
     */
    
    public FishingWorld(){
        super(900,600,1);
        
        addCat();
        

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
    
    public void castFishingRod(){
        CastFishingRod fishingRod_c = new CastFishingRod();
        addObject(fishingRod_c, 280, 500);
    }
    
    public void fishingRodWaiting(){
        FishingRodWaiting fishingRod_w = new FishingRodWaiting();
        addObject(fishingRod_w, 284, 500);
    }
    
    public void fishingEvent0(){
        FishingEvent0 fishingEvent0 = new FishingEvent0();
        addObject(fishingEvent0, 284, 500);
    }
    
    public void fishingEvent1(){
        FishingEvent1 fishingEvent1 = new FishingEvent1();
        addObject(fishingEvent1, 284, 500);
    }
    
    public void fishingEvent2(){
        FishingEvent2 fishingEvent2 = new FishingEvent2();
        addObject(fishingEvent2, 284, 500);
    }
    
    public void fishingRodStay(){
        FishingRodStay fishingRodStay=new FishingRodStay();
        addObject(fishingRodStay, 284, 500);
    }
    
    
    public void backpackPage(){
        BackPackPage bkPage = new BackPackPage();
        if(backpackOpen){
            addObject(bkPage, 450, 300);
        }
        else{
            removeObject(bkPage);
        }
    }
    
    
    
    public void act(){
        
        if(isFishing){
            if (!canCatchFish) {
                fishingRodWaiting();
                int randomFishingEvent = Greenfoot.getRandomNumber(100);
                if(randomFishingEvent>82){
                    
                }
                else{
                    canCatchFish=true;
                    if(randomFishingEvent>=82 && randomFishingEvent<=88){
                        fishingEvent0();
                    }
                    else if(randomFishingEvent>=88 && randomFishingEvent<=94){
                        fishingEvent1();
                    }
                    else{
                        fishingEvent2();
                    }
                }
            }
            if(canCatchFish){
                if(Greenfoot.isKeyDown("space")){
                    int randomFish = Greenfoot.getRandomNumber(13);
                    
                }
            }
        }
        
        
        if(Greenfoot.isKeyDown("b")){
            backpackOpen=true;
            backpackPage();
            if(Greenfoot.isKeyDown("b")){
                backpackOpen=false;
                backpackPage();
            }
        }
    }
}
