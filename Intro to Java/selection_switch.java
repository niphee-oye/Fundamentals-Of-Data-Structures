import java.util.Scanner;

public class selection_switch {
    public static void main(String[] args) {
        System.out.print("Enter a number between 1 and 7: ");
        try (Scanner num = new Scanner(System.in)) {
            String the_num = num.nextLine();

            switch (the_num) {
                case "1":
                    System.out.println("Sunday");
                    break;
                case "2":
                    System.out.println("Monday");
                    break;
                case "3":
                    System.out.println("Tuesday");
                    break;
                case "4":
                    System.out.println("Wednesday");
                    break;
                case "5":
                    System.out.println("Thursday");
                    break;
                case "6":
                    System.out.println("Friday");
                    break;
                case "7":
                    System.out.println("Saturday");
                    break;            
                default:
                    System.out.println("Invalid");
                    break;
            }
        }
    }
}
