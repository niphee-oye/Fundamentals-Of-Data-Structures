import java.util.Scanner;

/**
 * kevin_to_fahrenheit
 */
public class kevin_to_fahrenheit {

    public static void main(String[] args) {
        // F=((K-273.15)*(9/5) )+32
        System.out.println("Welcome to the Kevin to Fahrenheit converter.");
        System.out.print("Enter the known temperature in Kevin: ");
        System.out.print("");
        try (Scanner temp_input = new Scanner(System.in)) {
            String temperature = temp_input.nextLine();
            double temperature_flt = Double.parseDouble(temperature);

            double fahr = (((temperature_flt - 273.15)*(1.8)) + 32);
            System.out.print("The equivalent temperature in Fahrenheit is: " + fahr + " degrees fahrenheit.");
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.print("");
    }
}