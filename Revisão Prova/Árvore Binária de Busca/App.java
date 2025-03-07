import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Back back = new Back();

        for(int i = 0; i < 10; ++i)
            back.add((int) (Math.random() * 101));
        
        back.inOrder();

        System.out.println("");

        int n = sc.nextInt();
        back.remove(n);

        back.inOrder();

        System.out.println("");

        n = sc.nextInt();
        System.out.println(back.search(n));

        sc.close();
    }
}
