import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BackEnd back = new BackEnd();

        int op = -1;
        System.out.println("BACKJACK BUGADO/ESTRANHO/MODIFICADO");

        System.out.println("1 - Jogar");
        System.out.println("2 - Sair");

        op = sc.nextInt();

        sc.nextLine();

        switch(op) {
            case 1:
                System.out.println("PLAYER 1");
                boolean choice = true;

                System.out.println("Sua primeira carta é: " + back.push(1));
                System.out.println("Sua segunda carta é: " + back.push(1));

                System.out.println("Sua pontuação inicial é " + back.getScore(1));

                while(choice) {
                    System.out.println("Gostaria de sortear outra carta?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");

                    int op1 = sc.nextInt();
                    sc.nextLine();

                    int num = 1;

                    switch(op1) {
                        case 1:
                            System.out.println("Sua carta " + ++num + " é " + back.push(1) + ".");
                            System.out.println("Sua pontuação atual é " + back.getScore(1) + ".");

                            if(back.getScore(1) > 21) {
                                back.penalidade(1);
                                System.out.println("ESTOUROU 21.");
                                try {
                                    System.out.println("A sua ultima carta de valor " + back.pop(1) + " será retirada e também receberá uma penalidade de 5 pontos.");
                                    System.out.println("A sua nova pontuação é " + back.getScore(1) + " pontos.");
                                    choice = false;
                                } catch(Exception ex) {
                                    System.out.println(ex.getMessage());
                                }
                            }
                            op = -1;
                            break;
                        case 2:
                            choice = false;
                            break;
                        default:
                            System.out.println("Digite uma opção válida.");
                            op1 = -1;
                            break;
                    }
                }

                System.out.println("PLAYER 2");
                choice = true;

                System.out.println("Sua primeira carta é: " + back.push(2));
                System.out.println("Sua segunda carta é: " + back.push(2));

                System.out.println("Sua pontuação inicial é " + back.getScore(2));

                while(choice) {
                    System.out.println("Gostaria de sortear outra carta?");
                    System.out.println("1 - Sim");
                    System.out.println("2 - Não");

                    int op1 = sc.nextInt();
                    sc.nextLine();

                    int num = 1;

                    switch(op1) {
                        case 1:
                            System.out.println("Sua carta " + ++num + " é " + back.push(2) + ".");
                            System.out.println("Sua pontuação atual é " + back.getScore(2) + ".");

                            if(back.getScore(2) > 21) {
                                back.penalidade(2);
                                System.out.println("ESTOUROU 21.");
                                try {
                                    System.out.println("A sua ultima carta de valor " + back.pop(2) + " será retirada e também receberá uma penalidade de 5 pontos.");
                                    System.out.println("A sua nova pontuação é " + back.getScore(2) + " pontos.");
                                    choice = false;
                                } catch(Exception ex) {
                                    System.out.println(ex.getMessage());
                                }
                            }
                            op = -1;
                            break;
                        case 2:
                            choice = false;
                            break;
                        default:
                            System.out.println("Digite uma opção válida.");
                            op1 = -1;
                            break;
                    }
                }

                if(back.winner() == 1) {
                    System.out.println("O vencedor é o PLAYER " + back.winner() + "!");
                    System.out.println("Pontuação: " + back.getScore(back.winner()));
                    System.out.println("Suas cartas foram: ");
                    int array[] = back.print(back.winner());
                    for(int i = 0; i < array.length; ++i)
                        System.out.println(array[i]);

                } else if(back.winner() == 2) {
                    System.out.println("O vencedor é o PLAYER " + back.winner() + "!");
                    System.out.println("Pontuação: " + back.getScore(back.winner()));
                    System.out.println("Suas cartas foram: ");
                    int array[] = back.print(back.winner());
                    for(int i = 0; i < array.length; ++i)
                        System.out.println(array[i]);

                } else {
                    System.out.println("Houve um EMPATE!");
                    System.out.println("Ambas as pontuações foram " + back.getScore(1));
                }

                op = -1;
                break;
            case 2:
                System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nSaindo...");
                System.exit(0);
                break;
            default:
                System.out.println("Digite uma opção válida.");
                op = -1;
                break;
        }
    }
}
