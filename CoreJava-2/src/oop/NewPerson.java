package oop;
/**
 * Write a description of class NewPerson here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

// Super Class | Parent Class
    // All of Own

//Person
    //person_id
    //full_name

// Sub Class | Child Class    
    //Super Class - Protected and Public  - Yes
    //Super Class - Private - No
    
public class NewPerson extends Person
{
    private String contact_address;
    
    public NewPerson(){
        this.contact_address="";
    }
    public NewPerson(String contact_address){
        this.contact_address=contact_address;
    }
    //Methods
    public String getContactAddress(){
        return this.contact_address;
    }
    public void setContactAddress(String contact_address){
        this.contact_address=contact_address;
    }
}