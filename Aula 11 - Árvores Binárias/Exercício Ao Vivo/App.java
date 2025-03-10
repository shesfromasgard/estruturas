import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Back back = new Back();
        
        int n = -1;
        
        while(n != 0) {    
            n = sc.nextInt();

            if(n == 0)
                System.exit(0);
        
            for(int i = 0; i < n; ++i) {
                int y = sc.nextInt();
    
                float t = sc.nextFloat();
    
                back.add(y, t);
            }
            int m = sc.nextInt();
    
            for(int i = 0; i < m; ++i){
                int y = sc.nextInt();
    
                System.out.println(back.isMax(y));
            }

            back.clear();

        }


        sc.close();
    }
}
