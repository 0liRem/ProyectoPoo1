import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Reciclable1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Reciclable1 extends Actor
{
   public   Reciclable1(){
        GreenfootImage myImage=getImage();
        myImage.scale(75,75);
    }
    private double gr=0,vo=0,g=9.8,dt=0.1;
    public void addedToWorld(World Later){
        gr=getY();
    }
    public void act()
    {
        if(getY()<(getWorld().getHeight())){
            double ht=gr+vo*dt+0.5*g*dt*dt;
            vo+=g*dt;
            if(ht>(getWorld().getHeight())){
                gr=ht;
                ht=getWorld().getHeight();
                vo=-vo*0.80;
                
            }
            setLocation(getX(),(int)ht);
            gr=ht;
        }
    }
}
