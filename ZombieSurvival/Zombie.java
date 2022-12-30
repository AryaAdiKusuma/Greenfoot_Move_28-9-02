import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Zombie here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 * 
 */
public  abstract class Zombie extends Actor
{
    
    Player player;
    private int health = -1;
    public int invisibleTime =0;
    public Zombie(){
    
    }
    public void act()
    {
        
         
    }
    protected void death(int speed){
        if(this != null){
             invisibleTime--;
            if(health==0){
                MyWorld myWorld =  (MyWorld)  getWorld();
                myWorld.killedZombie();
                getWorld().removeObject(this);
            }else {
                chase(speed);
            }
         }
    }
    protected void death2(int speed){
        if(this != null){
             invisibleTime--;
            if(health==0){
                Stage2 stage2 =  (Stage2)  getWorld();
                stage2.killedZombie();
                getWorld().removeObject(this);
            }else {
                chase(speed);
            }
         }
    }
    protected void death3(int speed){
        if(this != null){
             invisibleTime--;
            if(health==0){
                Stage3 stage3 =  (Stage3)  getWorld();
                stage3.killedZombie();
                getWorld().removeObject(this);
            }else {
                chase(speed);
            }
         }
    }
    protected void death4(int speed){
        if(this != null){
             invisibleTime--;
            if(health==0){
                FinalStage finalStage =  (FinalStage)  getWorld();
                finalStage.killedZombie();
                getWorld().removeObject(this);
            }else {
                chase(speed);
            }
         }
    }
    protected void chase(int speed){
        int damage = 1;
        List players = getWorld().getObjects(Player.class);
        if(!players.isEmpty()){
           Actor player = (Actor)players.get(0);
            turnTowards(player.getX(), player.getY());
            move(speed); 
            if(isTouching(Player.class)){
                if(invisibleTime <=0){
                    Player p= (Player) player;
                    Greenfoot.playSound("playerGetHit2.wav");
                    p.getHit(damage);
                    invisibleTime=30;
                }  
            }
        }
        
    }
    
    public void setMaxHealth(int health){
        this.health = health;
    }
    public void setHealth(int damage){
        health=health-damage;
    }
}
