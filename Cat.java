import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * this is a animated cat, also used to test when user start fishing
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cat extends Actor
{
    GreenfootImage[] idleGrayCat = new GreenfootImage[6];
    /**
     * Act - do whatever the Cat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    SimpleTimer animationTimer_grayCat = new SimpleTimer();
    
    public Cat(){
        for(int i=0; i<idleGrayCat.length; i++){
            idleGrayCat[i] = new GreenfootImage("images/grayCatStandBy_idle/cat" + i + ".png");
            setImage(idleGrayCat[i]);
            idleGrayCat[i].scale(180, 180);
        }
        animationTimer_grayCat.mark();
    }
    int imageIndex=0;
    public void animateCat(){
        if(animationTimer_grayCat.millisElapsed() < 1300){
            return;
        }
        animationTimer_grayCat.mark();
        setImage(idleGrayCat[imageIndex]);
        imageIndex = (imageIndex + 1) % idleGrayCat.length;
    }

    public void act(){
        animateCat();
    }
}