import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean shooting;
    private int firespeed=15;
    private int delay = 0;
    private int health = 100;
    GreenfootImage player2 = new GreenfootImage("2fix.png");
    GreenfootImage player3 = new GreenfootImage("3fix.png");
    private int frame = 1;
    public int aniCounter = 0;
    
    public Player(){
        setRotation(90);
    }
    public void animate(){
        if(frame == 1){
            setImage(player2);
            frame = 2;
        }else if(frame == 2){
            setImage(player3);
            frame = 1;
        }
    }
    public void aniCounting(){
        if(aniCounter % 6 == 0){
                animate();
            }
    }
    public void getHit(int damage){
        health-=damage;
    }
    public void fireUp(){
        firespeed-=2;
    }
    public int getPlayerHealth(){
        return health;
    }
    public void act()
    {
        if(health>0){
            playerMove2(5);
            playerMove(5);
            turnToCursor();
            
            shootBullet();
            delay++;  
            aniCounter = aniCounter +1;
        }else{
            Greenfoot.playSound("GAMEOVER.wav");
            Death();
        }

    }
    private void Death(){
        getWorld().removeObject(this);
        Greenfoot.setWorld(new GameOver());
    }
    private void playerMove(int speed){
        if(Greenfoot.isKeyDown("a")){
            setLocation(getX()-speed,getY());
            aniCounting();
        }
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX()+speed,getY());
            aniCounting();
        }
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(),getY()-speed);
            aniCounting();
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(),getY()+speed);
            aniCounting();
        }
        
    }
    private void playerMove2(int speed){
        if(Greenfoot.isKeyDown("left")){
            setLocation(getX()-speed,getY());
            aniCounting();
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+speed,getY());
            aniCounting();
        }
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-speed);
            aniCounting();
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY()+speed);
            aniCounting();
        }
        
    }
    private void turnToCursor(){
        if(Greenfoot.getMouseInfo()!= null){
            turnTowards(Greenfoot.getMouseInfo().getX(),Greenfoot.getMouseInfo().getY());    
        }
    }
    private void shootBullet(){
        
        if (shooting && (Greenfoot.mouseDragEnded(null) || Greenfoot.mouseClicked(null))) shooting = false;
        if (!shooting && Greenfoot.mousePressed(null)) shooting = true;
        
        if(shooting==true&&delay>firespeed){
            
            Bullet bullet = new Bullet();
            getWorld().addObject(bullet,getX(),getY()); 
            Greenfoot.playSound("hitHurt.wav");
            bullet.setRotation(getRotation());
            delay=0;
        }
        
    }
}
