import java.util.Scanner;

public class Ex1MaiorMenor {
    //Método de complexidade O(n) ou linear.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        while(count <= 0)
            count = sc.nextInt();

        int vet[] = new int[count];

        for(int i = 0; i < vet.length; i++)
            vet[i] = sc.nextInt();

        algoai(vet);
        
        sc.close();
    }

    public static void algoai(int vet []) {

        int maior = vet[0], menor = vet[0];

        for(int i = 0; i < vet.length; i++) {
            if(vet[i] > maior)
                maior = vet[i];
            else if(vet[i] < menor)
                menor = vet[i];
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);

    }
}