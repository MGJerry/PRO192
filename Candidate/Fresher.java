

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
public class Fresher extends Candidate {
    Scanner sc=new Scanner (System.in);
    
    private String Graduation_date;
    private String Grduation_rank;
    private String Education;

    public String getGraduation_date() {
        return Graduation_date;
    }

    public String getGraduation_rank() {
        return Grduation_rank;
    }

    public String getEducation() {
        return Education;
    }
    
    void createFresher(){
        this.createCandidate();     
        Graduation_date = Utils.inputString("Input graduated time: ");
        Grduation_rank = Utils.inputString("Input rank of graduation: ");
        Education = Utils.inputString("Input university: ");
    }
   
    void updateFresher(){
        this.updateCandidate(); 
        Graduation_date = Utils.updateString("Update graduated time: ",Graduation_date);
        Grduation_rank = Utils.updateString("Update rank of graduation: ",Grduation_rank);
        Education = Utils.updateString("Update university: ", Education);
    }
    
    void displayFresher(){
        this.displayCandidate();    
        System.out.println("Input graduated time: " + Graduation_date);
             
        System.out.println("Input rank of graduation: " + Grduation_rank);
        
        System.out.println("Input university: " + Education);
    }
    void deleteFresher() {
    }

    void searchFresher(){
    }

}