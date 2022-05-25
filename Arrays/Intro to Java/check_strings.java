import java.util.Scanner;

public class check_strings {
    public static void main(String[] args) {
        System.out.println(" ");
        System.out.print("Enter the first string: ");
        try (Scanner string_1 = new Scanner(System.in)) {
            String f_string = string_1.nextLine();
            System.out.println("You typed: " + f_string);
            System.out.println(" ");
            
            System.out.print("Enter the second string: ");
            try (Scanner string_2 = new Scanner(System.in)) {
                String s_string = string_2.nextLine();
                System.out.println("You typed: " + s_string);
                System.out.println(" ");

                boolean check = f_string.equals(s_string);
                System.out.println("The two strings are the same: " + check);
            }
        }
        System.out.println("");
    }
}
