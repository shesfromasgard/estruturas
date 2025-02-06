import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Back back = new Back();

        while(true) {
            System.out.println("\nBanco do IF - Setor de Financiamentos");

            System.out.println("1 - Negociação de financiamentos");
            System.out.println("2 - Pagamento de parcelas;");
            System.out.println("3 - Sair");

            int op = sc.nextInt();

            sc.nextLine();

            switch(op) {
                case 1:
                    System.out.println("NEGOCIAÇÃO DE FINANCIAMENTOS");
                    if(!back.isEmpty())
                        System.out.println("Pague todas as parcelas do seu financiamento pendente.");
                    else {
                        System.out.println("Valor a financiar: ");
                        float montante = sc.nextFloat();

                        sc.nextLine();

                        System.out.println("Número de parcelas: ");
                        int parcelas = sc.nextInt();

                        sc.nextLine();

                        System.out.println("O valor com juros do seu financiamento seria de: " + back.calc(montante, parcelas));

                        int op1 = 0;
                        while(op1 == 0) {
                            System.out.println("Deseja realmente contratar esse financiamento?");
                            System.out.println("1 - Sim;");
                            System.out.println("2 - Não.");
    
                            op1 = sc.nextInt();
    
                            switch(op1) {
                                case 1:
                                    back.add(parcelas, montante);
                                    System.out.println("Financiamento contratado com sucesso!");
                                break;
                                case 2:
                                    System.out.println("Obrigado pelo interesse em nossos serviços. Volte sempre!");
                                break;
                                default:
                                    System.out.println("Digite uma opção válida.");
                                    op = 0;
                                    break;
                            }
                        }

                    }
                break;
                case 2:
                    System.out.println("PAGAMENTO DE PARCELAS");
                        if(back.isEmpty())
                            System.out.println("Não há parcelas a serem pagas.");
                        else {
                            System.out.println("Você tem uma dívida de R$" + back.getDivida());
                            if(back.getSize() == 1) {
                                System.out.println("Deseja pagar sua última parcela?");
                                try {
                                    Parcela tmp = back.getFirst();
                                    System.out.println("Valor da parcela: R$" + (tmp.valor * tmp.juros));
                                    System.out.println("1 - Sim;");
                                    System.out.println("2 - Sair.");
    
                                    int op2 = sc.nextInt();
    
                                    sc.nextLine();
    
                                    switch(op2) {
                                        case 1:
                                            back.removeFirst();
                                            System.out.println("Financiamento quitado!");
                                        break;
                                        case 2:
                                            System.out.println("Tá bom, caloteiro.");
                                        break;
                                        default:
                                            System.out.println("Digite um valor válido.");
                                    }
                                } catch(Exception ex) {
                                    System.out.println(ex.getMessage());
                                }
                            } else {
                                try {
                                    Parcela tmp1 = back.getFirst();
                                    Parcela tmp2 = back.getLast();
                                    System.out.println("Deseja pagar a próxima parcela ou abater a última parcela disponível?");
                                    System.out.println("1 - Próxima parcela (R$" + (tmp1.valor + tmp1.juros) + ")");
                                    System.out.println("2 - Última parcela (R$ " + tmp2.valor + ")");

                                    int op3 = sc.nextInt();

                                    sc.nextLine();

                                    switch(op3) {
                                        case 1:
                                            back.removeFirst();
                                            System.out.println("Parcela " + tmp1.mes + " quitada!");
                                            System.out.println("Há " + back.getSize() + " parcela(s) a serem pagas.");
                                            break;
                                        case 2:
                                            back.removeLast();
                                            System.out.println("Parcela " + tmp2.mes + " quitada!");
                                            System.out.println("Há " + back.getSize() + " parcela(s) a serem pagas.");
                                            break;
                                        default:
                                            System.out.println("Digite uma opção válida.");
                                    }

                                } catch(Exception ex) {
                                    System.out.println(ex.getMessage());
                                }

                            }
                        }
                break;
                case 3:
                    if(!back.isEmpty())
                        System.out.println("Pague todas as suas parcelas antes de fechar o programa.");
                    else {
                        System.out.println("Agradeçemos pela confiança.\nSaindo...");
                        System.exit(0);
                    }
                break;
                default:
                    System.out.println("Digite uma opção válida.");
                    break;
            }
        }
    }
}
