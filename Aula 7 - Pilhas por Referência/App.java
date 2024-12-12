import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BackEnd back = new BackEnd();

        int op = -1;

        while(true) {
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

                    while(choice) {
                        System.out.println("Gostaria de sortear outra carta?");

                        int op1 = sc.nextInt();
                        sc.nextLine();

                        switch(op1) {
                            
                        }
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
}
