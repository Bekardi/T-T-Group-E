# T-T-Group-E
Java Project 
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package groupeproject;
import

/**
 *
 * @author Kevin Leira 
 */
public class GroupEproject {
   static void kevinMethod(){
       System.out.println("Tthis is Kevin's Method!");
   }
    
    public static void main(String[] args) { 
        kevinMethod()
        // Scanner for readign input 
        Scanner myKb = new Scanner(System.in);

        System.out.println("Hey! How old are you?"); //Asks the user for their age
        keyInput = myKb.hasNextInt();
        
        if ((keyInput >= 0) && (keyInput <= 17>)){ //For integer between this range System will print "too young"
            System.out.println("You're too young!");}
        if ((keyInput >= 18) && (keyInput <=100)){
            System.out.println("WOOOWW! Your age is " + keyInput + "That's very nice");} //For input between this range System will print a messsage an age introduced     
        else { // Anything else is considered invalid!!!
            System.err.println("I'm so sorry but this is not valid");}
}
}
}