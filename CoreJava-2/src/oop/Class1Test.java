package oop;
/**
 * Write a description of class Class1Test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Class1Test
{
   static{
       Class1 obj1 = new Class1();
       obj1.x = 52; //assign
       obj1.y = 85; //assign
       obj1.f1(); //call f1 - access
       obj1.f2(); //call f2 - access
       System.out.println(obj1.x);//access
       System.out.println(obj1.y);//access
       Person p1 = new Person();
   }
   
   public static void main(String []args){
       
   }
}
