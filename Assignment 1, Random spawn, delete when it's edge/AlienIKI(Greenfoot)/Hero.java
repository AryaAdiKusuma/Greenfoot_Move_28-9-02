import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    World w;
    public void act()
    {
        w = getWorld();
        moveWithKeyboard();
        shooter();
    }
    public void rotateRocket(){
        if (Greenfoot.isKeyDown("A"))
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("D"))
        {
            turn(3);
        }
        /**move (3);
        
        if (isAtEdge()){
           setLocation(0,getY());
        }*/
    }
    public void shooter(){
        World w = getWorld(); //create world class object and sets it to the current world
        if(Greenfoot.isKeyDown("space"))
        {
            w.addObject(new Shoot(), getX()+50, getY());
        }
    }
    public void moveWithKeyboard(){
        if (Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-5);
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(), getY()+5);
        }
        if (Greenfoot.isKeyDown("left"))
        {
            setLocation(getX()-5, getY());
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setLocation(getX()+5, getY());
        }
    }
}

