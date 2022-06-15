import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CastFishingRod here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CastFishingRod extends FishingWorld
{
    GreenfootImage[] idleCastRod = new GreenfootImage[4];
    SimpleTimer animationTimer_cast = new SimpleTimer();
    /**
     * Constructor for objects of class CastFishingRod.
     * 
     */
    public void CastFishingRod()
    {    
        for(int i=0; i < idleCastRod.length; i++){
            idleCastRod[i] = new GreenfootImage("images/fcastRod_idle/castRod" + i + ".png");
            setImage(idleCastRod[i]);
            idleCastRod[i].scale(120, 120);
        }
        animationTimer_FishingRod.mark();

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
}
