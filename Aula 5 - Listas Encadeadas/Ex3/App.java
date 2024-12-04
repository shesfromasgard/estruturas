import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lista lista = new Lista();

        int op = -1;

        while(op != 4) {
            System.out.println("\n\nMENU DETRAN");

            System.out.println("1 - Adicionar veículo;");
            System.out.println("2 - Excluir veículo;");
            System.out.println("3 - Listar veículos;");
            System.out.println("4 - Sair.");

            op = sc.nextInt();

            sc.nextLine();

            switch(op) {
                case 1:
                    try {
                        System.out.println("\n\nADICIONAR VEÍCULO");
        
                        System.out.println("\nPlaca:");
                        String placa = sc.nextLine();
        
                        System.out.println("\nMarca: ");
                        String marca = sc.nextLine();
        
                        System.out.println("\nModelo:");
                        String modelo = sc.nextLine();
        
                        System.out.println("\nValor: ");
                        float valor = sc.nextFloat();
        
                        sc.nextLine();

                        Veiculo veiculo = new Veiculo(placa.toUpperCase(), marca.toUpperCase(), modelo.toUpperCase(), valor);

                        lista.add(veiculo);

                        System.out.println("\nVeículo cadastrado com sucesso!");

                    } catch(Exception ex) {
                        System.out.println(ex.getMessage());
                    }

                    op = -1;
                break;
                case 2:
                    try {
                        System.out.println("\n\nREMOVER VEÍCULO");
        
                        System.out.println("\nPlaca:");
                        String placa = sc.nextLine();

                        lista.remove(placa.toUpperCase());

                        System.out.println("\nVeículo removido com sucesso!");

                    } catch(Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    op = -1;
                break;
                case 3:
                    try {
                        lista.print();
                    } catch(Exception ex) {
                        System.out.println(ex.getMessage());
                    }

                    op = -1;
                break;
                case 4:
                    System.out.println("\n\n\n\n\n\n\n\n\n\nSaindo...");
                    System.exit(0);
                break;
                default:
                    System.out.println("\n\n\n\n\n\n\n\n\n\nDigite uma opção válida.");
                    op = -1;
                break;
            }
        }

        sc.close();

    }
}
