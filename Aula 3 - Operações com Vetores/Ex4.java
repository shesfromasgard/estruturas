import java.util.Scanner;

public class Ex4 {

    int vet[] = new int[10];
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ex4 ex4 = new Ex4();

        int op;

        do {

            System.out.println("\nMenu: ");
            System.out.println("1 - Adicionar número");
            System.out.println("2 - Listar números");
            System.out.println("3 - Remover número");
            System.out.println("4 - Ver vagas restantes");
            System.out.println("5 - Sair");

            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("\nInclusão de número:");

                    if (ex4.isFull()) {
                        System.out.println("Vetor cheio.");
                    } else {
                        System.out.print("Digite o número: ");
                        int num = sc.nextInt();

                        int posicao = -1;

                        while(posicao < 0 || posicao > count) {
                            System.out.printf("Escolha a posição (0 a %d) para inserir: ", count);
                            posicao = sc.nextInt();

                        }
                        ex4.insereMeio(num, posicao);
                        System.out.println("\nNúmero adicionado com sucesso!");
                    }

                    break;
                case 2:
                    System.out.println("\nListagem de números:\n");

                    if (ex4.isEmpty()) {
                        System.out.println("Vetor vazio.");
                    } else {
                        ex4.print();
                    }

                    break;
                case 3:
                    System.out.println("\nExclusão:");

                    if (ex4.isEmpty()) {
                        System.out.println("Vetor vazio.");
                    } else {
                        int posicao = -1;
                        while(posicao < 0 || posicao >= count) {
                            System.out.printf("Escolha a posição (0 a %d) para excluir: ", count - 1);
                            posicao = sc.nextInt();
                        }
                        ex4.removeMeio(posicao);
                        System.out.println("\nNúmero excluído com sucesso!");
                    }

                    break;
                case 4:
                    System.out.println("\nVagas restantes: " + ex4.remaining());
                    break;
                case 5:
                    System.out.println("\nSaindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Digite uma opção válida.");
            }

        } while (op != 5);

        sc.close();
    }

    public boolean isFull() {
        return remaining() == 0;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public int remaining() {
        return vet.length - count;
    }

    public void print() {
        for (int i = 0; i < count; i++)
            System.out.println(vet[i]);
    }

    public void insereMeio(int num, int posicao) {
        for (int i = count; i > posicao; i--)
            vet[i] = vet[i - 1];
        vet[posicao] = num;
        count++;
    }

    public void removeMeio(int posicao) {
        for (int i = posicao; i < count - 1; i++)
            vet[i] = vet[i + 1];
        count--;
    }
}
