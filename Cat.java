import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cat extends Actor
{
    GreenfootImage[] idleLeft = new GreenfootImage[9];
    GreenfootImage[] idleRight = new GreenfootImage[9];
    /**
     * Act - do whatever the Cat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private final int GRAVITY = 1;
    private int velocity;
    
    String facing = "left";
    SimpleTimer animationTimer = new SimpleTimer();
    public Cat(){
        for(int i = 0; i < idleLeft.length; i++){
            idleLeft[i] = new GreenfootImage("images/grayCat_idle/cat" + i + ".png");
            idleLeft[i].scale(80, 80);
        }
        for(int i=0; i<idleRight.length; i++){
            idleRight[i] = new GreenfootImage("images/grayCat_idle/cat" + i + ".png");
            idleRight[i].mirrorHorizontally();
            idleRight[i].scale(80, 80);
        }
        animationTimer.mark();
        setImage(idleLeft[0]);
    }
    int imageIndex=0;
    public void animateCat(){
        if(animationTimer.millisElapsed() < 20){
            return;
        }
        animationTimer.mark();
        if(facing.equals("right")){
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
        else{
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
    }

    public void act()
    {
        fall();
        move();
        if(Greenfoot.isKeyDown("space") && getY()>getWorld().getHeight()-50){
            jump();
        }
        animateCat();
    }

    public void move(){
        int x=getX();
        int y=getY();
        /*if(Greenfoot.isKeyDown("W")){
        y-=2;
        }
        if(Greenfoot.isKeyDown("S")){
        y+=2;
        }
         */
        if(Greenfoot.isKeyDown("A")){
            facing = "left";
            x-=4;
        }
        if(Greenfoot.isKeyDown("D")){
            facing = "right";
            x+=4;
        }
        setLocation(x,y);
    }

    public void fall(){
        setLocation(getX(), getY() + velocity);
        if(getY()>getWorld().getHeight()-50){
            velocity=0;
        }
        else{
            velocity+=GRAVITY;
        }
    }

    public void jump(){
        velocity = -10;
    }

}
