import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * 
 * This class make image from the folder and turn it into an animated.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FishingRodCast extends Actor
{
    GreenfootImage[] idleCastRod = new GreenfootImage[4];
    SimpleTimer animationTimer_cast = new SimpleTimer();
    
    /**
     * Act - do whatever the FishingRod wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public FishingRodCast()
    {    
        for(int i=0; i < idleCastRod.length; i++){
            idleCastRod[i] = new GreenfootImage("images/castRod_idle/castRod" + i + ".png");
            setImage(idleCastRod[i]);
            idleCastRod[i].scale(250, 250);
        }
        animationTimer_cast.mark();

    }
    int imageIndex_f=0;
    public void animateFishingRod(){
        if(animationTimer_cast.millisElapsed() < 100){
            return;
        }
        animationTimer_cast.mark();
        setImage(idleCastRod[imageIndex_f]);
        imageIndex_f = (imageIndex_f + 1) % idleCastRod.length;
    }
    public void hide(){
        setLocation(284, 1200);
    }
    public void show(){
        setLocation(284, 500);
    }
    public void act()
    {
        animateFishingRod();
    }
}
