import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Back back = new Back();

        while(true) {
            System.out.println("CADASTRO DE TIMES BRASILEIRÃO");

            System.out.println("1 - Cadastrar;");
            System.out.println("2 - Consultar");
            System.out.println("3 - Sair.");

            int op = sc.nextInt();

            sc.nextLine();

            switch(op) {
                case 1:
                    System.out.println("CADASTRO");

                    System.out.println("\nCódigo: ");
                    String codigo = sc.nextLine();

                    System.out.println("Nome: ");
                    String nome = sc.nextLine();

                    System.out.println("Ano de fundação: ");
                    int ano =  sc.nextInt();

                    sc.nextLine();

                    System.out.println("Presidente: ");
                    String presidente = sc.nextLine();

                    System.out.println("Técnico: ");
                    String tecnico = sc.nextLine();

                    back.put(new Time(codigo, nome, ano, presidente, tecnico));

                    System.out.println("Time cadastrado com sucesso!");
                break;
                case 2:
                    System.out.println("CONSULTA");

                    System.out.println("\nCódigo: ");
                    String id = sc.nextLine();

                    Time tmp = back.get(id);

                    if(tmp == null)
                        System.out.println("Time não encontrado.");
                    else
                        System.out.println("Código: " + tmp.codigo + " | Nome: " + tmp.nome + " | " + "Ano de fundação: " + tmp.anoFundacao + " | Presidente: " + tmp.presidente + " | Técnico: " + tmp.tecnico);
                break;
                case 3:
                    try {
                        if (System.getProperty("os.name").contains("Windows"))
                            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                        else
                            Runtime.getRuntime().exec("clear");
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    System.out.println("Saindo...");
                    System.exit(0);
                break;
                default:
                    System.out.println("Digite uma opção válida.");
                    break;
            }

        }

    }
}
