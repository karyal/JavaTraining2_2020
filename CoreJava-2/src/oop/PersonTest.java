package oop;

/**
 * Write a description of class PersonTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonTest
{
   public static void main(String []args){
       //Declare and initialize
       Person p1 = new Person();//Initailize by default constructor
       Person p2 = new Person(1, "Ashish Thapa");
       
       //Process
       p1.setPersonID(2);
       p1.setFullName("Manish Nembang");
       p2.setFullName("Rupak Magar");
       
       //Access
       System.out.println(p1.getPersonID()+", "+p1.getFullName());
       System.out.println(p2.getPersonID()+", "+p2.getFullName());
   }
}
