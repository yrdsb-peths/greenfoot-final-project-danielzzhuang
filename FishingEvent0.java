import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FishingEvent0 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FishingEvent0 extends Actor
{
    GreenfootImage[] idleFishingEvent0 = new GreenfootImage[4];
    /**
     * Act - do whatever the FishingEvent0 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    SimpleTimer animationTimer_event0 = new SimpleTimer();
    public FishingEvent0(){
            for(int i=0; i < idleFishingEvent0.length; i++){
            idleFishingEvent0[i] = new GreenfootImage("images/fishingEvent0_idle/fishing" + i + ".png");
            setImage(idleFishingEvent0[i]);
            idleFishingEvent0[i].scale(250, 250);
        }
        animationTimer_event0.mark();
    }
    int imageIndex_f=0;
    public void animateFishingRod(){
        if(animationTimer_event0.millisElapsed() < 1300){
            return;
        }
        animationTimer_event0.mark();
        setImage(idleFishingEvent0[imageIndex_f]);
        imageIndex_f = (imageIndex_f + 1) % idleFishingEvent0.length;
    }
    public void act()
    {
        animateFishingRod();
    }
}
