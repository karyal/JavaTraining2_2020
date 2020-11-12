package oop;
/**
 * Write a description of class Class4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Class4
{
   private int x;
   
   public Class4(){
       this.x=0; //this refers current class (this->Class4) | this.x -> Instance variable of current class -> Class4.x
   }
   public Class4(int x){
       this.x = x; //Class4.x = x (parameter x)
   }
   public void setX(int x){
       this.x = x;
   }
}
