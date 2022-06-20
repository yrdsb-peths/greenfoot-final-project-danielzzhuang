import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * 
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class FishingWorld extends World
{
    
    public boolean isFishing = false;
    public boolean canCatchFish = false;
    public boolean backpackOpen=false;
    public boolean fishingRodExist=false;
    public boolean endFishing=false;
    
    public BackPackPage backpack;
    public Fish fish;
    public FishingRodWaiting fishingRodWaiting;
    public FishingRodStay fishingRodStay;
    public FishingRodCast fishingRodCast;
    public FishingEvent0 fishingEvent0;
    public FishingEvent1 fishingEvent1;
    public FishingEvent2 fishingEvent2;
    
    public int fristRod_x=174;
    public int fristRod_y=194;
    public int secondRod_y=fristRod_y+1*174;
    public int thridRod_y=548;
    
    SimpleTimer backpackTimer = new SimpleTimer();
    SimpleTimer fishingTimer = new SimpleTimer();
    SimpleTimer catchFishTimer = new SimpleTimer();
    SimpleTimer waitingFishTimer = new SimpleTimer();
    SimpleTimer startFishingTimer_hide = new SimpleTimer();
    SimpleTimer startFishingTimer = new SimpleTimer();
    /*
     * set up world, cat, fishing event, backpack[age, waiting fish, wait for fishing.
     */
    public FishingWorld(){
        super(900,600,1, false);

        Cat cat = new Cat();
        addObject(cat,250,560);
        
        fish = new Fish(0, "fish");
        
        backpack = new BackPackPage();        
        addObject(backpack, 900, 900);
        
        fishingRodWaiting = new FishingRodWaiting();
        addObject(fishingRodWaiting, 284, 900);
        
        fishingEvent0 = new FishingEvent0();
        addObject(fishingEvent0, 284, 900);
        
        fishingEvent1 = new FishingEvent1();
        addObject(fishingEvent1, 284, 900);
        
        fishingEvent2 = new FishingEvent2();
        addObject(fishingEvent2, 284, 900);
        
        fishingRodStay = new FishingRodStay();
        addObject(fishingRodStay, 284, 900);
        
        fishingRodCast = new FishingRodCast();
        addObject(fishingRodCast, 284, 900);
    }
    /*
     * set a timer to wait user catch fish
     */
    public void catchFish(){
        if(catchFishTimer.millisElapsed() > 300){
            fishingEvent0.show();
            if(Greenfoot.isKeyDown("space")){
                int randomFish = Greenfoot.getRandomNumber(13);
                fish.addAmountFish(randomFish);
                catchFishTimer.mark();
            }
        }
    }
    
    
    public void act(){
        /*
         * During the fishing process, randomly generate a fishing event to get fish
         */
        
        
        
        
            if(Greenfoot.isKeyDown("f")){
                if(startFishingTimer_hide.millisElapsed() > 1300){
                    fishingRodCast.show();
                    showText("hihi", 800, 500);
                }
                fishingRodCast.hide();
                startFishingTimer_hide.mark();
                isFishing=true;
                showText("hi", 500, 500);
                startFishingTimer.mark();
            }
        
        if(isFishing && fishingTimer.millisElapsed() > 30000){
            if(!canCatchFish){
                //showText("hihi", 600, 500);
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
                else{
                    if(fishingTimer.millisElapsed() > 30000){
                        fishingRodWaiting.show();
                        if(Greenfoot.isKeyDown("R")){
                            
                        }
                    }
                }
            }
            fishingTimer.mark();
        }
        
        
        /*
         * test backpack open or not and serlocationto show the backpackbage and fishamount user have
         */
        
        if(backpackOpen){
            backpack.show();
            showText(String.valueOf(Fish.amountFish[0]), fristRod_x+0*138, fristRod_y);
            showText(String.valueOf(Fish.amountFish[1]), fristRod_x+1*138, fristRod_y);
            showText(String.valueOf(Fish.amountFish[2]), fristRod_x+2*138, fristRod_y);
            showText(String.valueOf(Fish.amountFish[3]), fristRod_x+3*138, fristRod_y);
            showText(String.valueOf(Fish.amountFish[4]), fristRod_x+4*138, fristRod_y);
            
            showText(String.valueOf(Fish.amountFish[5]), fristRod_x+0*138, secondRod_y);
            showText(String.valueOf(Fish.amountFish[6]), fristRod_x+1*138, secondRod_y);
            showText(String.valueOf(Fish.amountFish[7]), fristRod_x+2*138, secondRod_y);
            showText(String.valueOf(Fish.amountFish[8]), fristRod_x+3*138, secondRod_y);
            showText(String.valueOf(Fish.amountFish[9]), fristRod_x+4*138, secondRod_y);
            
            showText(String.valueOf(Fish.amountFish[10]), fristRod_x+0*138, thridRod_y);
            showText(String.valueOf(Fish.amountFish[11]), fristRod_x+1*138, thridRod_y);
            showText(String.valueOf(Fish.amountFish[12]), fristRod_x+2*138, thridRod_y);
        } else {
            backpack.hide();
            showText("", fristRod_x+0*138, fristRod_y);
            showText("", fristRod_x+1*138, fristRod_y);
            showText("", fristRod_x+2*138, fristRod_y);
            showText("", fristRod_x+3*138, fristRod_y);
            showText("", fristRod_x+4*138, fristRod_y);
            
            showText("", fristRod_x+0*138, secondRod_y);
            showText("", fristRod_x+1*138, secondRod_y);
            showText("", fristRod_x+2*138, secondRod_y);
            showText("", fristRod_x+3*138, secondRod_y);
            showText("", fristRod_x+4*138, secondRod_y);
            
            showText("", fristRod_x+0*138, thridRod_y);
            showText("", fristRod_x+1*138, thridRod_y);
            showText("", fristRod_x+2*138, thridRod_y);
        }

        /*
         * Control backpack test speed
         */
        
        if(backpackTimer.millisElapsed() > 300){
            if(Greenfoot.isKeyDown("b")){
                backpackOpen=!backpackOpen;
                backpackTimer.mark();
            }
        }

    }
}
