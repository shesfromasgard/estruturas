import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = -1;
        int n2 = -1;

        while(n1 < 0)
            n1 = sc.nextInt();
        
        while(n2 < 0)
            n2 = sc.nextInt();

        System.out.println(recur(n1, n2));

        sc.close();
    }

    public static int recur(int n1, int n2) {
       if ((n1 >= n2) && (n1 % n2 == 0))
            return n2;
        else if(n1 < n2)
            return recur(n2, n1)
        else
            return recur(n2, n1 % n2);
    }
}
