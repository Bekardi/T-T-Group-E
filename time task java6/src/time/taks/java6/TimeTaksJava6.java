/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time.taks.java6;

import java.util.Scanner;

/**
 *
 * @author xiaohui weng2020387
 */
public class TimeTaksJava6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Do you like this CA? (enter yes or no)");
        Scanner myReader = new Scanner(System.in);
        String answer;
        
        answer = myReader.nextLine();
        if(answer.equals("yes")){
            System.out.println(" That’s good");
        }
        else if(answer.equals("no")){
            System.out.println("That's bad");
        }
       
    
   }  
}
