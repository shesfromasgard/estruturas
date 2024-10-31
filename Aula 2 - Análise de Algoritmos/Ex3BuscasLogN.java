import java.util.Scanner;

public class Ex3BuscasLogN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] vet = { -10, 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23 };

        int n = sc.nextInt();

        System.out.println(busca(vet, n));

        sc.close();
    }

    public static boolean busca(int vet[], int n) {

        int inicio = 0;
        int fim = vet.length - 1;

        while (inicio <= fim) {
            int meio = inicio + (fim - inicio) / 2;

            if (vet[meio] == n)
                return true;

            if (vet[meio] < n)
                inicio = meio + 1;
            else
                fim = meio - 1;
        }

        return false;

    }
}
