package oop;
/**
 * Write a description of class Class61 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Class61 extends Class51
{
    private int d;
    protected int e;
    public int f;
    
    public Class61(){
        super();
        this.d=0;
        this.e=0;
        this.f=0;
    }
    public Class61(int a, int b, int c, int d, int e, int f){
        super(a, b, c);
        this.d=d;
        this.e=e;
        this.f=f;
    }
    //Getters
    public int getD(){
        return this.d;
    }
    public int getE(){
        return this.e;
    }
    public int getF(){
        return this.f;
    }
    //Setters
    public void setD(int d){
        this.d=d;
    }
    public void setE(int e){
        this.e=e;
    }
    public void setF(int f){
        this.f=f;
    }
}
