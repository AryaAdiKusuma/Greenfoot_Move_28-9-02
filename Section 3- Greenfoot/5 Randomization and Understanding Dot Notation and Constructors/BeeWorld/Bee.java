import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bee extends Actor
{
    /**
     * Act - do whatever the Bee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int lives;
    int prevX, prevY;
    public void act()
    {
        move(1);
        turn(15);
    }
    private void updateLives(int change){
      lives +=change;
      updateLives(lives);
    }
    private void storeCurrentPosition(boolean collided){
        if(collided){
            prevX = getX();
            prevY = getY();
        }
    }
    private void play(String sound){
        Greenfoot.playSound(sound);
    }
    
}
