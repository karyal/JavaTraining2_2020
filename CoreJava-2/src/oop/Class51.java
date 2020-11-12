package oop;
/**
 * Write a description of class Class51 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Class51
{
    private int a;
    protected int b;
    public int c;
    
    public Class51(){
        this.a=0;
        this.b=0;
        this.c=0;
    }
    
    public Class51(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }    
    //Getters
    public int getA(){
        return this.a;
    }
    public int getB(){
        return this.b;
    }
    public int getC(){
        return this.c;
    }
    //Setters
    public void setA(int a){
        this.a = a;
    }
    public void setB(int b){
        this.b = b;
    }
    public void setC(int c){
        this.c = c;
    }    
}
