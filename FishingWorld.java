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
    
    public BackPackPage backpack;
    public Fish fish;
    public FishingRodWaiting fishingRodWaiting;
    public FishingRodStay fishingRodStay;
    public FishingEvent0 fishingEvent0;
    public FishingEvent1 fishingEvent1;
    public FishingEvent2 fishingEvent2;
    
    public int fristRod_x=174;
    public int fristRod_y=194;
    public int secondRod_y=fristRod_y+1*174;
    public int thridRod_y=548;
    public int fish11_num=Fish.amountFish[11];
    
    SimpleTimer backpackTimer = new SimpleTimer();
    SimpleTimer fishingTimer = new SimpleTimer();
    /**
     * Constructor for objects of class Fishing.
     * public
     */

    public FishingWorld(){
        super(900,600,1, false);

        

        Cat cat = new Cat();
        addObject(cat,250,560);
        
        backpack = new BackPackPage();        
        addObject(backpack, 450, 300);
        
        FishingRodWaiting fishingRodWaiting = new FishingRodWaiting();
        addObject(fishingRodWaiting, 284, 500);
        
        FishingEvent0 fishingEvent0 = new FishingEvent0();
        addObject(fishingEvent0, 284, 900);
        
        FishingEvent1 fishingEvent1 = new FishingEvent1();
        addObject(fishingEvent1, 284, 900);
        
        FishingEvent2 fishingEvent2 = new FishingEvent2();
        addObject(fishingEvent2, 284, 900);
        
        FishingRodStay fishingRodStay=new FishingRodStay();
        addObject(fishingRodStay, 284, 900);
        
        Label fish0_num = new Label(Fish.amountFish[0], 35);
        addObject(fish0_num, fristRod_x+0*138, fristRod_y);
        Label fish1_num = new Label(Fish.amountFish[1], 35);
        addObject(fish1_num, fristRod_x+1*138, fristRod_y);
        Label fish2_num = new Label(Fish.amountFish[2], 35);
        addObject(fish2_num, fristRod_x+2*138, fristRod_y);
        Label fish3_num = new Label(Fish.amountFish[3], 35);
        addObject(fish3_num, fristRod_x+3*138, fristRod_y);
        Label fish4_num = new Label(Fish.amountFish[4], 35);
        addObject(fish4_num, fristRod_x+4*138, fristRod_y);
        
        Label fish5_num = new Label(Fish.amountFish[5], 35);
        addObject(fish5_num, fristRod_x+0*138, secondRod_y);
        Label fish6_num = new Label(Fish.amountFish[6], 35);
        addObject(fish6_num, fristRod_x+1*138, secondRod_y);
        Label fish7_num = new Label(Fish.amountFish[7], 35);
        addObject(fish7_num, fristRod_x+2*138, secondRod_y);
        Label fish8_num = new Label(Fish.amountFish[8], 35);
        addObject(fish8_num, fristRod_x+3*138, secondRod_y);
        Label fish9_num = new Label(Fish.amountFish[9], 35);
        addObject(fish9_num, fristRod_x+4*138, secondRod_y);
        
        Label fish10_num = new Label(Fish.amountFish[10], 35);
        addObject(fish10_num, fristRod_x+0*138, thridRod_y);
        Label fish11_num = new Label(Fish.amountFish[11], 35);
    }
    public void castFishingRod(){
        CastFishingRod fishingRod_c = new CastFishingRod();
        addObject(fishingRod_c, 284, 500);
    }
    public void catchFish(){
        if(fishingTimer.millisElapsed() > 3000){
            fishingEvent0.show();
            if(Greenfoot.isKeyDown("space")){
                int randomFish = Greenfoot.getRandomNumber(13);
                fish.addAmountFish(randomFish);
                fishingTimer.mark();
            }
        }
    }
    
    
    public void act(){
        /*
        if(isFishing){
            if (!canCatchFish) {
                fishingRodWaiting.show();
                int randomFishingEvent = Greenfoot.getRandomNumber(100);
                if(randomFishingEvent>=82 && randomFishingEvent<=88){
                    fishingRodWaiting.hide();
                    catchFish();
                    fishingEvent0.hide();
                }
                else if(randomFishingEvent>=88 && randomFishingEvent<=94){
                    fishingRodWaiting.hide();
                    catchFish();
                    fishingEvent1.hide();
                }
                else if(randomFishingEvent>=94 && randomFishingEvent<=100)
                {
                    fishingRodWaiting.hide();
                    catchFish();
                    fishingEvent2.hide();
                }
            }
        }*/
        
        if(backpackOpen){
            backpack.show();
            showText(String.valueOf(Fish.amountFish[11]), fristRod_x+1*138, thridRod_y);
        } else {
            backpack.hide();
        }

        if(backpackTimer.millisElapsed() > 300){
            if(Greenfoot.isKeyDown("b")){
                backpackOpen=!backpackOpen;
                backpackTimer.mark();
            }
        }

    }
}
