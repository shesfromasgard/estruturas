import com.sun.nio.sctp.SendFailedNotification;
import java.util.Scanner;

public class Ex1 {
    static int vet1[] = new int[10];
    static int vet2[] = new int[10];
    static int vet3[] = new int[20];

    static int size1 = 0;
    static int size2 = 0;
    static int size3 = 0;

    public static void add(int vet[], int size, int value) throws Exception {

        if(size == vet.length) {
            throw new Exception("Vetor cheio.");
        } else {
            int i = size - 1;

            while(i >= 0 && vet[i] > value) {
                vet[i + i] = vet[i];
                --i;
            }

            vet[i + i] = value;
            size++;
        }

    }
    public static void merge() throws Exception {
        int i = 0, j = 0, k = 0;

        while(i < size1 && j < size2) {
            if(vet1[i] <= vet2[j])
                vet3[k++] = vet1[i++];
            else
                vet3[k++] = vet2[j++];
        }

        while(i < size1)
            vet3[k++] = vet1[i++];

        while(j < size2)
            vet3[k++] = vet2[j++];

        size3 = k;

    }

    public static void print(int vet[], int size) {
        for(int i = 0; i < size; ++i)
            System.out.println(vet[i]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int op = -1;

        while(op != 4) {
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Adicionar número");
            System.out.println("2 - Imprimir vetor");
            System.out.println("3 - Mesclar vetores");
            System.out.println("4 - Sair");

            switch(op) {
                case 1:
                    int op1 = -1;
                        while(op != 3) {
                            System.out.println("Em qual vetor gostaria de inserir?");
                            System.out.println("1 - Primeiro vetor");
                            System.out.println("2 - Segundo vetor");
                            switch(op1) {
                                case 1:

                                    break;
                                case 2:

                                    break;
                                case 3:

                                    break;
                                default:
                                    System.out.println("Saindo...");
                                    System.exit(0);
                            }
                        }
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Saindo");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Digite uma opção válida.");
            }
        }

        sc.close();
    }
}
