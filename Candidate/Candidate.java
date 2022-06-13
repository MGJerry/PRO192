/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRO192_slot_10;


import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Candidate {

    private String id;
    private String firstName;
    private String lastName;
    private String birthday;
    private String address;
    private String email;
    private String phone;
    private String type;
    
    public Candidate(){
        this.id = "";
        this.firstName = "";
        this.lastName = "";
        this.birthday = "";
        this.address = "";
        this.email = "";
        this.phone = "";
        this.type = "";
    }
    
    void createCandidate(){
        System.out.println("Create Candidate");
        Scanner sc = new Scanner(System.in);
        this.id = Utils.inputString("ID: ");
        this.firstName = Utils.inputString("First name: ");
        this.lastName = Utils.inputString("Last name: ");
        this.birthday = Utils.inputString("Birthday: ");
        this.address = Utils.inputString("Address: ");
        this.email = Utils.inputString("Email: ");
        this.phone = Utils.inputString("Phone: ");
        this.type = Utils.inputString("Type: ");
        
     }
    
    void updateCandidate(){
       System.out.println("Update Candidate");
       Scanner sc = new Scanner(System.in);
       this.id = Utils.updateString("ID: ",id);
       this.firstName = Utils.updateString("First name: ",firstName);
       this.lastName = Utils.updateString("Last name: ",lastName);
       this.birthday = Utils.updateString("Birthday: ",birthday);
       this.address = Utils.updateString("Address: ",address);
       this.email = Utils.updateString("Email: ",email);
       this.phone = Utils.updateString("Phone: ",phone);
       this.type = Utils.updateString("Type: ",type);    
    }
    
    
    void displayCandidate(){
        System.out.println("{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName +
            ", birthday=" + birthday + ", address=" + address + ", email=" + email + ", phone=" + phone +
            ", type=" + type + "}");        
        }  
    void deleteCandidate(){ 
    }
    
    void searchCandidate(){
    }
      

}
