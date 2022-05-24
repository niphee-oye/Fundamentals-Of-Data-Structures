import java.util.Scanner;

public class cylinder_volume {
    public static void main(String[] args) {
        //v=h*pi*r*r
        double pi = 3.142;
        System.out.print("Radius of cylinder: ");
        Scanner radius = new Scanner(System.in);
        String num_rad = radius.nextLine();
        double Radius = Double.parseDouble(num_rad);
        
        System.out.print("Height of cylinder: ");
        Scanner height = new Scanner(System.in);
        String num_hei = height.nextLine();
        double Height = Double.parseDouble(num_hei);

        double volume = Radius * Radius * pi * Height;

        System.out.print("Volume of cylinder = " + volume);
    }
}
