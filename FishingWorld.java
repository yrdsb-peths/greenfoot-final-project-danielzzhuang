import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * v0.1 is a simple game where you tap to get fish.
 * v1.0 is game that a version of the game where the main function cannot be implemented.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class FishingWorld extends World
{
    GreenfootSound bgm = new GreenfootSound("snowyBGM.mp3");
    GreenfootSound watert = new GreenfootSound("Watert.mp3");
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
    
    public int randomFishingEvent;
    public int randomFish;
    
    public int fristRod_x=174;
    public int fristRod_y=194;
    public int secondRod_y=fristRod_y+1*174;
    public int thridRod_y=548;
    
    SimpleTimer backpackTimer = new SimpleTimer();
    SimpleTimer fishingTimer = new SimpleTimer();
    SimpleTimer catchFishTimer_0 = new SimpleTimer();
    SimpleTimer catchFishTimer_1 = new SimpleTimer();
    SimpleTimer catchFishTimer_2 = new SimpleTimer();
    SimpleTimer waitingFishTimer = new SimpleTimer();
    SimpleTimer startFishingTimer_hide = new SimpleTimer();
    SimpleTimer startFishingTimer_show = new SimpleTimer();
    SimpleTimer hideFihsingEvent = new SimpleTimer();
    
    
    /*
     * set up world, cat, fishing event, backpack[age, waiting fish, wait for fishing.
     */
    public FishingWorld(){
        super(900,600,1, false);

        Label exLabel = new Label("", 40);
        addObject(exLabel, 450, 450);
    
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
    public void addFish(){
        randomFish = Greenfoot.getRandomNumber(13);
        fish.addAmountFish(randomFish);
    }
    
    
    
    public void act(){
        /*
         * During the fishing process, randomly generate a fishing event to get fish
         */
    bgm.play();
    /*v0.1
    if(Greenfoot.isKeyDown("f")){
        addFish();
    }
    */
   
    
    if(Greenfoot.isKeyDown("f")){
        isFishing = true;
        fishingRodCast.show();
        showText("hihi", 300, 500);
        startFishingTimer_show.mark();
    }
    if(startFishingTimer_hide.millisElapsed() > 450){
            fishingRodCast.hide();
            showText("hi", 500, 500);
            startFishingTimer_hide.mark();
    }
        if(fishingTimer.millisElapsed() > 2000){
            if(isFishing){
                if(fishingTimer.millisElapsed() > 1000){
                    randomFishingEvent = Greenfoot.getRandomNumber(100);
                    if(randomFishingEvent >= 40 && randomFishingEvent <= 60){
                        fishingEvent0.show();
                        watert.play();
                        if(catchFishTimer_0.millisElapsed() > 3000){
                            if(Greenfoot.isKeyDown("space")){
                                addFish();
                            }
                        }
                        watert.play();
                        catchFishTimer_0.mark();
                        fishingEvent0.hide();
                    }
                    else if(randomFishingEvent >= 60 && randomFishingEvent <= 80){ 
                        fishingEvent1.show();
                        watert.play();
                        if(catchFishTimer_1.millisElapsed() > 3000){
                            if(Greenfoot.isKeyDown("space")){
                                addFish();
                                
                            }
                            
                        }
                        watert.play();
                        catchFishTimer_1.mark();
                        fishingEvent1.hide();
                        
                    }
                    else if(randomFishingEvent >= 80 && randomFishingEvent <= 100)
                    {
                        fishingEvent2.show();
                        watert.play();
                        if(catchFishTimer_2.millisElapsed() > 3000){
                            if(Greenfoot.isKeyDown("space")){
                                addFish();
                                
                            }
                            
                        }
                        watert.play();
                        catchFishTimer_2.mark();
                        fishingEvent2.hide();
                        
                    }   
                    else{
                        if(fishingTimer.millisElapsed() > 5000){
                            fishingRodWaiting.show();
                        }
                        watert.play();
                    }
                }
                isFishing=false;
            }
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
