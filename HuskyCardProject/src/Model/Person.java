/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author pulkit
 */
public class Person {
    String nuid;
    String firstName;
    String lastName;
    String collegeName;
    Address address;
    Contact personalContact;
    Contact officeContact;

    public String getNuid() {
        return nuid;
    }

    public void setNuid(String nuid) {
        this.nuid = nuid;
    }

    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }    
    
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public Address getAddress(){
        return address;
    }
    
    public void setAddress(Address address){
        this.address = address;
    }

    public Contact getPersonalContact() {
        return personalContact;
    }

    public void setPersonalContact(Contact personalContact) {
        this.personalContact = personalContact;
    }

    public Contact getOfficeContact() {
        return officeContact;
    }

    public void setOfficeContact(Contact officeContact) {
        this.officeContact = officeContact;
    }
    
    
    public Person(){
        this.nuid = "";
        this.firstName = "";
        this.lastName = "";
        this.collegeName = "";
        this.address = new Address();
        this.personalContact = new Contact();
        this.officeContact = new Contact();
    }
    
    public static void main(){
        
    }
}
