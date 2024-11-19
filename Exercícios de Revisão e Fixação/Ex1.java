import java.util.Scanner;

public class Ex1 {
    static int vet1[] = new int[10];
    static int vet2[] = new int[10];
    static int vet3[] = new int[20];

    static int size1 = 0;
    static int size2 = 0;
    static int size3 = 0;

    public static void add1(int value) throws Exception {
        if (size1 == vet1.length) {
            throw new Exception("Vetor cheio.");
        } else {
            int i = size1 - 1;
    
            while (i >= 0 && vet1[i] > value) {
                vet1[i + 1] = vet1[i];
            }

            vet1[i + 1] = value;
            size1++;
        }
    }
    public static void add2(int value) throws Exception {
        if (size2 == vet2.length) {
            throw new Exception("Vetor cheio.");
        } else {
            int i = size2 - 1;
    
            while (i >= 0 && vet2[i] > value) {
                vet2[i + 1] = vet2[i];
            }

            vet2[i + 1] = value;
            size2++;
        }
    }
    
    public static void merge() throws Exception {
        int i = 0, j = 0, k = 0;

        while(i < size1 && j < size2) {
            if(vet1[i] <= vet2[j])
                vet3[k++] = vet1[i++];
            else
                vet3[k++] = vet2[j++];
        }

        while(i < size1)
            vet3[k++] = vet1[i++];

        while(j < size2)
            vet3[k++] = vet2[j++];

        size3 = k;

    }

    public static void print(int vet[], int size) {
        for(int i = 0; i < size; ++i)
            System.out.println(vet[i]);
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int op = -1;

        while(op != 4) {
            System.out.println("O que deseja fazer?");
            System.out.println("1 - Adicionar número");
            System.out.println("2 - Imprimir vetor");
            System.out.println("3 - Mesclar vetores");
            System.out.println("4 - Sair");

            op = sc.nextInt();

            switch(op) {
                case 1:
                    int op1 = -1;
                        while(op != 3) {
                            System.out.println("Em qual vetor gostaria de inserir?");
                            System.out.println("1 - Primeiro vetor");
                            System.out.println("2 - Segundo vetor");
                            System.out.println("3 - Cancelar");
                            System.out.println("4 - Sair");

                            op1 = sc.nextInt();

                            switch(op1) {
                                case 1:
                                    if(size1 >= vet1.length) {
                                        System.out.println("Vetor cheio");
                                    } else {
                                        System.out.println("Digite o número que deseja inserir no vetor 1:");
                                        int value = sc.nextInt();
                                        add1(value);
                                        System.out.println("Número inserido com sucesso!");
                                    }
            
                                    op1 = 3;
                                    op = 3;
                                    break;
                                case 2:
                                    if(size2 >= vet2.length) {
                                        System.out.println("Vetor cheio");
                                    } else {
                                        System.out.println("Digite o número que deseja inserir no vetor 2:");
                                        int value = sc.nextInt();
                                        add2(value);
                                        System.out.println("Número inserido com sucesso!");
                                    }
                                    op1 = 3;
                                    op = 3;
                                    break;
                                case 3:
                                    
                                break;
                                case 4:
                                    System.out.println("Saindo...");
                                    System.exit(0);
                                    break;
                                default:
                                    System.out.println("Digite uma opção válida");
                            }
                        }
                    break;
                case 2:
                    int op2 = -1;
                    while(op2 != 4) {
                        System.out.println("Qual vetor deseja imprimir?");
                        System.out.println("1 - Primeiro vetor");
                        System.out.println("2 - Segundo vetor");
                        System.out.println("3 - Terceiro vetor");
                        System.out.println("4 - Cancelar");
                        System.out.println("5 - Sair");

                        op2 = sc.nextInt();

                        switch(op2) {
                            case 1:
                                if(size1 == 0)
                                    System.out.println("Vetor vazio.");
                                else {
                                    System.out.println("VETOR 1");
                                    print(vet1, size1);
                                }
                                break;
                            case 2:
                                if(size2 == 0)
                                    System.out.println("Vetor vazio.");
                                else {
                                    System.out.println("VETOR 2");
                                    print(vet2, size2);
                                }
                            break;
                            case 3:
                                if(size3 == 0)
                                    System.out.println("Vetor vazio.");
                                else {
                                    System.out.println("VETOR 3");
                                    print(vet3, size3);
                                }
                            break;
                            case 4:
                            break;
                            case 5:
                                System.out.println("Saindo...");
                                System.exit(0);
                                break;
                            default:
                                System.out.println("Digite uma opção válida.");
                        }

                    }
                    break;
                case 3:
                    if(size1 == 0 && size2 == 0) {
                        System.out.println("Vetores vazios.");
                    } else 
                        merge();
                        print(vet3, size3);
                    break;
                case 4:
                    System.out.println("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Digite uma opção válida.");
            }
        }

        sc.close();
    }
}
