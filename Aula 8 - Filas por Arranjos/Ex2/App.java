import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Fila queue = new Fila();
        Scanner sc = new Scanner(System.in);
        int op = 0;

        while(op == 0) {
            System.out.println("FILA DE PROCESSOS");
            System.out.println("1 - Incluir processo;");
            System.out.println("2 - Retirar processo com mais tempo de espera;");
            System.out.println("3 - Imprimir fila;");
            System.out.println("4 - Localizar processo;");
            System.out.println("5 - Limpar fila de processos;");
            System.out.println("6 - Sair.");

            op = sc.nextInt();

            sc.nextLine();

            switch(op) {
                case 1:
                    try {
                        System.out.println("Identificação: ");
                        int id = sc.nextInt();

                        sc.nextLine();

                        System.out.println("Nome: ");
                        String nome = sc.nextLine();

                        queue.addHandler(new Processo(id, nome));

                        System.out.println("Processo adicionado com sucesso!");
                    } catch(Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    op = 0;
                    break;

                case 2:
                    try {
                        Processo tmp = queue.remove();

                        System.out.println(tmp.id);
                        System.out.println(tmp.nome);
                    } catch(Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    op = 0;
                    break;

                case 3:
                    try {
                        Processo array[] = queue.print();
                        for(int i = 0; i < array.length; ++i) {
                            System.out.println(array[i].id);
                            System.out.println(array[i].nome);
                            System.out.println("\n");
                        }
                    } catch(Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    op = 0;
                    break;

                case 4:
                    try {
                        System.out.println("Id: ");
                        int id = sc.nextInt();

                        sc.nextLine();

                        int resultado = queue.search(id);

                        if (resultado == -1)
                            System.out.println("Processo não encontrado.");
                        else 
                            System.out.println("Processo na posição " + resultado);
                    } catch(Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    op = 0;
                    break;
                case 5:
                    queue.clear();
                    System.out.println("Limpo!");
                    op = 0;
                    break;
                case 6:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Digite uma opção válida, por favor.");
                    op = 0;
                    break;
            }
        }

        sc.close();
    }
}
