import java.util.Scanner;

public class App {
    static Lista lista = new Lista();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int op = -1;

        while(op != 5) {
            System.out.println("\n\nCONCURSO XXX");

            System.out.println("1 - Adicionar candidato;");
            System.out.println("2 - Consultar notas;");
            System.out.println("3 - Excluir candidato;");
            System.out.println("4 - Exibir todos os candidatos;");
            System.out.println("5 - Sair.");

            op = sc.nextInt();

            sc.nextLine();

            switch(op) {
                case 1: 
                    System.out.println("\nADICIONAR CANDIDATO");
                    try {
                        System.out.println("Nome: ");
                        String nome = sc.nextLine();
                        System.out.println("Nota: ");
                        float nota = sc.nextFloat();

                        sc.nextLine();

                        lista.add(nome, nota);

                        System.out.println("Candidato adicionado com sucesso!\n");

                    } catch(Exception ex) {
                        System.out.println(ex.getMessage() + "\n");
                    }
                    op = -1;


                break;
                case 2:
                    System.out.println("CONSULTAR NOTAS");

                    try {
                        System.out.println("Digite o nome do candidato: ");
                        String nome = sc.nextLine();

                        Candidato vet[] = lista.search(nome);

                        for(int i = 0; i < vet.length; ++i) {
                            System.out.println("Inscrição: " + vet[i].getInscricao() + "  |  Nome: " + vet[i].getNome() + "  |  Nota: " + vet[i].getNota());
                        }op = -1;
                    } catch(Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    op = -1;
                break;
                case 3:op = -1;
                    System.out.println("EXCLUIR CANDIDATO");

                    try {
                        System.out.println("Digite o número de inscrição do candidato: ");
                        int inscricao = sc.nextInt();

                        sc.nextLine();

                        lista.remove(inscricao);

                        System.out.println("Candidato excluído com sucesso!");
                    } catch(Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    op = -1;
                break;
                case 4:
                    System.out.println("TODOS OS CANDIDATOS");
                    try {
                        lista.print();
                    } catch(Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    op = -1;
                break;
                case 5:
                    System.out.println("Saindo...");
                    System.exit(0);
                break;
                default:
                    System.out.println("Digite uma opção válida.");
                    op = -1;
                break;
            }
        }

        sc.close();
        
    }
}
