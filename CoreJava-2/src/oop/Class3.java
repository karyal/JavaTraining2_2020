package oop;
/**
 * Write a description of class Class3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Class3
{
    //data members
    private int x;
    private int y;
    
    //Constructors    
    //Default Constructor - if not defined by user/developer - java compiler automatically create the defualt constructor
    public Class3(){
        x = 0;
        y = 0;
    }
    
    public Class3(int a, int b){
        x = a;
        y = b;
    }
    
    //Method OVerloading - Constructor OVerloading
        //return type - same
        //name - same
        //parameter-list - different
        //inner code cab be difference
    
    //getters and setters
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public void setX(int a){
        x=a;
    }
    
    public void setY(int b){
        y=b;
    }
    //Process
    public int calc_sum(){
        return x+y;
    }
}