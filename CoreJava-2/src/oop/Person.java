package oop;
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

//Super Class | Parent Class

public class Person
{
    //Instance Variables | data members
    private int person_id; 
    private String full_name;
    
    //Constructors
    public Person(){
        this.person_id = 0;
        this.full_name="";
    }
    public Person(int person_id, String full_name){
        this.person_id = person_id;
        this.full_name=full_name;
    }
    //Methods
    //Getters
    public int getPersonID(){
        return this.person_id;
    }
    public String getFullName(){
        return this.full_name;
    }
    //Setters
    public void setPersonID(int person_id){
        this.person_id = person_id;
    }
    public void setFullName(String full_name){
        this.full_name = full_name;
    }    
}