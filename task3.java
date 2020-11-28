import java.util.Scanner;

public class task3 {
    private static Scanner scanner = new Scanner(System.in);;

    public static void main(String[] args) {
        // write your code here
         System.out.println("What is your favourite color? ");
        String answer1 = scanner.nextLine();

        System.out.println("What is your favourite animal? ");
        String answer2 = scanner.nextLine();

        System.out.println("You like " + answer1 + " cool, i like " + answer2);
    }
}
