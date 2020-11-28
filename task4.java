import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {
        
        System.out.println("Where were you born? ");
        Scanner scanName = new Scanner(System.in);
        String answer1 = scanName.nextLine();
        
        System.out.println("city or country? ");
        String answer2 = scanName.nextLine();

        System.out.println("You are born " + " answer1 " + " wow, i have friends there" + " answer2 ");
    }
}
