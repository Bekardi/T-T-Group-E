import java.time.LocalDate;
import java.util.Scanner;

public class task1 {

    private static String year;

    public static void main(String[] args) {
        // write your code here
        Scanner myScanner = new Scanner(System.in);
        System.out.println("How old are you? ");
        int age = myScanner.nextInt();
        LocalDate.now().minusYears(age).getYear();
        System.out.println("Your were born in" + year);
        String answer = myScanner.nextLine();
        if (age >= 18) {
            System.out.println("You are " + answer + " wow, nice");
            System.out.println("You are still young");
    }
}
}
