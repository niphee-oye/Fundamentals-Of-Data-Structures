import java.util.Scanner;

public class multiplication_table {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner num = new Scanner(System.in);
        String the_number = num.nextLine();
        int number = Integer.parseInt(the_number);
        System.out.println(" ");

        for(int j = 1; j < (number+1); j++){
            for(int i = 1; i < 13; i++){
                System.out.println(j + " x " + i + " = " + (number*i));
            }
            System.out.println(" ");
        }

    }
}
