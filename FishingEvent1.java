import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class make image from the folder and turn it into an animated.
 * hide and show is method that set location of this animated actor.
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FishingEvent1 extends Actor
{
    GreenfootImage[] idleFishingEvent1 = new GreenfootImage[4];
    /**
     * Act - do whatever the FishingEvent1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    SimpleTimer animationTimer_event1 = new SimpleTimer();
    public FishingEvent1(){
            for(int i=0; i < idleFishingEvent1.length; i++){
            idleFishingEvent1[i] = new GreenfootImage("images/fishingEvent1_idle/fishing" + i + ".png");
            setImage(idleFishingEvent1[i]);
            idleFishingEvent1[i].scale(250, 250);
        }
        animationTimer_event1.mark();
    }
    int imageIndex_f=0;
    public void animateFishingRod(){
        if(animationTimer_event1.millisElapsed() < 300){
            return;
        }
        animationTimer_event1.mark();
        setImage(idleFishingEvent1[imageIndex_f]);
        imageIndex_f = (imageIndex_f + 1) % idleFishingEvent1.length;
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
