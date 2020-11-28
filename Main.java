import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Q1: What is your name? ");
        Scanner scanName = new Scanner(System.in);
            String answer1 = scanName.nextLine();
        System.out.println("Q2: What is your surname? ");
            String answer2 = scanName.nextLine();
        System.out.println("Hey " + "nice to meet you " + answer1 + answer2);

    }
}
