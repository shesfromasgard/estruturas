import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Fila queue = new Fila();
        Scanner sc = new Scanner(System.in);
        int op = 0;

        while(op == 0) {
            System.out.println("DISTRIBUIDOR DE SENHAS");
            System.out.println("1 - Criar senha;");
            System.out.println("2 - Chamar pessoa;");

            op = sc.nextInt();

            sc.nextLine();

            switch(op) {
                case 1:
                    if(queue.isFull())
                        System.out.println("Fila cheia.");
                    else {
                        try {
                            System.out.println("Nome: ");
                            String nome = sc.nextLine();

                            queue.add(nome);

                            System.out.println("Senha cadastrada com sucesso!");
                        } catch(Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    op = 0;
                break;
                case 2:
                    if(queue.isEmpty())
                        System.out.println("Não há senhas cadastradas.");
                    else {
                        try {
                            Senha tmp = queue.remove();

                            System.out.println("Número: " + tmp.senha);
                            System.out.println("Nome: " + tmp.nome);
                        } catch(Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    }
                    op = 0;
                break;
                case 3:
                    System.out.println("Saindo...");
                    System.exit(0);
                break;
                default:
                    System.out.println("Digite uma opção válida.");
                    op = 0;
                break;
            }

        }


        sc.close();
    }
}
