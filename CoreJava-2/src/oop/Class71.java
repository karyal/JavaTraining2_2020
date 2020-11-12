package oop;
/**
 * Write a description of class Class71 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Class71 extends Class61
{
   private int g;
   protected int h;
   public int i;
   
   public Class71(){
       super();//Default Constructor of Calss61
       this.g=0;
       this.h=0;
       this.i=0;
   }
   
   /*
   public Class71(int g, int h, int i){
       this.g=g;
       this.h=h;
       this.i=i;
   }
   */
  
  public Class71(int a, int b, int c, int d, int e, int f, int g, int h, int i){
      super(a, b, c, d, e, f);
      this.g=g;
      this.h=h;
      this.i=i;
   }
   
   //Getters
   public int getG(){
       return this.g;
   }
   public int getH(){
       return this.h;
   }
   public int getI(){
       return this.i;
   }
   //Setters
   public void setG(int g){
       this.g=g;
   }
   public void setH(int h){
       this.h=h;
   }
   public void setI(int i){
       this.i=i;
   }
}
