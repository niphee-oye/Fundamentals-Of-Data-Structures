public class loops {
    public static void main(String[] args) {
        for(int i = 0; i < 11; i++){
            System.out.print(i + " ");
        }
        System.out.println(" ");

        int n = 0;
        while (n < 11) {
            System.out.print(n + " ");
            n++;
        }
        System.out.println(" ");

        int k = 0;
        do {
            System.out.print(k + " ");
            k++;
        } while (k < 5);
    }
}
