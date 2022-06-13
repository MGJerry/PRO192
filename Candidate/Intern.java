

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
public class Intern extends Candidate {
    Scanner sc=new Scanner (System.in);
    
    private String major;
    private String semester;
    private String Universityname;

    public String getMajor() {
        return major;
    }
    
    public String Semester() {
        return semester;
    }

    public String getUniversityname() {
        return Universityname;
    }
    
    
    void createIntern(){
        this.createCandidate();
        major = Utils.inputString("Input majors: ");
        semester = Utils.inputString("Input semesters: ");
        Universityname = Utils.inputString("Input university name: ");
    }
   
    void updateIntern(){
        this.updateCandidate();
        major = Utils.updateString("Update majors: ", major);
        semester = Utils.updateString("Update semesters: ", semester);
        Universityname = Utils.updateString("Update university name: ", Universityname);
    }
   
    void displayIntern(){
        this.displayCandidate();    
        System.out.println("Input major: " + major);
               
        System.out.println("Input semester: " + semester);
        
        System.out.println("Input university: " + Universityname);
     
    }
    void deleteIntern() {
    }

    void searchIntern(){
    }

}