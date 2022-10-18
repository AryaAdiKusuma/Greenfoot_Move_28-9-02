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
        laser();
        heroHit();
        resetPosition();
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
    }
    public void heroHit(){
        if (isTouching(Enemy.class)){
            removeTouching(Enemy.class);
            Boom boom = new Boom();
            getWorld().addObject(boom, getX(), getY());
            setLocation(50, 200);
        }
    }
    public void resetPosition(){
        if (getY()==0){
            setLocation (getX(),398);
        }
        if (getY()==399){
            setLocation (getX(),1);
        }
    }
    int laserTimer = 0;
    public void laser(){
        if(laserTimer==30)
        {
            getWorld().addObject(new Laser(), getX()+50, getY());
            laserTimer = 0;
        }else{
            laserTimer++;
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

