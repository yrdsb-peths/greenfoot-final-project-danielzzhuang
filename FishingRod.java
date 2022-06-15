import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FishingRod here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FishingRod extends Actor
{
    /**
     * Act - do whatever the FishingRod wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[] idleFishingRod = new GreenfootImage[3];
    GreenfootImage[] idleFishingType0 = new GreenfootImage[3];
    SimpleTimer animationTimer_FishingRod = new SimpleTimer();

    public FishingRod()
    {    
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

    public void act()
    {

        if(Greenfoot.isKeyDown("r")){

        }
    }

    public void startFishing(){

        if(Greenfoot.isKeyDown("space")){
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
    }
}
