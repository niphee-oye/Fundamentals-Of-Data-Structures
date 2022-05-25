import java.util.Scanner;
public class intro_to_java {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println("My name is Oluwanifemi");
        System.out.println("");

        int a = 5, b = 6, sum;

        sum = a + b;
        System.out.println("a + b = " + sum);
        sum = a * b;
        System.out.println("a * b = " + sum);
        sum = a / b;
        System.out.println("a / b = " + sum);
        sum = a % b;
        System.out.println("a % b = " + sum);

        if(a<b){
            System.out.println("a: " + a + " < b: " +b);
        }
        else{
            System.out.println("a: " + a + " > b: " +b);
        }

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("");
            System.out.print("Enter your name please: ");
            String name = input.nextLine();
            System.out.println("Your name is " + name + ".");
        }
        System.out.println("");

        try (Scanner something = new Scanner(System.in)) {
            System.out.print("Enter any number of your choice: ");
            String number = something.nextLine();
            int int_number = Integer.parseInt(number);
            System.out.print("The number you entered was: " + int_number);
            System.out.println("");

            try (Scanner something_2 = new Scanner(System.in)) {
                System.out.print("Enter any other number of your choice: ");
                String number2 = something_2.nextLine();
                int int_number2 = Integer.parseInt(number2);
                System.out.println("You entered : " + int_number2);
                System.out.println("");
                int add = int_number + int_number2;

                System.out.println("");
                System.out.println("Summing them both: " + int_number + " + " + int_number2 + " = " + add );
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("");
    }
}
