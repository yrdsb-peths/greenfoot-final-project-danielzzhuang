import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * This class make image from the folder and turn it into an animated.
 * hide and show is method that set location of this animated actor.
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FishingRodStay extends Actor
{
    GreenfootImage[] idleFishingRodStay = new GreenfootImage[2];
    /**
     * Act - do whatever the FishingEvent2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    SimpleTimer animationTimer_stay = new SimpleTimer();
    public FishingRodStay(){
            for(int i=0; i < idleFishingRodStay.length; i++){
            idleFishingRodStay[i] = new GreenfootImage("images/fishingEvent2_idle/fishing" + i + ".png");
            setImage(idleFishingRodStay[i]);
            idleFishingRodStay[i].scale(250, 250);
        }
        animationTimer_stay.mark();
    }
    int imageIndex=0;
    public void animateFishingRod(){
        if(animationTimer_stay.millisElapsed() < 300){
            return;
        }
        animationTimer_stay.mark();
        setImage(idleFishingRodStay[imageIndex]);
        imageIndex = (imageIndex + 1) % idleFishingRodStay.length;
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
