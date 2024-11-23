import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ListaFilmes lista = new ListaFilmes();
        int op = 0;

        while(op != -1) {
            System.out.println("\n\nMENU");
            System.out.println("1 - Buscar filmes;");
            System.out.println("2 - Adicionar filmes;");
            System.out.println("3 - Excluir filmes;");
            System.out.println("4 - Aumentar capacidade");
            System.out.println("5 - Sair");

            op = sc.nextInt();
            sc.nextLine();

            switch(op) {
                case 1:
                    try {
                        System.out.println("\n\nBUSCADOR DE FILMES");
                        System.out.println("Digite o nome do filme: ");

                        String busca = sc.nextLine();
                        
                        Filme resultado = lista.search(busca);

                        System.out.println("\nFilme encontrado!");
                        System.out.println("\nCódigo: " + resultado.codigo);
                        System.out.println("Nome: " + resultado.nome);
                        System.out.println("Gênero: " + resultado.genero);

                        op = 0;
                        
                    } catch(Exception ex) {
                        System.out.println(ex.getMessage());
                    }

                    break;
                case 2:
                    try {
                        System.out.println("\n\nADICIONAR FILMES");

                        System.out.println("\nDigite o nome do filme: ");
                        String nome = sc.nextLine();
                        System.out.println("\nDigite o gênero do filme: ");
                        String genero = sc.nextLine();

                        lista.add(nome, genero);

                        System.out.println("\nFilme adicionado com sucesso!");
                    } catch(Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println("\n\nEXCLUIR FILMES");
    
                        System.out.println("\nDigite o código do filme que deseja excluir: ");
                        int codigo = sc.nextInt();
    
                        lista.remove(codigo);

                        System.out.println("Filme removido com sucesso!");

                    } catch(Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                case 4:

                    try {

                        System.out.println("\n\nREDIMENCIONAR VETOR");

                        System.out.println("Digite o novo tamanho do vetor");
                        int tamanho = sc.nextInt();

                        lista.rearrange(tamanho);

                    } catch(Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;

                case 5:
                    System.out.println("Saindo...");
                    System.exit(0);

                default:
                    System.out.println("Digite uma opção válida.");
                    break;
            }
        }
        sc.close();
    }
}
