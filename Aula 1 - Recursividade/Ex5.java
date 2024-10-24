import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = -1;
        int n2 = -1;

        n1 = sc.nextInt();
        n2 = sc.nextInt();

        try {
            System.out.println(recur(n1, n2));
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        }

        sc.close();
    }

    public static int recur(int n1, int n2) throws Exception {
       if ((n1 >= n2) && (n1 % n2 == 0))
            return n2;
        else if(n1 < n2)
            return recur(n2, n1);
        else if(n1 < 1 || n2 < 1)
            throw new Exception("Digite número maiores que zero.");
        else
            return recur(n2, n1 % n2);
    }
}
