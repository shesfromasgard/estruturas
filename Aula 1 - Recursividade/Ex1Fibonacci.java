import java.util.Scanner;

public class Ex1Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int cont = 0;

        cont = sc.nextInt();

        try {
            System.out.println(fibonacci(cont));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        sc.close();
    }

    public static int fibonacci(int cont) throws Exception {

        if(cont < 0)
            throw new Exception("Digite um número positivo.");

        if(cont == 0)
            return 0;
        else if (cont == 1 || cont == 2)
            return 1;
        else {
            int vet[] = new int [cont];
            vet[0] = 1;
            vet[1] = 1;

            for(int i = 2; i < cont; i++) {
                vet[i] = vet[i - 1] + vet[i - 2];
            }
            return vet[cont - 1];
        }
    }
}
