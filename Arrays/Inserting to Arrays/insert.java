import java.util.Scanner;

public class insert {
    public static void main(String[] args) {
        int[] array = new int[5];

        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the element to be at index " + i + " : ");
            try (Scanner element = new Scanner(System.in)) {
                String the_element = element.nextLine();
                int num_element = Integer.parseInt(the_element);
                array[i] = num_element;
            } catch (NumberFormatException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }System.out.println("");

        for(int i = 0; i < array.length; i++){
            System.out.println("The element now at index " + i + " is: " + array[i]);
        }System.out.println("");
    }
}
