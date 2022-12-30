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
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Bee bee = new Bee();
        addObject(bee,264,160);
        Fly fly = new Fly();
        addObject(fly,104,71);
        Spider spider = new Spider();
        addObject(spider,488,250);
        fly.setLocation(436,322);
        spider.setLocation(56,88);
        Bee bee2 = new Bee();
        addObject(bee2,151,246);
        Bee bee3 = new Bee();
        addObject(bee3,228,303);
        Fly fly2 = new Fly();
        addObject(fly2,372,80);
        Spider spider2 = new Spider();
        addObject(spider2,451,188);
        Duke duke = new Duke();
        addObject(duke,349,195);
    }
}
