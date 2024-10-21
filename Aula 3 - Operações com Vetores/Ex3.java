import java.util.Scanner;

public class Ex3 {

    String vet[] = new String[10];
    int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Ex3 ex3 = new Ex3();

        int op;

        do {

            System.out.println("\nMenu: ");
            System.out.println("1 - Adicionar convidado;");
            System.out.println("2 - Listar convidados;");
            System.out.println("3 - Remover convidado");
            System.out.println("4 - Ver vagas restantes");
            System.out.println("5 - Sair");

            op = sc.nextInt();
            sc.nextLine();

            switch(op) {

                case 1:
                    System.out.println("\nInclusão de candidato: ");

                    if(ex3.isFull()) {
                        System.out.println("Vetor cheio.");
                        break;
                    } else {
                        System.out.println("Digite o nome do candidato: ");
                        String nome = sc.nextLine();
                        ex3.add(nome);
                        System.out.println("\nCandidato adicionado com sucesso!");
                    }

                    break;
                case 2:
                    System.out.println("\n Listagem de candidatos:\n");

                    if(ex3.isEmpty())
                        System.out.println("Vetor vazio.");
                    else
                        ex3.print();

                    break;
                case 3:
                    System.out.println("\nExclusão de candidato:");

                    if (ex3.isEmpty())
                        System.out.println("Vetor vazio.");
                    else {
                        System.out.println("Digite o nome do candidato: ");
                        String nome = sc.nextLine();
                        if(ex3.search(nome)) {
                            ex3.remove(nome);
                            System.out.println("\nCandidato excluído com sucesso!");
                        } else
                            System.out.println("\nCandidato não encontrado.");
                    }

                    break;
                case 4:
                    System.out.println("\nVagas restantes: " + ex3.remaining());
                    break;
                case 5:
                    System.out.println("\nSaindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Digite uma opção válida.");
            }

        } while(op != 5);

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
        for(int i = 0; i < count; i++)
            System.out.println(vet[i]);
    }

    public void add(String nome) {
        vet[count] = nome;
        count++;
    }

    public void remove(String nome) {
        for (int i = 0; i < count; i++) {
            if (vet[i].equals(nome)) {
                for (int j = i; j < count - 1; j++)
                    vet[j] = vet[j + 1];
                vet[count - 1] = null;
                count--;
                break;
            }
        }
    }

    public boolean search(String nome) {
        for(int i = 0; i < count; i++) {
            if(vet[i].equals(nome))
                return true;
        }
        return false;
    }
}
