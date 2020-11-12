package oop;
/**
 * Write a description of class ClassNewPersonTest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClassNewPersonTest
{
   public static void main(String []args){
       
       NewPerson p1 = new NewPerson();
       p1.setPersonID(1);
       p1.setFullName("Krishna");
       p1.setContactAddress("KTM");
       
       System.out.println(p1.getPersonID()+", "+p1.getFullName()+", "+p1.getContactAddress());
   }
}
