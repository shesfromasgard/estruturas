import java.util.Scanner;

public class Ex1Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = -1;

        while(n < 1)
            n = sc.nextInt();

        int cont = n - 1;

        while(cont != 0) {
            n *= cont;
            cont--;
        }

        System.out.println(n);

        sc.close();
    }
}