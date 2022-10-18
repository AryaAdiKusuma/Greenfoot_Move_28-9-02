import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Enemy(int speed){
        setRotation(180);
        this.speed = speed;
    }
    public Enemy(){
        setRotation(180);
    }
    public int speed = 5;
    public void act()
    {
        move(speed);
        if(isAtEdge()){
           getWorld().removeObject(this); 
        }
        
    }
    public void ramdomMove(){
        if (Greenfoot.getRandomNumber(100)<10)
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
        if (getX()<= 5 || getX() >= getWorld().getWidth() -5)
        {
            turn(180);
        }
        if (getY()<= 5 || getY() >= getWorld().getHeight() -5)
        {
            turn(180);
        }
    }

}
