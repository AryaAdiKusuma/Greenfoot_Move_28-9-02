import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Duke here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Duke extends Actor
{
    /**
     * Act - do whatever the Duke wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Duke(){
        getImage().scale(90, 90);
    }
    public void act()
    {
        // Add your action code here.
        control();
    }
    public void control(){
        move(3);
        if(Greenfoot.isKeyDown("left")){
            turn(-15);
        }
        if(Greenfoot.isKeyDown("right")){
            turn(15);
        }
    }
}
