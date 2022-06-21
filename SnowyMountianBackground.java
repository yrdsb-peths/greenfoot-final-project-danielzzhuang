import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SnowyMountianBackground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnowyMountianBackground extends Actor
{
    GreenfootImage[] snowyMountianidle = new GreenfootImage[2];
    SimpleTimer animationTimer_sBG = new SimpleTimer();
    /**
     * Act - do whatever the SnowyMountianBackground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        animateSnowyMountianBackground();
    }
    public SnowyMountianBackground(){
        for(int i = 0; i < snowyMountianidle.length; i++){
            snowyMountianidle[i] = new GreenfootImage("images/snowyNightTimeMountian_idle/snowyNightTimeMountian" + i + ".png");
            snowyMountianidle[i].scale(900,600);
            setImage(snowyMountianidle[i]);
        }
        animationTimer_sBG.mark();
    }
    int imageIndex=0;
    public void animateSnowyMountianBackground(){
        if(animationTimer_sBG.millisElapsed() < 1200){
            return;
        }
        animationTimer_sBG.mark();
        setImage(snowyMountianidle[imageIndex]);
        imageIndex = (imageIndex + 1) % snowyMountianidle.length;
    }
}
