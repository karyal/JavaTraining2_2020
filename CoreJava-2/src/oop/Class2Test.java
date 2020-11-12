package oop;
/**
 * Write a description of class Class2Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Class2Test
{
   static{
       Person p1 = new Person();
       Class2 obj1;
       obj1 = new Class2();
       //obj1.x = 90; // Assign - data member - directly
       //obj1.y = 50; // Assign - data member - directly
       //System.out.println(obj1.x); // Access - data member - directly
       //System.out.println(obj1.y); // Access - data member - directly
       System.out.println(obj1.getX()); // Access - member function - directly
       System.out.println(obj1.getY()); // Access - member function - directly
   }
   public static void main(String []args){
       
   }
}

























