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
        Fresher fres = new Fresher();
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
                                fres.createFresher();
                                fres.displayFresher();
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
                                fres.updateFresher();
                                fres.displayFresher();
                                break;
                            }
                            case 3: {
                                intern.updateIntern();
                                intern.displayIntern();
                                break;
                            }
                        }
                    } while (choice2 != 3);
                    break;
                }
                case 3: {
                    
                }
                case 4: {
                  
                }
                case 5: {
                    System.out.println("Bye!");
                    break;
                }
            }
        } while (choice1 != 5);
  
    }
        }
    
    

