import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CastFishingRod here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CastFishingRod extends Actor
{
    GreenfootImage[] idleCastRod = new GreenfootImage[4];
    SimpleTimer animationTimer_cast = new SimpleTimer();
    /**
     * Act - do whatever the FishingRod wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void CastFishingRod()
    {    
        for(int i=0; i < idleCastRod.length; i++){
            idleCastRod[i] = new GreenfootImage("images/fcastRod_idle/castRod" + i + ".png");
            setImage(idleCastRod[i]);
            idleCastRod[i].scale(250, 250);
        }
        animationTimer_cast.mark();

    }
    int imageIndex_f=0;
    public void animateFishingRod(){
        if(animationTimer_cast.millisElapsed() < 1300){
            return;
        }
        animationTimer_cast.mark();
        setImage(idleCastRod[imageIndex_f]);
        imageIndex_f = (imageIndex_f + 1) % idleCastRod.length;
    }
    public void act()
    {
        animateFishingRod();
    }
}
