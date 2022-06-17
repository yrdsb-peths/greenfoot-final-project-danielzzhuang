import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FishingRodWaiting here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FishingRodWaiting extends Actor
{
    /**
     * Act - do whatever the FishingRodWaiting wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[] idleRodWaiting = new GreenfootImage[3];
    SimpleTimer animationTimer_waiting = new SimpleTimer();
    public FishingRodWaiting(){
            for(int i=0; i < idleRodWaiting.length; i++){
            idleRodWaiting[i] = new GreenfootImage("images/fishingRodWaiting_idle/fishingRod" + i + ".png");
            setImage(idleRodWaiting[i]);
            idleRodWaiting[i].scale(250, 250);
        }
        animationTimer_waiting.mark();
    }
    int imageIndex=0;
    public void animateFishingRod(){
        if(animationTimer_waiting.millisElapsed() < 1300){
            return;
        }
        animationTimer_waiting.mark();
        setImage(idleRodWaiting[imageIndex]);
        imageIndex = (imageIndex + 1) % idleRodWaiting.length;
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
