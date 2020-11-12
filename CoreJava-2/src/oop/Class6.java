package oop;
/**
 * Write a description of class Class6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Class6 extends Class5
{
    public int a;
    protected int b;
    private int c;    
    public void set_values(){
        x=10; //public - can access
        y=9; //protected - can access
        //z=1; //private - cannt access
        setZ(1);
        
        a = 10;
        b = 5;
        c = 4;
    }    
    public void show_values(){
        System.out.println(x);//can access
        System.out.println(y);//can access
        //System.out.println(z);//can't access        
        System.out.println(getZ());   
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}