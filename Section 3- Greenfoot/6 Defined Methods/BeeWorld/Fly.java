import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fly here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fly extends Actor
{
    /**
     * Act - do whatever the Fly wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        randomTurn();
    }
    
    public void randomTurn(){
        move(1);
        if (Greenfoot.getRandomNumber(20)<10){
            turn(Greenfoot.getRandomNumber(90)-45);
        }else{
            turn(5);
        }
    }
}
