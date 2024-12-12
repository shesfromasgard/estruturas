import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Pilha pilha = new Pilha();

        int n = sc.nextInt();

        try {
            pilha.doIt(n);
            int array[] = pilha.print();
            for(int i = 0; i < array.length; ++i)
                System.out.println(array[i]);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        sc.close();
        
    }
}
