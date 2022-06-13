

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
public class Experience extends Candidate {
    Scanner sc= new Scanner(System.in);
 
    private int yearofExp;
    private String proSkill;
    
    public int getYearofExp() {
        return yearofExp;
    }

    public String getProSkill() {
        return proSkill;
    }
    void createExp(){
        this.createCandidate();
        yearofExp = Utils.inputInt("Input year of Experience: ", 1, 100);
        proSkill = Utils.inputString("Input skill: ");

    }

    void updateExp(){
        this.updateCandidate();
        yearofExp = Utils.updateInt("Update year of Experience: ", 1, 100, yearofExp);
        proSkill = Utils.updateString("Update skill: ", proSkill);
    }
    
    void displayExp(){
        this.displayCandidate();
        System.out.println("Input year of experince: "+yearofExp);
             
        System.out.println("Input SKILL: "+proSkill);
      
    }
    void deleteExp() {
    }

    void searchExp() {
    }

}