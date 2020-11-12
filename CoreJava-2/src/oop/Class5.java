package oop;
/**
 * Write a description of class Class5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Class5
{
    public int x; //Object, Sub Class
    protected int y;//Sub Class
    private int z; // Itself only | To access we need to create public/protected method | public -> (Sub Class and Object) | protected - (Sub Class)    
    
    //Setter and Getter
    public void setZ(int z){
        this.z=z;
    }
    public int getZ(){
        return this.z;
    }
}