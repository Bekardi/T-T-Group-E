/* CCt College Dublin
 * Student Id 2020359
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package timetask3;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Shivam Kumar mehta 
 */
public class Timetask3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             List < String > colours1 = new ArrayList < > ();

        colours1.add("blue");
        colours1.add("red");
        colours1.add("green");

        List < String > colours2 = new ArrayList < > ();

        colours2.add("yellow");
        colours2.add("pink");
        colours2.add("brown");

        List < String > colours3 = new ArrayList < > ();
        colours3.add("white");
        colours3.add("orange");

        colours3.addAll(colours1);
        colours3.addAll(2, colours2);

        for (String col: colours3) {

            System.out.println(col);
        }
    
}
    
    
}
