import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = -1;

        n = sc.nextInt();

        try {
            System.out.println(recur(n));
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        sc.close();
    }
    public static long recur(int n) throws Exception {
        if(n == 0)
            return 1;
        else if(n < 0)
            throw new Exception("Digite um número positivo. Aceitamos o zero!(só nesse");
        else if(n == 1)
            return 2;
        else
            return 2 * recur(n - 1);
    }
}
