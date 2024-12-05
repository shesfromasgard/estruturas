import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Lista lista = new Lista();
        Scanner sc = new Scanner(System.in);

        int op = -1;

        while(op != 4) {
            System.out.println("\n\n MENU CIDADES");

            System.out.println("\n1 - Adicionar cidade;");
            System.out.println("\n2 - Excluir cidade;");
            System.out.println("\n3 - Exibir cidades;");
            System.out.println("\n4 - Sair.");

            op = sc.nextInt();

            sc.nextLine();

            switch(op) {
                case 1:
                    try {
                        float nota = -1;
    
                        System.out.println("\n\nADICIONAR CIDADE");
    
                        System.out.println("\nNome: ");
                        String nome = sc.nextLine();
    
                        System.out.println("\nPaís: ");
                        String pais = sc.nextLine();
    
                        System.out.println("\nPrincipais atrações: ");
                        String atracoes = sc.nextLine();
    
                        while(nota < 0 || nota > 10) {
                            System.out.println("\nNota(0 a 10): ");
                            nota = sc.nextFloat();

                            if(nota < 0 || nota > 10) {
                                System.out.println("\nDigite uma nota entre 0 e 10.");
                            }
                        }
                        sc.nextLine();

                        Cidade c = new Cidade(nome.toUpperCase(), pais.toUpperCase(), atracoes.toUpperCase(), nota);

                        lista.add(c);

                        System.out.println("Cidade adicionada com sucesso!");

                    } catch(Exception ex) {
                        System.out.println(ex.getMessage());
                    }

                    op = -1;
                break;
                case 2:
                    try {
                        System.out.println("\n\nEXCLUIR CIDADE");

                        System.out.println("\nNome: ");
                        String nome = sc.nextLine();

                        System.out.println("\nPaís: ");
                        String pais = sc.nextLine();

                        lista.remove(nome.toUpperCase(), pais.toUpperCase());

                        System.out.println("Cidade excluída com sucesso!");
                    } catch(Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    op = -1;
                break;
                case 3:

                    try {
                        int op1 = -1;
                        int posicao = 0;
                        System.out.println("EXIBIR CANIDATOS");
    
                        while(op1 != 3) {
                            
                            Cidade c = lista.exibir(posicao);

                            System.out.println("\nNome: " + c.nome);
                            System.out.println("País: " + c.pais);
                            System.out.println("Atrações: " + c.atracoes);
                            System.out.println("Nota: " + c.nota);

                            System.out.println("1 - Anterior;");
                            System.out.println("2 - Próximo");

                            System.out.println("3 - Cancelar");

                            op1 = sc.nextInt();

                            sc.nextLine();

                            switch(op1) {
                                case 1:
                                    posicao--;
                                    if(posicao < 0)
                                        posicao = 0;
                                    op1 = -1;
                                break;
                                case 2:
                                    posicao++;
                                    if(posicao >= lista.tamanho())
                                        posicao = lista.tamanho() - 1;
                                    op1 = -1;
                                break;

                                case 3:
                                    op1 = 3;
                                break;
                                default:
                                    System.out.println("Digite uma opção válida.");
                                    op1 = -1;
                            
                            }
                        }

                    } catch(Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    op = -1;
                break;
                case 4:
                    System.out.println("\n\n\n\n\n\n\n\n\n\n\nSaindo...");
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
