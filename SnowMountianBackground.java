import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class snowMountianBackGround here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SnowMountianBackground extends Actor
{
    GreenfootImage[] snowMountianidle = new GreenfootImage[5];
    SimpleTimer animationTimer_bg = new SimpleTimer();
    /**
     * Act - do whatever the snowMountianBackGround wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        animateSnowMountianBackground();
    }
    public SnowMountianBackground(){
        for(int i = 0; i < snowMountianidle.length; i++){
            snowMountianidle[i] = new GreenfootImage("images/snowMountian_idle/snowMountianBackGround" + i + ".png");
            snowMountianidle[i].scale(900,600);
            setImage(snowMountianidle[i]);
        }
        animationTimer_bg.mark();
    }
    int imageIndex=0;
    public void animateSnowMountianBackground(){
        if(animationTimer_bg.millisElapsed() < 1200){
            return;
        }
        animationTimer_bg.mark();
        setImage(snowMountianidle[imageIndex]);
        imageIndex = (imageIndex + 1) % snowMountianidle.length;
    }
}
