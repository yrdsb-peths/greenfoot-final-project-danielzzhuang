import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Fishing here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class FishingWorld extends World
{
    /**
     * Constructor for objects of class Fishing.
     * 
     */
    public boolean backpackOpen=false;
    public FishingWorld(){
        super(900,600,1);
        
        addCat();
        
        BackPackPage bkPage = new BackPackPage();
        if(Greenfoot.isKeyDown("B")){
            addObject(bkPage, 450, 300);
            backpackOpen=true;
            if(Greenfoot.isKeyDown("B")){
                removeObject(bkPage);
            }
        }
        /*
        Fish clownFish = new Fish(0, "clownFish");
        Fish blueFish = new Fish(1, "blueFish");
        Fish greenFish = new Fish(2, "greenFish");
        Fish pufferFish = new Fish(3, "pufferFish");
        Fish yellowFish = new Fish(4, "yellowFish");
        Fish anglerFish = new Fish(5, "anglerFish");
        Fish greenOrangeFish = new Fish(6, "greenOrangeFish");
        Fish yellowRedFish = new Fish(7, "yellowRedFish");
        Fish greenRedFish = new Fish(8, "greenRedFish");
        Fish grayFish = new Fish(9, "grayFish");
        Fish redFish = new Fish(10, "redFish");
        Fish flyingFish = new Fish(11, "flyingFish");
        Fish yellowGrayFish = new Fish(12, "yellowGrayFish");
        Fish duck = new Fish(13, "duck");
        */
    }
    public void addCat()
    {
        Cat cat = new Cat();
        addObject(cat,250,560);
    }
    
    public void addFish(){
        
    }
    
}
