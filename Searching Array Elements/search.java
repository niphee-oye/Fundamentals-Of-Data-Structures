import java.util.Scanner;

public class search {
    public static void main(String[] args){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.println("");
        System.out.print("Enter the element that to be searched for: ");
        try (Scanner element = new Scanner(System.in)) {
            String the_element = element.nextLine();
            int num_element = Integer.parseInt(the_element);

            for(int i = 0; i < array.length; i++){
                if (num_element == array[i]) {
                    System.out.println("Element has been found at index " + i);
                    break;
                }
            }
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println(" ");
    }
}
