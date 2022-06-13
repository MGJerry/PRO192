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
public class Utils {
    public static int inputInt(String welcome, int bot, int top){
        int number = 0;
        Scanner sc=new Scanner (System.in);
        boolean cont = true;
        do {
            try {
                System.out.print(welcome+"[" + bot + ", " + top + "]: ");
                number = Integer.parseInt(sc.nextLine());
                cont = false;
            } catch (Exception e){
                System.out.println("Input number" + "[" + bot + ", " + top + "]");
            }
        } while (cont || number > top || number < bot);
         return number;
    }
    public static int updateInt(String welcome, int bot, int top, int oldValue){
        int value = oldValue;
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        do {
            try {
                System.out.println("Input number[" + bot + ", " + top + "]: " );
                String temp = sc.nextLine();
                if(temp.equals("")){
                    value=oldValue;
                    cont = false;
                } else {
                    value = Integer.parseInt(temp);
                    cont = false;
                }
            } catch (Exception e ){
                System.out.println(welcome);
            }
        } while (cont);
        return value;
    }
    public static String inputString(String welcome){
        String str = "";
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        do {
            try {
                System.out.println(welcome);
                str = sc.nextLine();
                if(!str.equals("")){
                    cont = false;
                }
            } catch (Exception e) {
                System.out.println(welcome);
            }
        } while (cont);
         return str ;
    }
    public static String updateString(String welcome, String oldValue) {
        String str = oldValue;
        Scanner sc = new Scanner(System.in);
        boolean cont = true;
        do {
            try {
                System.out.println(welcome);
                str = sc.nextLine();
                if(str.equals("")){
                    str = oldValue;
                }
                cont = false;
            } catch (Exception e) {
                System.out.println(welcome);
            }
        } while (cont);
         return str ;
    }
}

  



   