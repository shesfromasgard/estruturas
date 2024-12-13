import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Back back = new Back();

        while (true) { 
            int n = sc.nextInt();

            if(n == 0)
                break;

            char array[] = new char[n];

            for(int i = 0; i < n; ++i)
                array[i] = sc.next().charAt(0);

            char array1[] = new char[n];

            for(int i = 0; i < n; ++i)
                array1[i] = sc.next().charAt(0);

            System.out.println(back.check(n, array, array1));
            back.clear();

        }

        sc.close();
    }
}
