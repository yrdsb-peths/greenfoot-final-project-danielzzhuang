import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class snowyMountian_Night here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class snowyMountian_Night extends World
{
    public BackPackPage backpack;
    public boolean backpackOpen=false;
    public Fish fish;
    
    public int randomFish;
    
    public int fristRod_x=174;
    public int fristRod_y=194;
    public int secondRod_y=fristRod_y+1*174;
    public int thridRod_y=548;
    
    SimpleTimer backpackTimer = new SimpleTimer();
    
    GreenfootSound bgm = new GreenfootSound("snowyBGM.mp3");
    /**
     * Constructor for objects of class snowyMountian_Night.
     * 
     */
    public snowyMountian_Night()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        super(900, 600, 1, false);
        SnowyMountianBackground sBG = new SnowyMountianBackground();
        addObject(sBG, getWidth()/2, getHeight()/2);
        
        backpack = new BackPackPage();        
        addObject(backpack, 900, 900);
        
        fish = new Fish(0, "fish");
    }
    public void addFish(){
        randomFish = Greenfoot.getRandomNumber(13);
        fish.addAmountFish(randomFish);
    }
    public void act(){
        bgm.play();
        if(Greenfoot.isKeyDown("f")){
        addFish();
        }
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
       if(backpackTimer.millisElapsed() > 300){
            if(Greenfoot.isKeyDown("b")){
                backpackOpen=!backpackOpen;
                backpackTimer.mark();
            }
        }
    }
}
