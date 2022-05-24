import java.util.Scanner;

public class selection_if_else {
    public static void main(String[] args) {
        System.out.print("What did you score out of hundred? ");
        Scanner score = new Scanner(System.in);
        String your_score = score.nextLine();
        int fin_score = Integer.parseInt(your_score);

        if (fin_score < 0) {
            System.out.println("Invalid: " + fin_score);
        }
        else if(fin_score <= 100 && fin_score >= 70){
            System.out.println("Excellent! You have an A.");
        }
        else if(fin_score < 70 && fin_score >= 60){
            System.out.println("Bravo! You have a B.");
        }
        else if(fin_score < 60 && fin_score >= 50){
            System.out.println("Good! You have a C.");
        }
        else if(fin_score < 50 && fin_score >= 45){
            System.out.println("Nice try! You have a D.");
        }
        else if(fin_score < 45 && fin_score >= 0){
            System.out.println("Sorry, you have an F.");
        }
    }
}
