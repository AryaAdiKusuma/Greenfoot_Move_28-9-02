import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private int time=0;
    private int amountZombie = 30;
    private int amountBoss = 1;
    private int currBoss = amountBoss;
    private int currZombie = amountZombie;
    private int spawnZombie = 0;
    private int spawnBoss = 0;
    private int powerUp;

    Player mainPlayer = new Player();
    Stage2 stage2 = new Stage2();
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 700, 1);
        addObject(mainPlayer, getWidth()/2,getHeight()/2);
        prepare();
    }
   
    public void act(){
        showText("STAGE 1: ",100,15);
        showText("Remaining Zombie: "+currZombie,600,15);
        showText("Health : " + mainPlayer.getPlayerHealth(),800,15);
        time++;
        if(spawnZombie<amountZombie){
            powerUp = Greenfoot.getRandomNumber(15000);
            if(powerUp<(1+amountZombie)){
                generatePowerUp();
            }
            
            if(time==100){
                generatenormalZombie();
                time= 0;
            }
           // System.out.println(currZombie);
            // System.out.println(spawnZombie());
        }else if(currZombie==0){
            showText("Click Space to continue to the next stage",getWidth()/2,getHeight()/2);
            if(Greenfoot.isKeyDown("space")){
                Greenfoot.setWorld(stage2);
            }

        }
        
    }

    private void generatePowerUp(){
        PowerUp pow = new PowerUp();
        addObject(pow, Greenfoot.getRandomNumber(getWidth()-10)+10,Greenfoot.getRandomNumber(getHeight()-10)+10);
    }

    private void generatenormalZombie(){
        NormalZombie normalZombie = new NormalZombie();
        int pos = Greenfoot.getRandomNumber(8);
        switch (pos){
                case 0 : addObject(normalZombie, 0,             0);
                break;
                case 1 : addObject(normalZombie, getWidth()/2,  0);
                break;
                case 2 : addObject(normalZombie, getWidth(),    0);
                break;
                case 3 : addObject(normalZombie, 0,             getHeight()/2);
                break;
                case 4 : addObject(normalZombie, getWidth(),    getHeight()/2);
                break;
                case 5 : addObject(normalZombie, 0,             getHeight());
                break;
                case 6 : addObject(normalZombie, getWidth()/2,  getHeight());
                break;
                case 7 : addObject(normalZombie, getWidth(),    getHeight());
                break;
            }
        spawnZombie++;

    }

    private void generatefastZombie(){
        FastZombie fastZombie = new FastZombie();
        int pos = Greenfoot.getRandomNumber(8);
        switch (pos){
                case 0 : addObject(fastZombie, 0,             0);
                break;
                case 1 : addObject(fastZombie, getWidth()/2,  0);
                break;
                case 2 : addObject(fastZombie, getWidth(),    0);
                break;
                case 3 : addObject(fastZombie, 0,             getHeight()/2);
                break;
                case 4 : addObject(fastZombie, getWidth(),    getHeight()/2);
                break;
                case 5 : addObject(fastZombie, 0,             getHeight());
                break;
                case 6 : addObject(fastZombie, getWidth()/2,  getHeight());
                break;
                case 7 : addObject(fastZombie, getWidth(),    getHeight());
                break;
            }
        spawnZombie++;

    }

    public void killedZombie(){
        this.currZombie--;

    }

    public int getAmountZombie(){
        return this.amountZombie;
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
