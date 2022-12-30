import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Zombie2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BosZombie extends Zombie
{
    private int animateImage = 0;
    private int health = 75;
    private int count = 0;
    private int animateSpeed = 1;
    private int speed = 1;
    private int time =0;
   public BosZombie(){
        super();
        setMaxHealth(health);
        setImage("skeleton-idle_16.png");
        getImage().scale(150, 150);
        
   }
    
    public void act()
    {
         animate();
         if(getWorld().getWidth() == 1003){
             if(time == 300){
                 throwBoulder();
                 time = 0;
             }
             killPlayer (speed);
         }
         time++;
         
    }
    private void animate(){
        if(count % animateSpeed == 0){
            if(animateImage > 16){
                animateImage = 0;
            }
            setImage("skeleton-move_" + animateImage + ".png");
            animateImage++;
            getImage().scale(150, 150);
        }
    }
    
    private void throwBoulder(){
        Boulder boulder = new Boulder();
            getWorld().addObject(boulder,getX(),getY()); 
            boulder.setRotation(getRotation());
    }
    protected void killPlayer(int speed){
        if(this != null){
             invisibleTime--;
            if(health==0){
                FinalStage finalStage =  (FinalStage)  getWorld();
                finalStage.setBossDeath();
                getWorld().removeObject(this);
            }else {
                chase(speed);
            }
         }
    }
    public void setHealth(int damage){
        health=health-damage;
    }

}
