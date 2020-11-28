import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task7 {

    private static int sum;

    public static void main(String[] args) {

        BufferedReader bf2 = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("Please enter your first number");
            int number1;
            int number2;
            number1 = Integer.parseInt(bf2.readLine());

            System.out.println("Please enter your second number");
            number2 = Integer.parseInt(bf2.readLine());

            sum = number1 + number2;
            int sub = number1 - number2;
            int multi = number1 * number2;

            //Print out the sum
            System.out.println("The sum of " + number1 + " and " + number2 +
            " is: " + sum);
             //Print out the subtraction
            System.out.println("The sub of " + number1 + " and " + number2 +
            " is: " + sub);
             //Print out the multiplication
            System.out.println("The mult of " + number1 + " and " + number2 +
            " is: " + multi);

            //Check if second number is not 0 or less than
             if (number2 == 0) {
                 //If second number is 0 or less, print out that this
                 //condition is not accepeted.
                System.out.println("Your second number cannot be 0 or less");
                System.out.println("Try again");
            } else{
                 //When second number is more than 0, allows the division.
                 int div = number1 / number2;
                 System.out.println("The division of " + number1 + " and " + number2 +
            " is: " + div);
            }

        } catch (Exception e) {

            System.out.println(e);
        }


    }

}

