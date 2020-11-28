import java.util.Scanner;

public class task5 {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Do you like this CA? ");
        Scanner scanner = new Scanner(System.in);
        String answer1 = scanner.nextLine();
        String answer2 = scanner.nextLine();
        System.out.println("That is good " + answer1 + ", and" + " That is bad " + answer2);

    }
}
