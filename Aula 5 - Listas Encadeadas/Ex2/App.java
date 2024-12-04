import java.util.Scanner;

public class App {
    static Lista lista = new Lista();
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int op = -1;

        while(op != 3) {
            System.out.println("\nMENU\n");

            System.out.println("1 - Adicionar clientes;");
            System.out.println("2 - Exibir clientes");
            System.out.println("3 - Sair.");

            op = sc.nextInt();

            sc.nextLine();

            switch(op) {
                case 1:
                
                    try {
                        System.out.println("\n\nADICIONAR CLIENTE");
        
                        System.out.println("\nCódigo: ");
                        int codigo = sc.nextInt();
                        sc.nextLine();
        
                        System.out.println("\nNome: ");
                        String nome = sc.nextLine();
        
                        System.out.println("\nTelefone: ");
                        long telefone = sc.nextLong();

                        sc.nextLine();

                        lista.add(codigo, nome, telefone);

                        System.out.println("Cliente inserido com sucesso!");

                    } catch(Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    op = -1;
                break;
                case 2:

                    try {
                        System.out.println("\n\nEXIBIR CLIENTES\n");

                        System.out.println("Imprimir em: ");
                        System.out.println("1 - Ordem crescente;");
                        System.out.println("2 - Ordem decrescente.");

                        int op1 = sc.nextInt();

                        sc.nextLine();

                        while(op1 != 3) {
                            switch(op1) {
                                case 1:
                                    try {
                                        System.out.println("\nIMPRESSÃO CRESCENTE\n");
                                        lista.print();
                                        op1 = 3;
                                    } catch(Exception ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    break;
                                case 2:
                                    try {
                                        System.out.println("\nIMPRESSÃO DECRESCENTE\n");
                                        lista.print1();
                                        op1 = 3;
                                    } catch(Exception ex) {
                                        System.out.println(ex.getMessage());
                                    }
                                    break;
                                default:
                                System.out.println("Digite uma opção válida.");
                            }

                        }

                    } catch(Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    op = -1;
                break;
                case 3:
                    System.out.println("\n\n\n\n\n\n\n\nSaindo...");
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