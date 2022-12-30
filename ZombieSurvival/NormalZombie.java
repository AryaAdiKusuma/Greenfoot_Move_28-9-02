import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Zombie2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NormalZombie extends Zombie
{
    private int animateImage = 0;
    private int health = 2;
    private int count = 0;
    private int animateSpeed = 5;
    private int speed = 5;

   public NormalZombie(){
       super();
       setMaxHealth(health);
       setImage("skeleton-idle_16.png");
        getImage().scale(63, 63);
        
   }
    
    public void act()
    {
         animate();
         if(getWorld().getWidth() == 1000){
             death(speed);
         }else if(getWorld().getWidth() == 1001){
             death2(speed);
         }else if(getWorld().getWidth() == 1002){
             death3 (speed);
         }else if(getWorld().getWidth() == 1003){
             death4 (speed);
         } 
         
    }
    private void animate(){
        if(count % animateSpeed == 0){
            if(animateImage > 16){
                animateImage = 0;
            }
            setImage("skeleton-move_" + animateImage + ".png");
            animateImage++;
            getImage().scale(63, 63);
        }
    }
}
