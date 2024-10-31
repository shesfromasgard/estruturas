import java.util.Scanner;

public class Ex1MaiorMenor {
    //Método de complexidade O(n) ou linear.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vet[] = {-1, 10, 35, 150, 198, -85, 10, -150, 15250};

        int vetor[] = algoai(vet);

        for(int i = 0; i < vetor.length; i++)
            System.out.println(vetor[i]);
        
        sc.close();
    }

    public static int[] algoai(int vet []) {

        int maior = vet[0], menor = vet[0];

        for(int i = 0; i < vet.length; i++) {
            if(vet[i] > maior)
                maior = vet[i];
            else if(vet[i] < menor)
                menor = vet[i];
        }

        int vetor[] = {maior, menor};

        return vetor;

    }
}
