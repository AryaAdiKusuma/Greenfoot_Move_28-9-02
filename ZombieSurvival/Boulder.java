import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Boulder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Boulder extends Actor
{
    /**
     * Act - do whatever the Boulder wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int damage = 2;
    public Boulder(){
        
    }
    public void act()
    {
        move(8);
        hitPlayer(damage);
    }
    private void hitPlayer(int damage){
        if(isTouching(Player.class)){
            Player player = (Player)getOneIntersectingObject(Player.class);
            player.getHit(damage);
            getWorld().removeObject(this);
        }else if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
