import java.util.Scanner;

public class sphere_volume {
    public static void main(String[] args) {
        //v=(4/3)*pi*r*r
        double pi = 3.142;
        System.out.print("Radius of sphere: ");
        Scanner radius = new Scanner(System.in);
        String num_rad = radius.nextLine();
        double Radius = Double.parseDouble(num_rad);

        double volume = Radius * Radius * pi * 1.333;

        System.out.print("Volume of sphere = " + volume);
    }
}