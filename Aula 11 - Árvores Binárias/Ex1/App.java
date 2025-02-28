import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Back back = new Back();

        for(int i = 0; i < 10; ++i) {
            int matricula = sc.nextInt();

            sc.nextLine();

            String nome = sc.nextLine();

            String curso = sc.nextLine();

            back.add(matricula, nome, curso);
        }

        try {
            System.out.println(back.max());

            int matricula = sc.nextInt();

            System.out.println(back.search(matricula));

            back.preOrdem();

            matricula = sc.nextInt();

            back.remove(matricula);
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        sc.close();

    }
}
