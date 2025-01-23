import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BackEnd back = new BackEnd();

        int op = -1;

        while(true) {
            op = sc.nextInt();

            if(op == 0)
                System.exit(0);

            back.start(op);

            int array[] = back.vetor();

            System.out.print("Discarded cards: ");
            if(array.length > 0) {
                for(int i = 0; i < array.length; ++i) {
                    System.out.print(array[i]);
                    if(i != array.length - 1)
                        System.out.print(", ");
                }
            }
            System.out.println("\nRemaining card: " + back.number());

        }
    }
}