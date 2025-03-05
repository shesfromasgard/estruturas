import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Back back = new Back();

        int n = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < n; ++i) {
            int m = sc.nextInt();
            sc.nextLine();

            back.add(m);
        }

        ArrayList<Integer> array = back.paradaLa();

        for(int i = 0; i < array.size(); ++i)
            System.out.println(i + " " + array.get(i));

        sc.close();
    }
}
