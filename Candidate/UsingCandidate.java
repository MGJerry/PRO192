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
public class UsingCandidate {
    public static void main(String[] args){
   
        Candidate candi= new Candidate();
        Experience exp = new Experience();
        Fresher fresh = new Fresher();
        Intern intern = new Intern();

        int choice1, choice2;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Candidate management system");
            System.out.println("1 - Create new candidate");
            System.out.println("2 - Update candidate's information");
            System.out.println("3 - Delete candidate");
            System.out.println("4 - Search candidate");
            System.out.println("5 - Exit");
            System.out.println("Enter your choice: ");
            choice1 = sc.nextInt();
            switch (choice1) {
                case 1: {
                    do{
                        System.out.println("- Create experience");
                        System.out.println("- Create fresher");
                        System.out.println("- Create intern");
                        choice2 = sc.nextInt();
                        switch (choice2){
                            case 1: {
                                exp.createExp();
                                exp.displayExp();
                                break;                                      
                            }
                            case 2: {
                                fresh.createFresher();
                                fresh.displayFresher();
                                break;
                            }
                            case 3: {
                                intern.createIntern();
                                intern.displayIntern();
                                break;
                            }
                        }
                    } while (choice2 < 1 || choice2 > 3);
                    break;
                }
                case 2: {
                    do{
                        System.out.println("- Update experience");
                        System.out.println("- Update fresher");
                        System.out.println("- Update intern");
                        choice2 = sc.nextInt();        
                        switch (choice2){
                            case 1: {
                                exp.updateExp();
                                exp.displayExp();
                                break;                                      
                            }
                            case 2: {
                                fresh.updateFresher();
                                fresh.displayFresher();
                                break;
                            }
                            case 3: {
                                intern.updateIntern();
                                intern.displayIntern();
                                break;
                            }
                        }
                    } while (choice2 < 1 || choice2 > 3);
                    break;
                }
                case 3: {
                    do{
                        System.out.println("- Delete experience");
                        System.out.println("- Delete fresher");
                        System.out.println("- Delete intern");
                        choice2 = sc.nextInt();        
                        switch (choice2){
                            case 1: {
                                exp.deleteExp();
                                exp.displayExp();
                                break;                                      
                            }
                            case 2: {
                                fresh.deleteFresher();
                                fresh.displayFresher();
                                break;
                            }
                            case 3: {
                                intern.deleteIntern();
                                intern.displayIntern();
                                break;
                            }
                        }
                    } while (choice2 < 1 || choice2 > 3);
                    break;
                }
                case 4: {
                    do{
                        System.out.println("- Search experience");
                        System.out.println("- Search fresher");
                        System.out.println("- Search intern");
                        choice2 = sc.nextInt();        
                        switch (choice2){
                            case 1: {
                                exp.searchExp();
                                exp.displayExp();
                                break;                                      
                            }
                            case 2: {
                                fresh.searchFresher();
                                fresh.displayFresher();
                                break;
                            }
                            case 3: {
                                intern.searchIntern();
                                intern.displayIntern();
                                break;
                            }
                        }
                    } while (choice2 < 1 || choice2 > 3);
                    break;
                }
                case 5: {
                    System.out.println("Bye!");
                    break;
                }
            }
        } while (choice1 != 5);
  
    }
        }
    
    

