import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class FastZombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FastZombie extends Zombie
{
    /**
     * Act - do whatever the FastZombie wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public int health=1;
    public int invisibleTime =0;
    GreenfootImage zombie1 = new GreenfootImage("zomm1fix.png");
    GreenfootImage zombie2 = new GreenfootImage("zomm2fix.png");
    private int speed = 7;
    private int frame = 1;
    public int aniCounter = 0;
    public FastZombie(){
        super();
        setMaxHealth(health);
    }
    public void act()
    {
       if(getWorld().getWidth() == 1000){
             death(speed);
         }else if(getWorld().getWidth() == 1001){
             death2(speed);
         }else if(getWorld().getWidth() == 1002){
             death3 (speed);
         }else if(getWorld().getWidth() == 1003){
             death4 (speed);
         }
        
        aniCounting();
        aniCounter = aniCounter +1;
    }
    
    public void animate(){
        if(frame == 1){
            setImage(zombie1);
            getImage().scale(55, 55);
            frame = 2;
        }else if(frame == 2){
            setImage(zombie2);
            getImage().scale(55, 55);
            frame = 1;
        }
    }
    public void aniCounting(){
        if(aniCounter % 6 == 0){
                animate();
            }
    }
    
}
