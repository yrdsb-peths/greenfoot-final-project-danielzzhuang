import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class make image from the folder and turn it into an animated.
 * hide and show is method that set location of this animated actor.
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FishingEvent2 extends Actor
{
    GreenfootImage[] idleFishingEvent2 = new GreenfootImage[3];
    /**
     * Act - do whatever the FishingEvent2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    SimpleTimer animationTimer_event2 = new SimpleTimer();
    public FishingEvent2(){
            for(int i=0; i < idleFishingEvent2.length; i++){
            idleFishingEvent2[i] = new GreenfootImage("images/fishingEvent2_idle/fishing" + i + ".png");
            setImage(idleFishingEvent2[i]);
            idleFishingEvent2[i].scale(250, 250);
        }
        animationTimer_event2.mark();
    }
    int imageIndex_f=0;
    public void animateFishingRod(){
        if(animationTimer_event2.millisElapsed() < 300){
            return;
        }
        animationTimer_event2.mark();
        setImage(idleFishingEvent2[imageIndex_f]);
        imageIndex_f = (imageIndex_f + 1) % idleFishingEvent2.length;
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
