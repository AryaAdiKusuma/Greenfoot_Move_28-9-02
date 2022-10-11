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
    private int vx = 0;
    public Enemy(){
        setRotation(180);
    }
    public Enemy(int v){
        vx=v;
    }
    public void addedToWorld (World MyWorld)
    {
        setRotation(180);
    }
    public void move(){
        setLocation(getX()+vx, getY());
    }
    public void act()
    {
        World w = getWorld();
        move();
        
        if(isAtEdge()){
           w.removeObject(this); 
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
