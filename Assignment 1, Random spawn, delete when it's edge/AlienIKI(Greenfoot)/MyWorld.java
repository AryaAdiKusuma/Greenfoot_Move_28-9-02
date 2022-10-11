import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private int jeda = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 400, 1); 
        addEnemy();
        prepare();
    }
    public void act(){
        addEnemy();
    }
    public void addEnemy(){
        if (jeda>0) jeda--;
        else jeda = 100;
        if (jeda==1){
           int py = Greenfoot.getRandomNumber (getHeight());
           addObject (new Enemy(-(2+Greenfoot.getRandomNumber(3))), getWidth() +200, py);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
        /**Enemy enemy2 = new Enemy();
        addObject(enemy2,800, 200);
        
        Enemy enemy1 = new Enemy();
        addObject(enemy1,800, 150);*/
        
        Hero pahlawan = new Hero();
        addObject(pahlawan,56,265);

    }
    
}
